import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    ScoreCounter scoreCounter;
    int score = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Fish fish = new Fish();
        addObject(fish,159,111);
        Fish fish2 = new Fish();
        addObject(fish2,204,301);

        scoreCounter = new ScoreCounter();
        addObject(scoreCounter,476,46);
        Bee bee = new Bee();
        addObject(bee,308,87);
        Fish fish3 = new Fish();
        addObject(fish3,550,311);
        Fish fish4 = new Fish();
        addObject(fish4,95,220);
        Fish fish5 = new Fish();
        addObject(fish5,72,35);
        Fish fish6 = new Fish();
        addObject(fish6,352,360);
        Player player = new Player();
        addObject(player,484,138);
        Spider spider = new Spider();
        addObject(spider,279,220);
    }
    
    public void addScore(int toAdd){
        score += toAdd;
        scoreCounter.display(score);
    }
    
    public void win(){
        YouWonSign youWonSign = new YouWonSign();
        addObject(youWonSign,300,200);
        Greenfoot.stop();
    }
}
