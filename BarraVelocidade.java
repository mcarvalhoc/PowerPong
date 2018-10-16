import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BarraVelocidade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BarraVelocidade extends Actor
{
    /**
     * Act - do whatever the BarraVelocidade wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 
    public BarraVelocidade(){
        GreenfootImage img = new GreenfootImage(80, 15);
        img.setColor(Color.WHITE);
        img.drawRect(0, 0,img.getWidth()-1, img.getHeight()-1);
        setImage(img);
    }
    public void PontosDeAceleracao(){}
    
}
