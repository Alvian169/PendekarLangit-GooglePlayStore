import greenfoot.*;
/**
 * Write a description of class Laser2 here.
 * 
 * @author (Alvian) 
 * @version (1.0)
 */
public class Shot extends Actor
{
    /**
     * Act - do whatever the Laser2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Shot()
    {
        setImage("Bullet.png");
    }
    public void act() 
    {
        move(-15);
        if(getX()<=0)
        { 
            getWorld().removeObject(this);
        }
    }    
}
