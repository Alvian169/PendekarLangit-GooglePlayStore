import greenfoot.*;
/**
 * Write a description of class Scroller here.
 * 
 * @author (Alvian) 
 * @version (1.0)
 */
public class Scroller extends Actor
{
    /**
     * Act - do whatever the Scroller wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Scroller(int n)
    {
        {
            setImage("Langit"+n+".png");
        } 
    }
    public void scroll()
    {
        if(getX() < -getImage().getWidth()/2)
        {
            setLocation(getX() + getWorld().getWidth()*2 , getY());
        }
        setLocation(getX()-5 , getY());
    }   
}
