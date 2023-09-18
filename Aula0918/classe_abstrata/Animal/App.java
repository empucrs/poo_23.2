public class App {

    public static void main(String[] args) {
        Animal a;
        Cachorro c = new Cachorro("Rex", "canina", 10, "srd");
        Gato g = new Gato("Felix", "Felina", 0.3);

        c.emitirSom();
        g.emitirSom();

        a=c;
        a.emitirSom();
        a=g;
        a.emitirSom();

        c = (Cachorro) a;
        c.emitirSom();
    }
    
}