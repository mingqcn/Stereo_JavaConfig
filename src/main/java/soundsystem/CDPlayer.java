package soundsystem;

public class CDPlayer implements MediaPlayer {
  private CompactDisc cd;
  String name;

  public CDPlayer(CompactDisc cd, String name) {
    this.cd = cd;
    this.name = name;
  }

  public String play() {
    return name +" is " + cd.play();
  }

}
