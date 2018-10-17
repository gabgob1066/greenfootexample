import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        doMovement();
        
        MyWorld world = (MyWorld) getWorld();
        
        List<Fish> touching = getIntersectingObjects(Fish.class);
        world.addScore(touching.size());
        removeTouching(Fish.class);
     
        if(world.getObjects(Fish.class).isEmpty()){
            world.win();
        }
    }    
    
    public void doMovement(){
        if(Greenfoot.isKeyDown("left")){
            move(-5);
        } else if(Greenfoot.isKeyDown("right")){
            move(5);
        } else if(Greenfoot.isKeyDown("up")){
            turn(-90);
            move(5);
            turn(90);
        } else if(Greenfoot.isKeyDown("down")){
            turn(90);
            move(5);
            turn(-90);
        }
    }
}
