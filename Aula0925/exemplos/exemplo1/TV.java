public class TV implements Controlavel {

    private boolean ligada;
    private int canal;

    public TV(){        
        canal=1;
        ligada=false;
    }

    @Override
    public void ligar() {        
        System.out.println("Ligando a TV");
        ligada=true;
    }

    @Override
    public void desligar() {
        System.out.println("Desligando a TV");
        ligada=false;
    }

    @Override
    public boolean isLigada() {
        return ligada;
    }    

    public void mudaCanal(int novoCanal){
        canal=novoCanal;
    }

    public int getCanal(){
        return canal;
    }
    
}
