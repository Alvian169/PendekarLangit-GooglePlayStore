import greenfoot.*;
/**
 * Write a description of class Menu here.
 * 
 * @author (Alvian) 
 * @version (1.0)
 */
public class Menu extends World
{    
    Play play = new Play();
    Help help = new Help();
    Easy easy = new Easy();
    Hard hard = new Hard();
    Credits credits = new Credits();
    Image title1 = new Image(31);
    Image title2 = new Image(32);
    Image title3 = new Image(33);
    Image title4 = new Image(34);
    Image title5 = new Image(35);
    Image title6 = new Image(36);
    Image title7 = new Image(37);
    int timer = 0;
    static String username;
    static int ammo;
    static int hp;
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {
        super(854, 480, 1);
        setBackground("Menu.png");
        prepare();
    }
    public void prepare()
    {        
        addObject(play, 330, 410);
        addObject(help, 524, 410);
        addObject(credits, 810, 466);
    }
    public void act()
    {
        Hero.last = 0;
        Core.sound2.stop();
        timer++;
        if(timer >= 0)
        {            
            addObject(title1, 427, 210);
        }
        if(timer >= 60)
        {
            removeObject(title1);
            addObject(title2, 427, 210);
        }
        if(timer >= 120)
        {
            removeObject(title2);
            addObject(title3, 427, 210);
        }
        if(timer >= 180)
        {
            removeObject(title3);
            addObject(title4, 427, 210);
        }
        if(timer >= 240)
        {
            removeObject(title4);
            addObject(title5, 427, 210);
        }
        if(timer >= 300)
        {
            removeObject(title5);
            addObject(title6, 427, 210);
        }
        if(timer >= 360)
        {
            removeObject(title6);
            addObject(title7, 427, 210);
        }
        if(timer == 420)
        {
            removeObject(title7);
            timer = 0;
        }
        if(Greenfoot.mouseClicked(play))
        {
            Greenfoot.playSound("button.wav");            
            addObject(easy, 40, 440);
            addObject(hard, 100, 440);            
        }
        if(Greenfoot.mouseClicked(help))
        {
            Greenfoot.playSound("button.wav");
            Greenfoot.setWorld(new Support());
        }
        if(Greenfoot.mouseClicked(easy))
        {
            Greenfoot.playSound("playing.wav");
            this.username = Greenfoot.ask("Type Your Name");
            if(this.username.equalsIgnoreCase("alvian"))
            {
                ammo = 999;
                hp = 999;
            }
            else
            {
                ammo = 20;
                hp = 20;
            }
            Greenfoot.setWorld(new Choose());
        }
        else if(Greenfoot.mouseClicked(hard))
        {
            Greenfoot.playSound("playing.wav");
            this.username = Greenfoot.ask("Type Your Name");
            if(this.username.equalsIgnoreCase("alvian"))
            {
                ammo = 999;
                hp = 999;
            }
            else
            {
                ammo = 10;
                hp = 10;
            }
            Greenfoot.setWorld(new Choose());
        }
        if(Greenfoot.mouseClicked(credits))
        {
            Greenfoot.playSound("button.wav");
            Greenfoot.setWorld(new Credit());
        }
    }
}
