public class Gato extends Animal {
    private int nroDeVidaRestante;
    public Gato(String n, String e, double p){
        super(n,e,p);
        nroDeVidaRestante=7;
    }

    public int getNroDeVidasRestantes(){
        return nroDeVidaRestante;
    }

    public void morreuGato(){
        if(nroDeVidaRestante>0)
            nroDeVidaRestante--;
    }

    public void emitirSom(){
        System.out.println("miauuuuuuuu");
    }    
}