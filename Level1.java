import greenfoot.*;
/**
 * Write a description of class Level1 here.
 * 
 * @author (Alvian) 
 * @version (1.0)
 */
public class Level1 extends Core
{
    Label label = new Label("LEVEL 1", 25);
    static Control control = new Control();
    static Control control2 = new Control();    
    int x = 0, y = 0;
    static int z;
    static int n;
    boolean test = false;
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {
        img0 = new Scroller(0);
        addObject(img0,getWidth()/2, getHeight()/2);
        img1 = new Scroller(0);
        addObject(img1,getWidth()+getWidth()/2,getHeight()/2);
        prepare();   
    }
    private void prepare()
    {
        sound.playLoop();
        Hero hero = new Hero(n);
        addObject(hero,100,getHeight()/2);
        addObject(score,786,32);
        score.setValue(0);
        addObject(healthpoint,69,32);
        healthpoint.setValue(Menu.hp);
        addObject(ammo,getWidth()/2,32);
        ammo.setValue(Menu.ammo);
        addObject(label,getWidth()/2,450);
        addObject(control,50,430);
        addObject(control2,804,430);
        control2.setRotation(90);
        createObstacle();
        createObstacle2();
    }
    public void act()
    {
        level = 1;
        if(test == false){
        if(x==0 && y == 0)
        {
            timer++;
            if(timer == z)
            {
                timer = 0;
                img0.scroll();
                img1.scroll();
            }
            timer2++;
            if(timer2 == 600)
            {
                timer2 = 0;
                createEnemy();
            }
            timer3++;
            if(timer3 == 240)
            {
                timer3 = 0;
                for(int i=0;i<5;i++)
                {
                    createObstacle();
                    createObstacle2();
                }
            }
            timer4++;
            if(timer4 == 1140)
            {
                timer4 = 0;
                createDiamond();
            }
            timer5++;
            if(timer5 == 1200)
            {
                timer5 = 0;
                createChicken();
            }
        }
        if(Level1.score.getValue() == 100)
        {
            x=1;
        }
        if(x == 1)
        {
            Greenfoot.setWorld(new Level2());
        }
        if(healthpoint.getValue() == 0)
        {
            y=1;            
            if(Level1.score.getValue()>HighScore)
            {
                HighScoreTemp+=Level1.score.getValue();
                HighScore=HighScoreTemp;
                highScore.setValue(HighScore);
            }
            yourScore.setValue(Level1.score.getValue());
            addObject(highScore,340,340);
            addObject(yourScore,500,340);
        }
        if(y == 1)
        {
            Label label2 = new Label("GAMEOVER", 100);
            addObject(label2,getWidth()/2,getHeight()/2);
            removeObject(label);
            sound.stop();
            sound2.playLoop();
            test = true;           
            addObject(back, getWidth()/2, 450);
        }       
        }
        else if(test == true)
        {
            if(healthpoint.getValue()<=0)
            {
                healthpoint.setValue(0);
            }
            Hero.last = 1;
            if(Greenfoot.mousePressed(back))
            {
                Greenfoot.setWorld(new Menu());
            }
        }
    }
    public void createEnemy()
    {
        Bug bug1 = new Bug(0);
        addObject(bug1, Greenfoot.getRandomNumber(854)+854, Greenfoot.getRandomNumber(400)+40);
    }
}
