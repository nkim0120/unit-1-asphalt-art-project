import org.code.neighborhood.*;

public class BodyPainter extends CombBeakAndFeetPainter {

/*
 * Has the BodyPainter object paint the main body of the chicken (not the shadow though)
 */
  public void paintBody(String color) {

  //Has the BodyPainter object move to the starting paint location
    moveToStart5();

  //Sets the paint to the correct amount
    setPaint(68);

  //Paints the main body of the chicken
    paintAndMove(color);
    paint(color);
    turnAround();
    shuffleRight();
    paintAndMove(color);
    paint(color);
    turnAround();
    shuffleLeft();
    move();
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    turnAround();
    shuffleRight();
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paint(color);
    turnAround();
    shuffleLeft();
    move();
    paintAndMove(color);
    move();
    paintAndMove(color);
    paint(color);
    turnAround();
    shuffleRight();
    paintAndMove(color);
    paintAndMove(color);
    move();
    move();
    shuffleRight();
    turnAround();
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paint(color);
    turnAround();
    shuffleRight();
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    turnAround();
    shuffleLeft();
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paint(color);
    turnAround();
    shuffleRight();
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    move();
    move();
    move();
    paint(color);
    shuffleRight();
    turnAround();
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paint(color);
    shuffleLeft();
    turnAround();
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    move();
    paint(color);
    turnAround();
    shuffleLeft();
    move();
    move();
    move();
    move();
    move();
    paintAndMove(color);
    paintAndMove(color);

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
 * Has the BodyPainter object move to the starting paint location
 */
  public void moveToStart5() {
    turnRight();
    for (int i = 0; i < 6; i++) {
      move();
    }
    shuffleLeft();
    shuffleLeft();
  }
}