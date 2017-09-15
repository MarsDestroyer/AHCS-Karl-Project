 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void closeAllWindows() {
        while(frontIsClear()){
            turnRight();
            checkSurrounding();
            move();
            if(frontIsClear()){
                turnLeft();
            }
          }
        }
    
   
    public void checkSurrounding(){
        turnLeft();
        if(frontIsClear()){
            putBeeper();
        }
        
        else{
            turnRight();
        }
    }
        
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
   
}

