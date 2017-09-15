
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void plantBeepers() {
        while(!nextToABeeper()){
            putBeeper();
            checkSurrounding();
            move();            
            if(!frontIsClear()){
                turnRight();
            }
          }
        }
    
   
    public void checkSurrounding(){
        turnLeft();
        if(frontIsClear()){
            move();
            if(!nextToABeeper()){
                putBeeper();
            }
            turnLeft();
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

