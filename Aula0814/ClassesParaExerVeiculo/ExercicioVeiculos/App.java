public class App{
    public static void main(String args[]){
        /*
        // código válido para os itens 1 e 2
        if(args.length!=3){
            System.out.println("Faltam parâmetros");
            return;
        }

        String placaInformada=args[0];

        double combustivelInformado=0;
        try{
            combustivelInformado=Double.parseDouble(args[1]);
        }
        catch(Exception e){
            System.out.println("Erro de formato do segundo parâmetro");
        }

        double distanciaInformada=Double.parseDouble(args[2]);

        System.out.println("Argumentos informados:");
        System.out.println("  arg0 -> placa: "+placaInformada);

        System.out.println("  arg1 -> combustivel: "+combustivelInformado);
        System.out.println("  arg2 -> distancia: "+distanciaInformada);

        Placa p1 = new Placa("Brasil",placaInformada);
        
        Veiculo v = new Veiculo(p1, 20);
        System.out.println("Dados do veiculo antes de abastecer:");
        System.out.println(v);
        System.out.println("----------------");

        v.abastece(combustivelInformado);
        System.out.println("Dados do veiculo depois de abastecer:");
        System.out.println(v);
        System.out.println("----------------");

        double distanciaPercorrida=v.dirige(distanciaInformada);
        System.out.println("Dados do veiculo depois de percorrer "+distanciaPercorrida+"Km:");
        System.out.println(v);
        System.out.println("----------------");
         */

        // código válido para o item 3
        Veiculo[] listaDeVeiculos = new Veiculo[5];
        listaDeVeiculos[0] = new Veiculo(new Placa("Brasil", "ABC0A00"), 50);
        listaDeVeiculos[1] = new Veiculo(new Placa("Brasil", "ABC0B01"), 55);
        listaDeVeiculos[2] = new Veiculo(new Placa("Brasil", "ABC0C02"), 60);
        listaDeVeiculos[3] = new Veiculo(new Placa("Brasil", "ABC0D03"), 45);
        listaDeVeiculos[4] = new Veiculo(new Placa("Brasil", "ABC0E04"), 50);

        int opcao;
        do{
            System.out.println("Informe uma opção:");
            System.out.println("  1-Abastecer");
            System.out.println("  2-Digirir");
            System.out.println("  3-sair");
            System.out.print("Selecione a opcao: ");

            PAREI AQUI....

        }while(opcao!=3);

        }
}