public abstract class Animal {
    private String nome;
    private String especie;
    private double peso;

    public Animal(String n, String e, double p){
        nome=n;
        especie=e;
        peso=p;
    }

    public String getNome(){
        return nome;
    }
    public String getEspecie(){
        return especie;
    }
    public double getPeso(){
        return peso;
    }

    public abstract void emitirSom();
    
}