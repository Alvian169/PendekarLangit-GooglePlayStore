import greenfoot.*;
/**
 * Write a description of class Bug1 here.
 * 
 * @author (Alvian) 
 * @version (1.0)
 */
public class Bug extends Actor
{
    int timer = 0;
    int hp1 = 2;
    int hp2 = 10;
    int s1=1,s2=2,r,r2;
    /**
     * Act - do whatever the Bug1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public Bug(int n)
    {
        setImage("Bug"+n+".png");
    }
    public void act() 
    {
        if(Core.level == 1)
        {
            move(-5);
            if(isTouching(Laser.class))
            {
                boom();
                Level1.score.add(10);
            }
            else if(isTouching(Hero.class))
            {
                removeTouching(Bug.class);
                getWorld().removeObject(this);
                Level1.healthpoint.add(-1);            
            }
        }
        if(Core.level == 2)
        {
            timer++;
            move(-5);
            if(isTouching(Laser.class))
            {
                boom();
                Level1.score.add(10);
            }
            else if(isTouching(Hero.class))
            {
                getWorld().removeObject(this);
                Level1.healthpoint.add(-1);            
            }
            if(timer == 120)
            {
                fire();
                Greenfoot.playSound("shot.wav");
            }
        }
        if(Core.level == 3)
        {
            timer++;
            move(-5);
            if(isTouching(Laser.class))
            {
                hp1--;
                removeTouching(Laser.class);
                if(hp1==0)
                {
                    boom();
                    Level1.score.add(10);
                }
            }
            else if(isTouching(Hero.class))
            {
                removeTouching(Bug.class);
                getWorld().removeObject(this);
                Level1.healthpoint.add(-1);            
            }
            if(timer == 120)
            {
                fire();
                Greenfoot.playSound("shot.wav");
            }
        }
        if(Core.level == 4)
        {
            timer++;
            setLocation(getX(),getY()-3);
            if(isTouching(Laser.class))
            {
                removeTouching(Laser.class);
                boom();
                Level1.score.add(10);
            }
            else if(isTouching(Hero.class))
            {
                removeTouching(Bug.class);
                getWorld().removeObject(this);
                Level1.healthpoint.add(-1);            
            }
            if(timer == 120)
            {
                fire();
                Greenfoot.playSound("shot.wav");
            }
        }
        if(Core.level == 5)
        {
            timer++;
            setLocation(getX(),getY()-3);
            if(isTouching(Laser.class))
            {
                hp1--;
                removeTouching(Laser.class);
                if(hp1==0)
                {
                    boom();
                    Level1.score.add(10);
                }
            }
            else if(isTouching(Hero.class))
            {
                removeTouching(Bug.class);
                getWorld().removeObject(this);
                Level1.healthpoint.add(-1);            
            }
            if(timer == 120)
            {
                fire();
                Greenfoot.playSound("shot.wav");
            }
        }
        if(Core.level == 6)
        {
            r = Greenfoot.getRandomNumber(11);
            r2 = Greenfoot.getRandomNumber(11);
            timer++;
            if(s1==1)
            {
                setLocation(getX(),getY()+r);
            }
            if(s2==2)
            {
               setLocation(getX(),getY()-r2); 
            }
            if (getY() >= 480)
            {
                setLocation(854,280);
            }
            else if (getY() <= 0) 
            {
                setLocation(854,200); 
            }
            if(isTouching(Laser.class))
            {
                hp2--;
                removeTouching(Laser.class);
                if(hp2==0)
                {
                    boom();
                    Level1.score.add(100);
                }
            }
            if(timer == 120)
            {
                fire();
                Greenfoot.playSound("shot.wav");
                timer=0;
            }           
        }
        if(Core.level == 7)
        {
            timer++;
            move(-5);
            if(isTouching(Laser.class))
            {
                 boom();
                 Level1.score.add(10);
            }
            else if(isTouching(Hero.class))
            {
                 getWorld().removeObject(this);
                 Level1.healthpoint.add(-1);            
            }
            if(timer == 120)
            {
                fire();
                Greenfoot.playSound("shot.wav");
            }
        }
    }    
    public void boom()
    {
        getWorld().addObject(new Blast(), getX(), getY());
        removeTouching(Laser.class);
        Greenfoot.playSound("blast.wav");
        getWorld().removeObject(this);
    }  
    public void fire()
    {    
         Shot shot = new Shot();
         getWorld().addObject(shot, getX(), getY());         
         shot.setRotation(getRotation());
         shot.move(-10);
    }
}
