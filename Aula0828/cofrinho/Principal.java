import java.util.Scanner;

public class Principal {    
    public static void main(String[] args) {
        //cria um cofrinho e insere 10 moedas
        System.out.println("Criando o porquinho");
        Cofrinho meuPorquinho = new Cofrinho();

        System.out.println("Inserindo dez moedas");
        meuPorquinho.insere(new Moeda(NomeMoeda.UmReal));     //1.00
        meuPorquinho.insere(new Moeda(NomeMoeda.Cinquenta));  //1.50
        meuPorquinho.insere(new Moeda(NomeMoeda.VinteCinco)); //1.75
        meuPorquinho.insere(new Moeda(NomeMoeda.Dez));        //1.85
        meuPorquinho.insere(new Moeda(NomeMoeda.Cinco));      //1.90
        meuPorquinho.insere(new Moeda(NomeMoeda.Um));         //1.91
        meuPorquinho.insere(new Moeda(NomeMoeda.VinteCinco)); //2.16
        meuPorquinho.insere(new Moeda(NomeMoeda.Cinquenta));  //2.66
        meuPorquinho.insere(new Moeda(NomeMoeda.VinteCinco)); //2.91
        meuPorquinho.insere(new Moeda(NomeMoeda.Um));         //2.92
        
        //a. Quantas moedas foram armazenadas no cofrinho.
        System.out.println("  Nro de moedas inseridas: "+ meuPorquinho.getQtdadeMoedas());

        //b. Quantas moedas de um real estão armazenadas no cofrinho.
        System.out.println("  Nro de moedas de um real: "+meuPorquinho.getQtdadeMoedasTipo(NomeMoeda.UmReal));

        //c. Quantas moedas de 50 centavos estão armazenadas no cofrinho.
        System.out.println("  Nro de moedas de 50 centavos: "+meuPorquinho.getQtdadeMoedasTipo(NomeMoeda.Cinquenta));

        //d. Qual o valor total em centavos armazenado no cofrinho.
        System.out.println("  Total em centavos: "+meuPorquinho.getValorTotalCentavos());

        //e. Qual o valor total em reais armazenado no cofrinho.
        System.out.println("  Total em reais: "+meuPorquinho.getValorTotalReais());

        //f. Qual o valor total em centavos armazenado no cofrinho após a retirada das duas últimas moedas inseridas.
        meuPorquinho.retira();
        meuPorquinho.retira();
        System.out.println("  Total em centavos após retirar duas moedas: "+meuPorquinho.getValorTotalCentavos());


        // ATIVIDADE EXTRA
        int opcao=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Escolha uma das opções");
            System.out.println("  0- Sair");
            System.out.println("  1- Inserir moeda");
            System.out.println("  2- Retirar moeda");
            System.out.print("Digite um valor válido: ");
            opcao=Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    int escolha=0;
                    System.out.println("A opção de inserção foi escolhida\n");
                    System.out.println("Insira uma moeda: ");
                    System.out.println("  1- Um real");
                    System.out.println("  2- Cinquenta centavos");
                    System.out.println("  3- Vinte e cinco centavos");
                    System.out.println("  4- Dez centavos");
                    System.out.println("  5- Cinco centavos");
                    System.out.println("  6- Um centavos");
                    System.out.println("  0- Desistir da operacao");
                    System.out.print("Informe a opcao: ");
                    escolha=Integer.parseInt(sc.nextLine());
                    Moeda moedaEscolhida=null;
                    switch (escolha) {
                        case 1:
                            moedaEscolhida=new Moeda(NomeMoeda.UmReal);
                            break;                    
                        case 2:
                            moedaEscolhida=new Moeda(NomeMoeda.Cinquenta);
                            break;                    
                        case 3:
                            moedaEscolhida=new Moeda(NomeMoeda.VinteCinco);
                            break;                    
                        case 4:
                            moedaEscolhida=new Moeda(NomeMoeda.Dez);
                            break;                    
                        case 5:
                            moedaEscolhida=new Moeda(NomeMoeda.Cinco);
                            break;                    
                        case 6:
                            moedaEscolhida=new Moeda(NomeMoeda.Um);
                            break;                    
                    }

                    if((moedaEscolhida!=null)&&(meuPorquinho.insere(moedaEscolhida)))
                        System.out.println("Moeda inserida com sucesso");
                    else
                        System.out.println("Não foi possível inserir a moeda");                        
                    break;
                case 2:
                    System.out.println("A opção de retirada foi escolhida\n");
                    Moeda retirada=meuPorquinho.retira();
                    if(retirada!=null)
                        System.out.println("  Uma moeda de "+retirada.getNomeMoeda()+ " foi removida.");                    
                    break;            
            }

            if((opcao==1)||(opcao==2)){
                System.out.println("Resultado pos operacao");
                System.out.println("  O cofre possui "+meuPorquinho.getQtdadeMoedas()+" moedas");
                System.out.println("  O saldo atual é de "+meuPorquinho.getValorTotalCentavos()+" centavos");
            }            

        }while(opcao!=0);

        System.out.println("Fim do programa");

    }

}
