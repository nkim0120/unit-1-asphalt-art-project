import org.code.neighborhood.*;

public class ShadowPainter extends CombBeakAndFeetPainter {

/*
 * Has the ShadowPainter object paint the shadow of the chicken body
 */
  public void paintShadow(String color) {

  //Sets the paint to the correct amount
    setPaint(40);

  //Moves the object to the starting paint location
    moveToStart4();

  //Has the object paint the shadow of the chicken
    paint(color);
    shuffleRight();
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    move();
    paintAndMove(color);
    paintAndMove(color);
    turnAround();
    shuffleRight();
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paint(color);
    shuffleRight();
    turnAround();
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paint(color);
    shuffleLeft();
    turnAround();
    paintAndMove(color);
    paint(color);
    turnAround();
    move();
    turnLeft();
    move();
    paintAndMove(color);
    paintAndMove(color);
    paint(color);
    turnAround();
    move();
    move();
    shuffleLeft();
    turnAround();
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    shuffleLeft();
    paintAndMove(color);
    paintAndMove(color);
    turnLeft();
    move();
    paintAndMove(color);
    move();
    move();
    paintAndMove(color);
    move();
    move();
    move();
    move();
    turnLeft();
    move();
    paintAndMove(color);
    move();
    move();
    move();
    paintAndMove(color);
    turnLeft();
    move();
    move();
    move();
    paint(color);
    shuffleRight();
    move();
    paintAndMove(color);
    paintAndMove(color);
    paint(color);
    turnAround();
    shuffleLeft();
    paintAndMove(color);
    move();
    paintAndMove(color);
    shuffleLeft();
    shuffleLeft();
    paint(color);
    turnAround();

  //Moves the object to the bottom left
    while (canMove()) {
      move();
    }
    turnRight();
    while (canMove()) {
      move();
    }
  }

/*
 * Moves the object to the starting paint location
 */
  public void moveToStart4() {
    turnRight();
    for (int i = 0; i < 5; i++) {
      move();
    }
    shuffleLeft();
    shuffleLeft();
  }
}