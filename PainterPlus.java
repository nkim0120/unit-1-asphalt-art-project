import org.code.neighborhood.*;
public class PainterPlus extends Painter {
  
/*
 * Makes the object turn right
 */
  public void turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
  }

/*
 * Makes the object take all the paint
 */
  public void takeAllPaint(){
    while (isOnBucket()){
    takePaint();
    }
  }

/*
 * Makes the object move forward until it cannot move
 */
  public void moveFast(){
    while (canMove()){
      move();
    }
  }

/*
 * Makes the object paint, move forward, and repeat until it has no more paint
 */
  public void paintToEmpty(String color){
    while (hasPaint()){
      paint(color);
      move();
    }
  }

/*
 * Makes the object paint a donut 3x3
 */
  public void paintDonut(String color){
    while (hasPaint()){
      move();
      paint(color);
      turnRight();
      move();
      paint(color);
    }
  }

/*
 * Makes the object turn around
 */
  public void turnAround() {
    turnLeft();
    turnLeft();
  }
}