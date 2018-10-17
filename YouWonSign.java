import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouWonSign here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouWonSign extends Actor
{
    /**
     * Act - do whatever the YouWonSign wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void addedToWorld(World world) 
    {
         setImage(new GreenfootImage("You Won!", 100, Color.RED, Color.GRAY));
    }    
}
