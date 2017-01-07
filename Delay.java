import greenfoot.*;
/**
 * Write a description of class Delay here.
 * 
 * @author (Alvian) 
 * @version (1.0)
 */
public class Delay extends Core
{
    Image image1 = new Image(21);
    Image image2 = new Image(22);
    Image image3 = new Image(23);
    int timer = 0;    
    /**
     * Constructor for objects of class Delay.
     * 
     */       
    public void act()
    {
        timer++;
        if(timer >= 0)
        {            
            addObject(image1, getWidth()/2, getHeight()/2); 
        }
        if(timer >= 60)
        {
            removeObject(image1);
            addObject(image2, getWidth()/2, getHeight()/2); 
        }
        if(timer >= 120)
        {
            removeObject(image2);
            addObject(image3, getWidth()/2, getHeight()/2); 
        }
        if(timer == 180)
        {
            removeObject(image3);
            timer = 0;
            Greenfoot.setWorld(new Level1());
        }
    }
}
