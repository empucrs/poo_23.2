public class Main {

    public static void main(String[] args) {

        Residencial r = new Residencial("Edson Moreno", 128, new Geo(1000,1000), 200);
        System.out.println(r);
        System.out.println("-=-=-=-=-=-=-");
        r = new Residencial("Silvia Casonato", 250, new Geo(1001,1001), 500);
        System.out.println(r);
        System.out.println("-=-=-=-=-=-=-");
        r = new Residencial("Magnata da Silva", 800, new Geo(4001,4001), 1500);
        System.out.println(r);
        
    }

    
}