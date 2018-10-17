import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlacarTime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlacarTime extends Actor
{
    public int valor = 20;

    /**
     * Act - do whatever the PlacarTime wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        atualizaImagem(valor);        
    }    
    private void atualizaImagem(int valor){
        GreenfootImage Time = new GreenfootImage(converteNumero(valor), 24, Color.WHITE, new Color(0,0,0,0),Color.BLACK);
        setImage(Time);
    }

    public PlacarTime(){
        atualizaImagem(valor);
    }

    private String converteNumero(int valor){
        return String.format("%02d", valor);
    }  
}
