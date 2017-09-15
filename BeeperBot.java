
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void runRace() {
        while(frontIsClear()){
            collectBeeperSteeple();
            while(!nextToABeeper()){
                move();
            }
        }
        
    }
   
    public void  collectBeeperSteeple() {
        findBeepers();
    }
    
    public void findBeepers() {
        faceEast();
        while(!nextToABeeper()){
            move();
        }
        collectBeeperColumn();
    }
    
    public void collectBeeperColumn() {
        faceNorth();
        while(nextToABeeper()) {
            pickBeeper();
            move();
        }
        returnToFloor();
    }
    
    
    public void returnToFloor() {
        faceSouth();
        while(frontIsClear()) {
            move();
        }
        faceEast();
    }
    
        public void faceEast(){
        if(facingWest()){
                turnLeft();
                turnLeft();
        }
        else{
                if(facingNorth()){ 
                      turnLeft();
                      turnLeft();
                      turnLeft();
                }
                else {
                 if(facingSouth()){
            turnLeft();
            }
        }
     }
    }
    
        public void faceNorth(){
        if(facingWest()){
                turnLeft();
                turnLeft();
                turnLeft();
        }
        else{
                if(facingEast()){ 
                      turnLeft();                      
                }
                else {
                 if(facingSouth()){
            turnLeft();
            turnLeft();
            }
        }
     }
   }    
   
       public void faceWest(){
        if(facingEast()){
                turnLeft();
                turnLeft();
        }
        else{
                if(facingNorth()){ 
                      turnLeft();                      
                }
                else {
                 if(facingSouth()){
            turnLeft();
            turnLeft();
            turnLeft();
            }
        }
     }
   }    
   
       public void faceSouth(){
        if(facingWest()){
                turnLeft();
        }
        else{
                if(facingNorth()){ 
                      turnLeft();
                      turnLeft();
                }
                else {
                 if(facingEast()){
            turnLeft();
            turnLeft();
            turnLeft();
            }
        }
     }
   }    
}
