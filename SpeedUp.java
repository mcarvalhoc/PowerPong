import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class SpeedUp extends Actor
{

    public int proximoPasso = 0; 

    /**
     * Act - do whatever the SpeedUp wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        trocaImg1();
        voltaImg();
        trocaImg2();
        voltaImg();
    }
    
    public void trocaImg1(){
        setImage(new GreenfootImage("SpeedUp_"+proximoPasso+".png"));
        Jogo mundo = getWorldOfType(Jogo.class);
        if(mundo.tempoQuaseZero()){
            proximoPasso = proximoPasso + 1;
        }
    }
    
    public void trocaImg2(){
        setImage(new GreenfootImage("SpeedUp_"+proximoPasso+".png"));
        Jogo mundo = getWorldOfType(Jogo.class);
        if(mundo.oTempoEstaZerado()){
            proximoPasso = proximoPasso + 1;
        }
    }
    
    public void voltaImg(){

        if(proximoPasso == 4){
            proximoPasso = 0;

        }
    }
}
