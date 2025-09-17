import org.code.neighborhood.*;

public class WingPainter extends CombBeakAndFeetPainter {

/*
 * Has the WingPainter object paint the wing of the chicken
 */
  public void paintWing(String color) {
    
    //Moves the WingPainter object to the starting paint location
    moveToStart6();

    //Sets the paint to the correct amount of paint
    setPaint(7);

    //Paints the wing
    paintAndTurnRight(color);
    paintAndTurnLeft(color);
    paint(color);
    shuffleLeft();
    move();
    paintAndTurnLeft(color);
    paintAndMove(color);
    paintAndMove(color);
    paint(color);
    turnRight();

    //Moves the WingPainter object to the bottom left
    while (canMove()) {
      move();
    }
    turnRight();
    while (canMove()) {
      move();
    }
  }

/*
 * Moves the WingPainter object to the starting paint location
 */
  public void moveToStart6() {
    for (int i = 0; i < 5; i++) {
      move();
    }
    turnRight();
    for (int i = 0; i < 9; i++) {
      move();
    }
  }
}