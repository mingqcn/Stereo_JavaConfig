package soundsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application {
	
	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
	}
	
	  @Bean
	  public CompactDisc sgtPeppers() {
	    return new SgtPeppers();
	  }
	  
	  @Bean
	  public CDPlayer cdPlayer() {
	    return new CDPlayer(sgtPeppers(), "CD1");
	  }

	  @Bean
	  public CDPlayer anotherCDPlayer() {
	    return new CDPlayer(sgtPeppers(), "CD2");
	  }
}
