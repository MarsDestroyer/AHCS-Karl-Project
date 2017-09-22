
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    public int beepers;
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void fixBallots() {
        while(beepers==0){
            goToNextBeeper();
        }
    }
    
    public void goToNextBeeper(){
        while(!nextToABeeper()){
            move();
        }
        if(nextToABeeper()){
            pickBeeper();
            beepers++;
        }
        if(beepers >= 1){
            faceNorth();
            move();
            pickBeeper();
            faceSouth();
            move();
            move();
            pickBeeper();
            faceNorth();
            move();
            faceEast();
        }
    }
    
     public void faceEast(){
     while(!facingEast()){
           turnLeft();
       }
   }    
   public void faceWest(){
     while(!facingWest()){
           turnLeft();
       }
   }   
   
   public void faceNorth(){
       while(!facingNorth()){
           turnLeft();
       }
   }

   public void faceSouth(){
       while(!facingSouth()){
           turnLeft();
       }
   }    
}

