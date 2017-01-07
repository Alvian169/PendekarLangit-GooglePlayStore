import greenfoot.*;
/**
 * Write a description of class EndlessMode here.
 * 
 * @author (Alvian) 
 * @version (1.0)
 */
public class EndlessMode extends Core
{
    Label label = new Label("ENDLESS MODE", 25);
    int x = 0, y = 0;
    boolean test = false;
    int timern = 0;
    /**
     * Constructor for objects of class EndlessMode.
     * 
     */
    public EndlessMode()
    {
        img0 = new Scroller(6);
        addObject(img0,getWidth()/2, getHeight()/2);
        img1 = new Scroller(6);
        addObject(img1,getWidth()+getWidth()/2,getHeight()/2);
        prepare();
    }
    private void prepare()
    {
        Hero.last =0;
        sound.playLoop();
        Hero hero = new Hero(Level1.n);
        addObject(hero,100,getHeight()/2);
        addObject(score,786,32);
        addObject(healthpoint,69,32);
        healthpoint.setValue(Menu.hp);
        addObject(ammo,getWidth()/2,32);
        ammo.setValue(Menu.ammo);
        addObject(label,getWidth()/2,400);
        addObject(Level1.control,50,430);
        addObject(Level1.control2,804,430);
        Level1.control2.setRotation(90);
        addObject(back, getWidth()/2, 450);
        createObstacle();
        createObstacle2();
    }
    public void act()
    {
        level = 7;
        sound3.stop();
        if(test == false){
        if(x==0 && y == 0)
        {
            timer++;
            if(timer == Level1.z)
            {
                timer = 0;
                img0.scroll();
                img1.scroll();
            }
            timern++;
            if(timern == 600)
            {
                timern=0;
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
        if(healthpoint.getValue() == 0)
        {
            y=1;
            if(EndlessMode.score.getValue()>HighScore)
            {
                HighScoreTemp+=EndlessMode.score.getValue();
                HighScore=HighScoreTemp;
                highScore.setValue(HighScore);
            }
            yourScore.setValue(EndlessMode.score.getValue());
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
        }
        if(Greenfoot.mousePressed(back))
         {
            Greenfoot.setWorld(new Menu());
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
        Bug bug7 = new Bug(6);
        addObject(bug7,Greenfoot.getRandomNumber(854)+854, Greenfoot.getRandomNumber(400)+40);
    }
}
