import greenfoot.*;
/**
 * Write a description of class Suit2 here.
 * 
 * @author (Alvian) 
 * @version (v1.0)
 */
public class Suit2 extends Button
{
    /**
     * Act - do whatever the Suit2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Suit2()
    {
        setImage("Hijau.png");
    }
    public void act() 
    {
        if ((!this.mouseOver) && (Greenfoot.mouseMoved(this)))
        {
            setImage("Hijau2.png");
            this.mouseOver = true;
        }
        if ((this.mouseOver) && (Greenfoot.mouseMoved(null)) && (!Greenfoot.mouseMoved(this)))
        {
            setImage("Hijau.png");
            this.mouseOver = false;
        }
        if(Greenfoot.mousePressed(this))
        {
            Greenfoot.playSound("wind.wav");
            Level1.z = 3;
            Level1.n = 2;
            Greenfoot.setWorld(new Delay());
        }
    }    
}
