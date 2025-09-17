import org.code.neighborhood.*;

public class CombBeakAndFeetPainter extends ChickenOutlinePainter {

/*
 * Has the CombBeakAndFeetPainter object paint the comb (top thing) of the chicken
 */
  public void paintComb(String color) {

  //Moves the object to the starting paint position for the comb
    moveToStart2();

  //Sets the paint to the correct amount
    setPaint(5);

  //Has the object paint the comb of the chicken
    paintAndMove(color);
    paintAndMove(color);
    paint(color);
    shuffleRight();
    paintAndMove(color);
    paint(color);
  }

/*
 * Has the CombBeakAndFeetPainter object paint the feet of the chicken
 */
  public void paintBeakAndFeet(String color) {

  //Moves the object to the starting paint position for the beak
    moveToStart3();

  //Sets the paint to the correct amount
    setPaint(2);

  //Has the object paint the beak
    paintAndMove(color);
    paint(color);

  //Moves the object to the starting paint position for the feet
    turnRight();
    while (canMove()) {
      move();
    }
    turnRight();
    move();
    move();
    move();
    move();

  //Sets the paint to the correct amount
    setPaint(3);

  //Has the object paint the feet
    paintAndMove(color);
    move();
    paintAndMove(color);
    paintAndMove(color);

  //Moves the object to the bottom left
    while (canMove()) {
      move();
    }
  }

/*
 * Makes the object move one square to the right while still facing its original direction
 */
  public void shuffleRight() {
    turnRight();
    move();
    turnLeft();
  }

/*
 * Makes the object move one square to the left while still facing its original direction
 */
  public void shuffleLeft() {
    turnLeft();
    move();
    turnRight();
  }

/*
 * Moves the object to the starting paint position for the comb
 */
  public void moveToStart2() {
    for (int i = 0; i < 9; i++) {
      move();
    }
    shuffleRight();
  }

/*
 * Moves the object to the starting paint position for the beak
 */
  public void moveToStart3() {
    shuffleRight();
    shuffleRight();
    shuffleRight();
    move();
  }
}