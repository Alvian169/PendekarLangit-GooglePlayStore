import greenfoot.*;
/**
 * Write a description of class Diamond here.
 * 
 * @author (Alvian) 
 * @version (1.0)
 */
public class Diamond extends Item
{
    /**
     * Act - do whatever the Diamond wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Diamond()
    {
        setImage("Diamond.png");
    }
    public void act() 
    {
        walk();
        if(isTouching(Hero.class))
        {
            Greenfoot.playSound("item.wav");
            getWorld().removeObject(this);
            Level1.ammo.add(5);
        }
    }    
}
