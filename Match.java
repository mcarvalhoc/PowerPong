import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Match here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Match extends Actor


{
    private int contadorPartidas = 0;
    
   public Match(){
        GreenfootImage img = new GreenfootImage("Match.png");
        //img.fillRect(0, 0,img.getWidth()-1, img.getHeight()-1);
        setImage(img);
   }
}
