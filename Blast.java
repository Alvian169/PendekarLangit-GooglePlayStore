import greenfoot.*;
/**
 * Write a description of class Blast here.
 * 
 * @author (Alvian) 
 * @version (1.0)
 */
public class Blast extends Actor
{
    int timer = 0;
    /**
     * Act - do whatever the Blast wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Blast()
    {
        setImage("Blast.png");
    }
    public void act() 
    {
        timer++;
        move(-5);
        if(timer == 30)
        {
            getWorld().removeObject(this);
        }
    }  
}
