package soundsystem;


public class SgtPeppers implements CompactDisc {

  private String title = "Sgt. Pepper's Lonely Hearts Club Band";  
  private String artist = "The Beatles";
  
  public String play() {
    return "playing " + title + " by " + artist;
  }

}
