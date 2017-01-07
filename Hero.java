import greenfoot.*;
/**
 * Write a description of class Hero here.
 * 
 * @author (Alvian) 
 * @version (1.0)
 */
public class Hero extends Actor
{
    double dy = 0;
    double g = 0.25;
    boolean cek = true;
    static int last = 0;
    int timer = 0;
    int time = 0;
    int x;
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Hero(int n)
    {
        setImage("Gatot"+n+".png");
    }
    public void act() 
    {
        if(last == 0){
        if(Greenfoot.mouseClicked(null))
        {
            x=0;
        }
        if(Greenfoot.mousePressed(Level1.control))
        {
            x=1;
        }
        if(cek == true)
        {
            setLocation(getX(),(int)(getY() + dy));
        }
        else if(cek == false)
        {
            setLocation(getX(),getY());            
            timer++;
            if(timer % 30 == 0)
            {
                setImage("Gatot0.png");
            }
            else
            {
                setImage("Gatot"+Level1.n+".png");
            } 
        }
        if(Greenfoot.isKeyDown("up") || x==1)
        {
            cek = true;
            timer = 0;
            dy = -5;
        }
        dy = dy + g;        
        if(Level1.ammo.getValue() != 0)
        {
            if("space".equals(Greenfoot.getKey()) || Greenfoot.mouseClicked(Level1.control2))
            { 
                fire();      
                Greenfoot.playSound("laser.wav");
            }
        }
        stopAtEdge();
        if(isTouching(Shot.class))
        {
            removeTouching(Shot.class);
            Level1.healthpoint.add(-1);
        }
        }
        else if(last == 1)
        {}
    }
    public void stopAtEdge()
    {
        if (getY() >= 480)
        {
            setLocation(100,getWorld().getHeight()/2);
            Level1.healthpoint.add(-1);
            cek = false;
        }
        else if (getY() <= 0) 
        {
            setLocation(getX(),0);
        }
    }
    public void fire()
    {    
         if(Core.level==1)
         {
             Laser laser = new Laser(0);
             getWorld().addObject(laser, getX(), getY());
             laser.setRotation(getRotation());
             Level1.ammo.add(-1);
             laser.move(50);
         }
         if(Core.level==2 || Core.level==3)
         {
             Laser laser = new Laser(1);
             getWorld().addObject(laser, getX(), getY());
             laser.setRotation(getRotation());
             Level1.ammo.add(-1);
             laser.move(50);
         } 
         if(Core.level==4 || Core.level==5)
         {
             Laser laser = new Laser(2);
             getWorld().addObject(laser, getX(), getY());
             laser.setRotation(getRotation());
             Level1.ammo.add(-1);
             laser.move(50);
         } 
         if(Core.level==6 || Core.level==7)
         {
             Laser laser = new Laser(3);
             getWorld().addObject(laser, getX(), getY());
             laser.setRotation(getRotation());
             Level1.ammo.add(-1);
             laser.move(50);
         } 
    }
}
