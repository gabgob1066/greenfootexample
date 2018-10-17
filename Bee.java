import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    MyWorld world;
    Random r;
    
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void addedToWorld(World world){
        this.world = (MyWorld) world;
        r = new Random();
    }
    
    public void act() 
    {
        move(2);
        turn(r.nextInt(10) - 5);
        if(isAtEdge()){
            turn(180);
        }
        if(!getIntersectingObjects(Player.class).isEmpty()){
            world.addScore(-1);
            world.removeObject(this);
            world.addObject(new Bee(), r.nextInt(600), r.nextInt(400));
        }
    }    
}
