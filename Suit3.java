import greenfoot.*;
/**
 * Write a description of class Suit3 here.
 * 
 * @author (Alvian) 
 * @version (v1.0)
 */
public class Suit3 extends Button
{
    /**
     * Act - do whatever the Suit3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Suit3()
    {
        setImage("Ungu.png");
    }
    public void act() 
    {
        if ((!this.mouseOver) && (Greenfoot.mouseMoved(this)))
        {
            setImage("Ungu2.png");
            this.mouseOver = true;
        }
        if ((this.mouseOver) && (Greenfoot.mouseMoved(null)) && (!Greenfoot.mouseMoved(this)))
        {
            setImage("Ungu.png");
            this.mouseOver = false;
        }
        if(Greenfoot.mousePressed(this))
        {
            Greenfoot.playSound("wind.wav");
            Level1.z = 1;
            Level1.n = 3;
            Greenfoot.setWorld(new Delay());
        }
    }    
}
