package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1Driver implements Directions
{
    public static void main(String args[])  {
        Problem1 karel = new Problem1(1, 1, West, -1);
        karel.faceEast();
        karel.turnOff();
        
    } 

    static {
        World.reset(); 
        World.setDelay(10);  
        World.setVisible(true);
    }
}
