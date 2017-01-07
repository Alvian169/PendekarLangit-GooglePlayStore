import greenfoot.*;
/**
 * Write a description of class Laser1 here.
 * 
 * @author (Alvian) 
 * @version (1.0)
 */
public class Laser extends Actor
{
    /**
     * Act - do whatever the Laser1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Laser(int n)
    {
        setImage("Bullet"+n+".png");
    }
    public void act() 
    {
        move(5);
        if(isAtEdge())
        { 
            getWorld().removeObject(this);
        }
    }    
}
