import greenfoot.*;
/**
 * Write a description of class Choose here.
 * 
 * @author (Alvian) 
 * @version (1.0)
 */
public class Choose extends Core
{
    Suit1 suit1 = new Suit1();
    Suit2 suit2 = new Suit2();
    Suit3 suit3 = new Suit3();
    /**
     * Constructor for objects of class Choose.
     * 
     */
    public Choose()
    {
        setBackground("Choser.png");
        prepare();
    }
    public void prepare()
    {
        Greenfoot.playSound("cus.wav");
        addObject(suit1,150,245);       
        addObject(suit2,getWidth()/2,245);        
        addObject(suit3,704,245);
    }
}
