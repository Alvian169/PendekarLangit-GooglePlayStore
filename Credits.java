import greenfoot.*;
/**
 * Write a description of class Credits here.
 * 
 * @author (Alvian) 
 * @version (1.0)
 */
public class Credits extends Button
{
    /**
     * Act - do whatever the Credits wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Credits()
    {
        setImage("Credit.png");
    }
    public void act() 
    {
        if ((!this.mouseOver) && (Greenfoot.mouseMoved(this)))
        {
            this.mouseOver = true;
        }
        if ((this.mouseOver) && (Greenfoot.mouseMoved(null)) && (!Greenfoot.mouseMoved(this)))
        {
            this.mouseOver = false;
        }
    }    
}
