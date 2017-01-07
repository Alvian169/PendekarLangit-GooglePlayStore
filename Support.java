import greenfoot.*;
/**
 * Write a description of class Support here.
 * 
 * @author (Alvian) 
 * @version (1.0)
 */
public class Support extends Core
{
    /**
     * Constructor for objects of class Support.
     * 
     */
    public Support()
    {
        setBackground("Support.png");
        prepare();
    }
    public void prepare()
    {
        addObject(back, 80, 450);
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(back))
        {
            Greenfoot.playSound("button.wav");
            Greenfoot.setWorld(new Menu());
        }
    }
}
