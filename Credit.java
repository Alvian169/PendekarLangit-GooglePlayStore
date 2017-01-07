import greenfoot.*;
/**
 * Write a description of class Credit here.
 * 
 * @author (Alvian) 
 * @version (1.0)
 */
public class Credit extends Core
{
    Back back = new Back();
    Image image1 = new Image(11);
    Image image2 = new Image(12);
    Image image3 = new Image(13);
    int timer = 0;
    /**
     * Constructor for objects of class Credit.
     * 
     */
    public Credit()
    {
        setBackground("Credits.png");
        prepare();
    }
    public void prepare()
    {
        addObject(back, getWidth()/2, 450);
    }
    public void act()
    {
        timer++;
        if(timer >= 0)
        {            
            addObject(image1, getWidth()/2, getHeight()/2);
        }
        if(timer >= 120)
        {
            removeObject(image1);
            addObject(image2, getWidth()/2, getHeight()/2);
        }
        if(timer >= 240)
        {
            removeObject(image2);
            addObject(image3, getWidth()/2, getHeight()/2);
        }
        if(timer == 360)
        {
            removeObject(image3);
            timer = 0;
        }
        if(Greenfoot.mouseClicked(back))
        {
            Greenfoot.playSound("button.wav");
            Greenfoot.setWorld(new Menu());
        }
    }
}
