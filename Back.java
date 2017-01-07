import greenfoot.*;
/**
 * Write a description of class Back here.
 * 
 * @author (Alvian) 
 * @version (1.0)
 */
public class Back extends Button
{
    /**
     * Act - do whatever the Back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Back()
    {
        setImage("Back.png");
    }
    public void act() 
    {
        if ((!this.mouseOver) && (Greenfoot.mouseMoved(this)))
        {
            setImage("Back2.png");
            this.mouseOver = true;
        }
        if ((this.mouseOver) && (Greenfoot.mouseMoved(null)) && (!Greenfoot.mouseMoved(this)))
        {
            setImage("Back.png");
            this.mouseOver = false;
        }
    }    
}
