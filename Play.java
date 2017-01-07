import greenfoot.*;
/**
 * Write a description of class Play here.
 * 
 * @author (Alvian) 
 * @version (v1.0)
 */
public class Play extends Button
{
    /**
     * Act - do whatever the Play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Play()
    {
        setImage("Play.png");
    }
    public void act() 
    {
        if ((!this.mouseOver) && (Greenfoot.mouseMoved(this)))
        {
            setImage("Play2.png");
            this.mouseOver = true;
        }
        if ((this.mouseOver) && (Greenfoot.mouseMoved(null)) && (!Greenfoot.mouseMoved(this)))
        {
            setImage("Play.png");
            this.mouseOver = false;
        }
    }    
}
