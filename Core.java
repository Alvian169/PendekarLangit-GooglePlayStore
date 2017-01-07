import greenfoot.*;
/**
 * Write a description of class Core here.
 * 
 * @author (Alvian) 
 * @version (1.0)
 */
public class Core extends World
{
    static Counter score = new Counter("score : ");
    static Counter healthpoint = new Counter("HP : ");
    static Counter ammo = new Counter("Ammo : ");
    static Counter highScore = new Counter("High Score : ");
    static Counter yourScore = new Counter("Your Score :");
    static GreenfootSound sound = new GreenfootSound("background.wav");
    static GreenfootSound sound2 = new GreenfootSound("over.wav");
    static GreenfootSound sound3 = new GreenfootSound("win.wav");
    static int HighScore = 0;
    static int HighScoreTemp = 0;
    Back back = new Back();
    End end = new End();
    Scroller img0, img1;
    static int level = 0;
    int timer = 0;
    int timer2 = 0;
    int timer3 = 0;
    int timer4 = 0;
    int timer5 = 0;
    int timer6 = 0;
    /**
     * Constructor for objects of class Core.
     * 
     */
    public Core()
    {    
        super(854, 480, 1, false);
    }
    public void createObstacle()
    {
        Obstacle obstacle = new Obstacle();
        addObject(obstacle, Greenfoot.getRandomNumber(854)+854, Greenfoot.getRandomNumber(154));
    }
    public void createObstacle2()
    {
        Obstacle obstacle2 = new Obstacle();
        addObject(obstacle2, Greenfoot.getRandomNumber(854)+854, Greenfoot.getRandomNumber(154)+326);
    }
    public void createDiamond() 
    {
        Diamond diamond = new Diamond();
        addObject(diamond, Greenfoot.getRandomNumber(854)+854, Greenfoot.getRandomNumber(240)+120);
    }
    public void createChicken()
    {
        Chicken chicken = new Chicken();
        addObject(chicken, Greenfoot.getRandomNumber(854)+854, Greenfoot.getRandomNumber(240)+120);
    }
}
