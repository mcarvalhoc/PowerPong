import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Bola here.
 * @author (your name) @version (a version number or a date)
 */
public class Bola extends Actor
{
    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    private boolean possoGirar = true;
    /**
     * 
     */
    public void act()
    {
        movimentoBola();
        tocarPad();
    }

    public void movimentoBola(){
        move(10);
        if((isTouching(BarraLateral.class) || isAtEdge()) && this.possoGirar){
            turn(160);
            this.possoGirar = false;
        }        
        if(!isAtEdge() && !isTouching(BarraLateral.class) ){
            this.possoGirar = true;
        } 
         if((isTouching(BarraLateral2.class) || isAtEdge()) && this.possoGirar){
            turn(160);
            this.possoGirar = false;
        }        
         if(!isAtEdge() && !isTouching(BarraLateral2.class) ){
            this.possoGirar = true;
        }
    }

    public void tocarPad(){
        Actor Pong = getOneIntersectingObject(Pong.class);
        Actor Pong2 =  getOneIntersectingObject(Pong2.class);
        if(Pong != null){
            turn(190);
        }
        else if(Pong2 != null){
            turn(190);
        }
    }
    
    public void somaPontoUm(){
        if(getX()>= 599){
            MyWorld World =(MyWorld) getWorld();
            World.acrescentaPontosUm(10);
        }
    }

    public void somaPontoDois(){
        if(getX()<=1){
            MyWorld World = (MyWorld) getWorld();
            World.acrescentaPontosDois(10);
        }
    }

    public  Bola(){
        GreenfootImage img = new GreenfootImage(18, 17);
        img.setColor(Color.WHITE);
        img.fillRect(0, 0,img.getWidth()-1, img.getHeight()-1);
        setImage(img);

    }
}

