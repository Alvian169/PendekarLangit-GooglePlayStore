import greenfoot.*;
/**
 * Write a description of class Help here.
 * 
 * @author (Alvian) 
 * @version (1.0)
 */
public class Help extends Button
{
    /**
     * Act - do whatever the Help wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Help()
    {
        setImage("Help.png");
    }
    public void act() 
    {
        if ((!this.mouseOver) && (Greenfoot.mouseMoved(this)))
        {
            setImage("Help2.png");
            this.mouseOver = true;
        }
        if ((this.mouseOver) && (Greenfoot.mouseMoved(null)) && (!Greenfoot.mouseMoved(this)))
        {
            setImage("Help.png");
            this.mouseOver = false;
        }
    }    
}
