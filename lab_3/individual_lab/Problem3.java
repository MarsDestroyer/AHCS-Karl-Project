package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void carpetRooms(){
        enterRoom();
        checkRoom();
    }
    
    public void enterRoom(){
        move();
        turnLeft();
        move();
        checkRoom();
    }
    
    public boolean checkRoom(){
        faceWest();
        if(frontIsClear()){
            return false;
            turnRight();
        }
        else{
            return true;
            turnLeft();
            move();
        }
        if(frontIsClear()){
            return false;
            turnRight();
        }
        else{
            return true;
            faceSouth();
            move();
        }
        if(frontIsClear()){
            return false;
            turnRight();
        }
        else{
            return true;
            turnRight();
            move();
        }
        if(!frontIsClear){
            turnLeft();
            turnLeft();
            move();
        }
    }
    
    public void putCarpet(){
        if(checkRoom == true){
            putBeeper();
            faceSouth();
            move();
        }
    }
    
     public void faceEast(){
        if(facingWest()){
                turnLeft();
                turnLeft();
        }
        else{
                if(facingNorth()){ 
                      turnRight();                      
                }
                else {
                 if(facingSouth()){
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
            turnRight();
            }
        }
     }
   }    
    public void faceNorth(){
        if(facingWest()){
                turnRight();
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
   public void faceSouth(){
        if(facingWest()){
                turnLeft();
        }
        else{
                if(facingNorth()){ 
                      turnRight();
                      turnRight();
                }
                else {
                 if(facingSouth()){
            turnLeft();
            turnLeft();
            }
        }
     }
   }    
   
   public void turnRight(){
       turnLeft();
       turnLeft();
       turnLeft();
    }
}

