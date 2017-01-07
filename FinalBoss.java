import greenfoot.*;
/**
 * Write a description of class FinalBoss here.
 * 
 * @author (Alvian) 
 * @version (1.0)
 */
public class FinalBoss extends Core
{
    Label label = new Label("FINAL BOSS", 25);
    int x = 0, y = 0;
    boolean test = false;
    Bug bug6 = new Bug(5);
    /**
     * Constructor for objects of class FinalBoss.
     * 
     */
    public FinalBoss()
    {
        img0 = new Scroller(5);
        addObject(img0,getWidth()/2, getHeight()/2);
        img1 = new Scroller(5);
        addObject(img1,getWidth()+getWidth()/2,getHeight()/2);
        prepare();
    }
     private void prepare()
    {
        sound.playLoop();
        Hero hero = new Hero(Level1.n);
        addObject(hero,100,getHeight()/2);
        addObject(score,786,32);
        addObject(healthpoint,69,32);
        healthpoint.setValue(Menu.hp);
        addObject(ammo,getWidth()/2,32);
        ammo.setValue(Menu.ammo);
        addObject(label,getWidth()/2,450);
        addObject(Level1.control,50,430);
        addObject(Level1.control2,804,430);
        Level1.control2.setRotation(90);
        createObstacle();
        createObstacle2();
    }
    public void act()
    {
        level = 6;
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
            timer2++;
            if(timer2 == 600)
            {
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
        if(FinalBoss.score.getValue() == 600)
        {
            x=1;
            if(FinalBoss.score.getValue()>HighScore)
            {
                HighScoreTemp+=FinalBoss.score.getValue();
                HighScore=HighScoreTemp;
                highScore.setValue(HighScore);
            }
            yourScore.setValue(FinalBoss.score.getValue());
            addObject(highScore,340,340);
            addObject(yourScore,500,340);
        }
        if(x == 1)
        {
            Label label2 = new Label("WINNER", 100);
            addObject(label2,getWidth()/2,getHeight()/2);
            removeObject(label);
            Core.sound.stop();
            sound3.playLoop();
            test = true;
            addObject(back, 340, 450);
            addObject(end, 500, 450);
        }
        if(healthpoint.getValue() == 0)
        {
            y=1;
            if(FinalBoss.score.getValue()>HighScore)
            {
                HighScoreTemp+=FinalBoss.score.getValue();
                HighScore=HighScoreTemp;
                highScore.setValue(HighScore);
            }
            yourScore.setValue(FinalBoss.score.getValue());
            addObject(highScore,320,340);
            addObject(yourScore,520,340);
        }
        if(y == 1)
        {
            Label label2 = new Label("GAMEOVER", 100);
            addObject(label2,getWidth()/2,getHeight()/2);
            removeObject(label);
            sound.stop();
            sound2.playLoop();
            test = true;
            removeObject(bug6);
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
            if(Greenfoot.mousePressed(end))
            {
                Greenfoot.setWorld(new EndlessMode());
            }
        }
    }
    public void createEnemy()
    {
        addObject(bug6, 854, Greenfoot.getRandomNumber(200)+80);
    }
}
