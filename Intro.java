import greenfoot.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (Alvian) 
 * @version (1.0)
 */
public class Intro extends World
{
    int timer = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Intro()
    {    
        super(854, 480, 1);
        prepare();
    }
    public void prepare()
    {
        setBackground("Splash.png");
    }
    public void act()
    {
        timer++;
        if(timer == 120)
        {
            Greenfoot.setWorld(new Menu());
            Greenfoot.playSound("first.wav");
        }
    }
}
