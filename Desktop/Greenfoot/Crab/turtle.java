import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class turtle extends Lobster implements Freezable
{
    private int counter;
    public turtle(){
        counter = 50;
    }
    /**
     * Act - do whatever the turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(counter<=0)
            super.act();
        else
            counter--;
        turnAtEdge();
        //randomTurn();
        lookForLobster();
        move(1/5);
    }
    
    public void freeze(int count){
        counter = count;
    }
    
    public void turnAtEdge(){
        if(isAtEdge()){
            turn(17);
        }
    }
    
    /*public void randomTurn()
    {
        if (Greenfoot.getRandomNumber(50) < 5)
        {
            turn(Greenfoot.getRandomNumber(5)-3);
        }
    }
    */
    public void lookForLobster(){
        if( isTouching(Lobster.class) ) {
            removeTouching(Lobster.class);
        }
    }
}