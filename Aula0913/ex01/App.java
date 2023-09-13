public class App {

    public static void main(String[] args) {
        Passagem p = new Passagem("000.111.222-33", "Edson Moreno", 1230.37);
        System.out.println(p);

        p.defineAssento("15F");
        System.out.println(p);

        int [] pesos = new int [3];
        pesos[0]=32;
        pesos[1]=16;
        pesos[2]=8;
        p.custoBagagem(2, pesos);
        System.out.println(p);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
        Economy e = new Economy("000.111.222-33", "Edson Moreno", 1230.37);
        System.out.println(e);

        e.defineAssento("15F");
        System.out.println(e);

        pesos[0]=32;
        pesos[1]=16;
        e.custoBagagem(2, pesos);
        System.out.println(e);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
        Executive x = new Executive("000.111.222-33", "Edson Moreno", 1230.37);
        System.out.println(x);

        x.defineAssento("15F");
        System.out.println(x);

        x.custoBagagem(2, pesos);
        System.out.println(x);

        x.custoBagagem(3, pesos);
        System.out.println(x);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
        Premier r = new Premier("000.111.222-33", "Edson Moreno", 1230.37);
        System.out.println(r);

        r.defineAssento("15F");
        System.out.println(r);

        r.custoBagagem(2, pesos);
        System.out.println(r);

        r.custoBagagem(3, pesos);
        System.out.println(r);

    }
    
}
