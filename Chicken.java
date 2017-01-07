import greenfoot.*;
/**
 * Write a description of class Chicken here.
 * 
 * @author (Alvian) 
 * @version (1.0)
 */
public class Chicken extends Item
{
    /**
     * Act - do whatever the Chicken wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Chicken()
    {
        setImage("Chicken.png");
    }
    public void act() 
    {
        walk();
        if(isTouching(Hero.class))
        {
            Greenfoot.playSound("item.wav");
            getWorld().removeObject(this);
            Level1.healthpoint.add(1);
        }
    }    
}
