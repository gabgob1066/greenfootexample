import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class Spider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spider extends Actor
{
    MyWorld world;
    Random r;
    Player p;
    
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void addedToWorld(World world){
        this.world = (MyWorld) world;
        r = new Random();
        p = world.getObjects(Player.class).get(0);
    }
    
    public void act() 
    {
        move(2);
        turnTowards(p.getX(),p.getY());
        
        if(!getIntersectingObjects(Player.class).isEmpty()){
            world.addScore(-5);
            world.removeObject(this);
            world.addObject(new Spider(), r.nextInt(600), r.nextInt(400));
        }
    }    
}
