/**
 * Principal
 */

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int opcao=0;
        Scanner sc = new Scanner(System.in);
        Lustre L = new Lustre(10);
        do{
            menu();
            opcao=Integer.parseInt(sc.nextLine());
            switch (opcao) {
                case 1:
                    System.out.println("Acendendo o Lustre");
                    L.acender();
                    break;            
                case 2:
                    System.out.println("Acendendo o Lustre");
                    L.apagar();
                    break;
                case 3:
                    if(L.haLampadaQueimada()){
                        System.out.println("Há lampadas queimadas no lustre. São elas:");
                        for (int i : L.listaLampadasQueimadas())
                            System.out.println("  Lampada "+i);
                        System.out.println("-=-=-=-=-");
                    }
            }

        }while(opcao!=0);
        System.out.println("Saindo do programa");        
    }

    public static void menu(){
        System.out.println("Lista de opcoes:");
        System.out.println("  1-Acender as lampadas do lustre");
        System.out.println("  2-Apagar as lampadas do lustre");
        System.out.println("  3-Analisar a condição das lampadas do lustre");
        System.out.println("  0-Sair");
        System.out.print("Escolha a opcao: ");
    }
    
}