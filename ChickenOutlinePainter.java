import org.code.neighborhood.*;

public class ChickenOutlinePainter extends PainterPlus {

/*
 * Has the ChickenOutlinePainter object paint the outline of the chicken and the eye
 */
  public void paintOutline(String color) {

    //Moves the ChickenOutlinePainter object to the starting paint location
    moveToStart1();

    //Sets the paint to the correct amount
    setPaint(54);

    //Has the ChickenOutlinePainter object paint the outline
    paintAndMove(color);
    paintAndTurnLeft(color);
    turnRight();
    move();
    paintAndTurnLeft(color);
    paint(color);
    turnAround();
    move();
    move();
    turnLeft();
    move();
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    turnRight();
    move();
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    turnRight();
    move();
    paintAndTurnLeft(color);
    paintAndTurnRight(color);
    turnLeft();
    move();
    paintAndMove(color);
    paintAndMove(color);
    turnLeft();
    move();
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    turnLeft();
    move();
    paint(color);
    turnAround();
    move();
    turnLeft();
    move();
    paintAndMove(color);
    paintAndMove(color);
    turnLeft();
    move();
    paintAndMove(color);
    turnRight();
    move();
    paintAndMove(color);
    turnLeft();
    move();
    paintAndMove(color);
    paintAndMove(color);
    turnRight();
    move();
    paintAndTurnLeft(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndTurnRight(color);
    paintAndTurnRight(color);
    move();
    paintAndMove(color);
    move();
    move();
    paintAndTurnRight(color);
    move();
    turnRight();
    move();
    move();
    move();
    move();
    move();
    move();
    paintAndMove(color);
    paintAndMove(color);
    turnLeft();
    move();
    paintAndMove(color);
    turnRight();
    move();
    paintAndTurnLeft(color);
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    turnLeft();
    move();
    paintAndTurnRight(color);
    paintAndMove(color);
    turnRight();
    move();
    paint(color);
    turnAround();
    move();
    turnRight();
    move();
    paintAndMove(color);
    paintAndMove(color);
    turnLeft();
    move();
    paintAndMove(color);
    turnRight();
    move();
    paintAndMove(color);
    turnLeft();
    move();
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);
    turnAround();
    move();
    move();
    move();
    turnRight();
    move();
    move();
    move();
    move();
    paintAndMove(color);
    paintAndMove(color);
    paintAndMove(color);

    //Moves the ChickenOutlinePainter object to the bottom left
    while (canMove()) {
      move();
    }
    turnRight();
    while (canMove()) {
      move();
    }
  }

/*
 * Moves the ChickenOutlinePainter object to the starting paint location
 */
  public void moveToStart1() {
    for (int i = 0; i < 8; i++) {
      move();
    }
    turnRight();
  }

/*
 * Has the object paint one square and move one square 
 */
  public void paintAndMove(String color) {
    paint(color);
    move();
  }

/*
 * Has the object paint one square, turn right, and move one square in that new direction
 */
  public void paintAndTurnRight(String color) {
    turnRight();
    paintAndMove(color);
  }

/*
 * Has the object paint one square, turn left, and move one square in that new direction
 */
  public void paintAndTurnLeft(String color) {
    turnLeft();
    paintAndMove(color);
  }
}