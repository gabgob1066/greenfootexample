import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Actor
{
    /**
     * Act - do whatever the Fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    Random r;
    
    public Fish(){
        r = new Random();
    }
    
    public void act() 
    {
        move(3);
        if(r.nextInt(20) == 0){
            turn(90);
        }
    }    
}
