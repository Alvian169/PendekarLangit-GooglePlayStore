import greenfoot.*;
/**
 * Write a description of class Easy here.
 * 
 * @author (Alvian) 
 * @version (1.0)
 */
public class Easy extends Button
{
    /**
     * Act - do whatever the Easy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Easy()
    {
        setImage("Easy.png");
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
