
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    public int beepers;
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findTreasure() {
        while(beepers ==0){
            goToNextDirection();
        }    
      }
      
    public void goToNextDirection(){
        while(nextToABeeper()) {
            pickBeeper();
            beepers++;
        }
        if(beepers == 1 ){
           faceNorth();
            while(!nextToABeeper()){
            move();
           }
           beepers =0;
        }
        if(beepers == 2 ){
           faceEast();
            while(!nextToABeeper()){
            move();
           }
           beepers =0;
        }
        if(beepers == 3 ){
           faceSouth();
            while(!nextToABeeper()){
            move();
           }
           beepers =0;
        }
        if(beepers == 4 ){
           faceWest();
            while(!nextToABeeper()){
            move();
           }
           beepers =0;
        }
    }
   
   public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
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
