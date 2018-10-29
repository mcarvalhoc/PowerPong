import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ranking extends World
{
    GreenfootSound sound = new GreenfootSound("SomRanking.wav");
    /**
     * Constructor for objects of class Ranking.
     */
    public Ranking()
    {
        super(700, 390, 1);
        prepare();
    }

    public void act(){
        showText("Nome Jogador", 200, 30);
        showText("Pontuação", 400, 30);
        sound.play();
    }

    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {

        VoltarInicioRanking voltarinicioranking = new VoltarInicioRanking();
        addObject(voltarinicioranking,355,331);
    }
    
    public void desligaSom(){
       sound.stop();
    }
}
