
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
        move();
        move();
        turnRight();
        while(frontIsClear()){
            checkSurrounding();
            if(!frontIsClear()){
                turnRight();
            }
          }
        }
    
   
    public void checkSurrounding(){
        turnLeft();
        if(frontIsClear()){
            move();
            turnOff();
        }
        else{
            turnRight();
            move();
        }
    }
        
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }

}
