import greenfoot.*;
/**
 * Write a description of class End here.
 * 
 * @author (Alvian) 
 * @version (1.0)
 */
public class End extends Button
{
    /**
     * Act - do whatever the End wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public End()
    {
        setImage("end.png");
    }
    public void act() 
    {
        if ((!this.mouseOver) && (Greenfoot.mouseMoved(this)))
        {
            setImage("end2.png");
            this.mouseOver = true;
        }
        if ((this.mouseOver) && (Greenfoot.mouseMoved(null)) && (!Greenfoot.mouseMoved(this)))
        {
            setImage("end.png");
            this.mouseOver = false;
        }
    }    
}
