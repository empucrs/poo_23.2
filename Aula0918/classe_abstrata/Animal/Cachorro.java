/**
 * Cachorro
 */
public class Cachorro extends Animal{

    public String raca;

    public Cachorro(String n, String e, double p, String r) {
        super(n,e,p);
        raca=r;
    }

    public String getRaca(){
        return raca;
    }

    public void emitirSom(){
        System.out.println("au au auuuuuu");
    }
    
}