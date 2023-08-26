/**
 * Lampada
 */

import java.util.Random;

public class Lampada {

    enum estadosPossiveis {acesa, apagada, queimada};
    estadosPossiveis estadoAtual;

    public Lampada() {
        estadoAtual=estadosPossiveis.apagada;
    }

    public void acende(){
        if(estadoAtual==estadosPossiveis.apagada){
            Random rnd = new Random();
            if(rnd.nextInt(100)<30)
                estadoAtual=estadosPossiveis.queimada;
            else
                estadoAtual=estadosPossiveis.acesa;

        }
    }

    public void apaga(){
        if(estadoAtual!=estadosPossiveis.queimada)
            estadoAtual=estadosPossiveis.apagada;
    }

    public boolean estahAcesa(){
        return (estadoAtual==estadosPossiveis.acesa);
    }

    public boolean estahApagada(){
        return (estadoAtual==estadosPossiveis.apagada);
    }

    public boolean estahQueimada(){
        return (estadoAtual==estadosPossiveis.queimada);
    }
    
}