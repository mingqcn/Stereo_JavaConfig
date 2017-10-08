package soundsystem;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CDPlayerTest {

  @Autowired
  @Qualifier("cdPlayer")
  private MediaPlayer cdplayer1;

  @Autowired
  @Qualifier("anotherCDPlayer")
  private MediaPlayer cdplayer2;

  
  @Test
  public void playCDPlayer() {
    assertEquals(
        "CD1 is playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles", 
        cdplayer1.play());
  }

  @Test
  public void playCDPlayer2() {
    assertEquals(
        "CD2 is playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles", 
        cdplayer2.play());
  }

}
