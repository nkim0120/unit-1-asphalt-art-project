import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    BackgroundPainter nate1 = new BackgroundPainter();
    nate1.setPaint(1000);
    nate1.paintBackground("LightSkyBlue");

    ChickenOutlinePainter nate2 = new ChickenOutlinePainter();
    nate2.paintOutline("black");

    CombBeakAndFeetPainter nate3 = new CombBeakAndFeetPainter();
    nate3.paintComb("Crimson");
    nate3.paintBeakAndFeet("Gold");

    ShadowPainter nate4 = new ShadowPainter();
    nate4.paintShadow("Silver");

    BodyPainter nate5 = new BodyPainter();
    nate5.paintBody("white");

    WingPainter nate6 = new WingPainter();
    nate6.paintWing("black");
  }
}