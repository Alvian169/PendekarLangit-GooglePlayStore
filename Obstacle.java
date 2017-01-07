import greenfoot.*;
/**
 * Write a description of class Obstacle here.
 * 
 * @author (Alvian) 
 * @version (1.0)
 */
public class Obstacle extends Item
{
    /**
     * Act - do whatever the Obstacle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Obstacle()
    {
        setImage("Rock.png");
    }
    public void act() 
    {
        walk();
        if(isTouching(Hero.class))
        {
            getWorld().removeObject(this);
            Level1.healthpoint.add(-1);
        }
    }    
}
