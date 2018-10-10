import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Bola here.
 * @author (your name) @version (a version number or a date)
 */
public class Bola extends Actor
{
    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    protected boolean possoAndarParaDireita = false;
    protected boolean possoAndarParaEsquerda = false;
    protected boolean possoAndarParaCima = false;
    protected boolean possoAndarParaBaixo = false;
    protected boolean possoAndarParaDiagonalCimaDireita = false;
    protected boolean possoAndarParaDiagonalDireitaBaixo = false;
    protected boolean possoAndarParaDiagonalBaixoEsquerda = false;
    protected boolean possoAndarParaDiagonalEsquerdaCima = false;
    /**
     * 
     */
    public void act()
    {
        
        andarFrente();
        if (this.possoAndarParaDireita) {
            andarFrente();
        }
        if(this.possoAndarParaEsquerda){
            andarTras();
        }
        if(this.possoAndarParaCima){
            andarCima();
        }
        if(this.possoAndarParaBaixo){
            andarBaixo();
        }
        if(this.possoAndarParaDiagonalCimaDireita){
            andarDiagonalCD();
        }        
        if(this.possoAndarParaDiagonalDireitaBaixo){
            andarDiagonalDB();
        }                
        if(this.possoAndarParaDiagonalBaixoEsquerda){
            andarDiagonalBE();
        }        
        if(this.possoAndarParaDiagonalEsquerdaCima){
            andarDiagonalEC();
        }
    }
    
    /**
     * 
     */
    public void andarFrente()
    {
        setLocation(getX() + 5, getY());
    }
    /**
     * 
     */
    public void vaParaFrente()
    {
        this.possoAndarParaDireita = true;
    }
    /**
     * 
     */
    public void andarTras()
    {
        //setLocation(getX() - 5, getY());
    }
    /**
     * 
     */
    public void vaParaTras()
    {
        this.possoAndarParaEsquerda = true;
    }
    /**
     * 
     */
    public void andarBaixo()
    {
        //setLocation(getX() , getY() + 5);
    }
    /**
     * 
     */
    public void vaParaBaixo()
    {
        this.possoAndarParaBaixo = true;
    }
    /**
     * 
     */
    public void andarCima()
    {
        //setLocation(getX(), getY()-5);
    }
    /**
     * 
     */
    public void vaParaCima()
    {
        this.possoAndarParaCima = true;
    }
    /**
     * 
     */
    public void andarDiagonalCD()
    {
        //setLocation(getX() + 5, getY()-5);
    }
    /**
     * 
     */
    public void vaParaDiagonalCD()
    {
        this.possoAndarParaDiagonalCimaDireita = true;
    }
    /**
     * 
     */
    public void andarDiagonalDB()
    {
        //setLocation(getX() + 5, getY() + 5);
    }
    /**
     * 
     */
    public void vaParaDiagonalDB()
    {
        this.possoAndarParaDiagonalDireitaBaixo = true;
    }
    /**
     * 
     */
    public void andarDiagonalBE()
    {
        //setLocation(getX() - 5, getY() - 5);
    }
    /**
     * 
     */
    public void vaParaDiagonalBE()
    {
        this.possoAndarParaDiagonalBaixoEsquerda = true;
    }
    /**
     * 
     */
    public void andarDiagonalEC()
    {
        //setLocation(getX() - 5, getY() + 5);
    }
    /**
     * 
     */
    public void vaParaDiagonalEC()
    {
        this.possoAndarParaDiagonalEsquerdaCima = true;
    }
    public Bola(){
        GreenfootImage img = new GreenfootImage(18, 18);
        img.setColor(Color.WHITE);
        img.fillRect(0, 0,img.getWidth()-1, img.getHeight()-1);
        setImage(img);
        
    }
}

