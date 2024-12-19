import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    private GreenfootImage img1 = new GreenfootImage("crab.png");
    private GreenfootImage img2 = new GreenfootImage("crab2.png");
    
    public void swithImage(){
        if(getImage() == img1){
            setImage(img2);
        }else{
            setImage(img1);
        }
    }
    
    public void lookForWorm(){
        if(isTouching(Worm.class)){
            removeTouching(Worm.class);
            Greenfoot.playSound("slurp.wav");
        }
    }
    
   public void checkKeyPress(){
       if(Greenfoot.isKeyDown("left")){
           turn(4);
       }
       if(Greenfoot.isKeyDown("right")){
           turn(-4);
       }
   }
    

    
    public void act()
    {
        checkKeyPress();
        move(5);
        lookForWorm();  
        swithImage();
    }
}

