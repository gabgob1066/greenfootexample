import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreCounter extends Actor
{
    /**
     * Act - do whatever the ScoreCounter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public ScoreCounter(){
        display(0);
    }
    
    public void display(int score){
        setImage(new GreenfootImage("Score : " + score, 24, Color.GREEN, Color.BLACK));
    }
    
    public void act() 
    {
        
    }    
}
