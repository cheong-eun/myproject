import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int score;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        Random();
    }
    
    private void Random(){
        addLobster();
        addTurtle();
        Worms();
    }
    
    private void addTurtle(){
        if(score >= 50){
            addObject(new turtle(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
    }
    
    private void addLobster(){
        if(score != 0){
            if(score%100 == 0){
                addObject(new Lobster(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
            }
        }
    }
    
     private void Worms()
    {
       int a = Greenfoot.getRandomNumber(3);
       int b = Greenfoot.getRandomNumber(getWidth());
       int c = Greenfoot.getRandomNumber(getHeight());
       if (a == 1){
        addObject( new worm(), b, c );
        addObject( new worm(), b, c );
        addObject( new worm(), b, c );
       }
    }
    
}
