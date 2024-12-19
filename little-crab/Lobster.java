import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    public void lookForCrab(){
        if(isTouching(Crab.class)){
            removeTouching(Crab.class);
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    }
    
    public void turnAtEdge(){
        if(isAtEdge()){
            turn(17);
        }
    }
    
    public void randomTurn(){
        if((int)(Math.random()*100)<10){
            turn((int)(Math.random()*90)-45);
        }
    }
    public void act()
    {
        turnAtEdge();
        randomTurn();
        move(5);
        lookForCrab();
    }
}
