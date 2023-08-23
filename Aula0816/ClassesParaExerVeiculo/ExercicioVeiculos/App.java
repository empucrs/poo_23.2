import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class App{
    public static void main(String args[]){

        // código válido para o item 3
        Scanner sc = new Scanner(System.in);
        Veiculo[] listaDeVeiculos = new Veiculo[5];
        listaDeVeiculos[0] = new Veiculo(new Placa("Brasil", "ABC0A00"), 50);
        listaDeVeiculos[1] = new Veiculo(new Placa("Brasil", "ABC0B01"), 55);
        listaDeVeiculos[2] = new Veiculo(new Placa("Brasil", "ABC0C02"), 60);
        listaDeVeiculos[3] = new Veiculo(new Placa("Brasil", "ABC0D03"), 45);
        listaDeVeiculos[4] = new Veiculo(new Placa("Brasil", "ABC0E04"), 50);

        int opcao;
        String placaInformada;
        do{

            System.out.println("\n-=-=-=-=-=-=-=-=-=");
            for(int i=0; i<listaDeVeiculos.length; i++)
                System.out.println("V["+i+"]: "+listaDeVeiculos[i].getPlaca().getCodigo());
            
                System.out.println("-=-=-=-=-=-=-=-=-=\n");
    
            System.out.println("Informe uma opção:");
            System.out.println("  1-Abastecer");
            System.out.println("  2-Digirir");
            System.out.println("  3-sair");
            System.out.print("Selecione a opcao: ");
        
            opcao=Integer.parseInt(sc.nextLine());

            // TRATAMENTO DA OPCAO ESCOLHIDA
            switch (opcao) {
                case 1:
                    // ABASTECIMENTO
                    System.out.println("A opção de abastecimento foi escolhida");
                    System.out.print("Informe a placa do veículo: ");
                    placaInformada=sc.nextLine();

                    Veiculo veiculoEscolhido=null;
                    for(int i=0; i<listaDeVeiculos.length; i++)
                      if(listaDeVeiculos[i].getPlaca().getCodigo().equals(placaInformada))
                        veiculoEscolhido=listaDeVeiculos[i];

                    if(veiculoEscolhido!=null){
                        System.out.println("Veículo encontrado");
                        double volume;
                        System.out.print("Informe o volume em litros a ser abastecido: ");
                        volume = Double.parseDouble(sc.nextLine());
                        System.out.println("-=-=-=-=-=-=-=-=-=\n");
                        System.out.println("Quantidade pré abastecimento: "+veiculoEscolhido.getCombustivelNoTanque());
                        veiculoEscolhido.abastece(volume);
                        System.out.println("Quantidade pós abastecimento: "+veiculoEscolhido.getCombustivelNoTanque());
                        System.out.println("-=-=-=-=-=-=-=-=-=\n");
                                        }
                    else
                        System.out.println("Veículo NÃO encontrado");
                      
                    break;
                case 2:
                    // DESLOCAMENTO
                    System.out.println("A opção de deslocamento foi escolhida");
                    System.out.print("Informe a placa do veículo: ");
                    placaInformada=sc.nextLine();

                    Veiculo veiculoASerdirigido=null;
                    for(int i=0; i<listaDeVeiculos.length; i++)
                      if(listaDeVeiculos[i].getPlaca().getCodigo().equals(placaInformada))
                        veiculoASerdirigido=listaDeVeiculos[i];

                    if(veiculoASerdirigido!=null){
                        System.out.println("Veículo encontrado");
                        double deslocamento;
                        System.out.print("Informe a distancia em quilometros a ser deslocado: ");
                        deslocamento = Double.parseDouble(sc.nextLine());
                        System.out.println("-=-=-=-=-=-=-=-=-=\n");
                        System.out.println("Distancia total pré deslocamento: "+veiculoASerdirigido.getQuilometragem());
                        veiculoASerdirigido.dirige(deslocamento);
                        System.out.println("Distancia total pós deslocamento: "+veiculoASerdirigido.getQuilometragem());
                        System.out.println("-=-=-=-=-=-=-=-=-=\n");
                    }
                    else
                        System.out.println("O veículo não foi encontrado");
                    break;            
                case 3:
                    // FECHAMENTO
                    System.out.println("A opção de saída foi escolhida");
                    break;            
                default:
                // MENSAGEM DE OPCAO INVALIDA
                    System.out.println("A opção é inválida");
                    break;
            }

        }while(opcao!=3);

        System.out.println("Listagem do estado de cada veículo");
        for(int i=0; i<listaDeVeiculos.length; i++)
            System.out.println(listaDeVeiculos[i]);
        
    }   
}
