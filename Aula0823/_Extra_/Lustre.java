/**
 * Lustre
 */
public class Lustre {

    Lampada listaDeLampadas[];

    public Lustre(int nLampadas) {

        listaDeLampadas = new Lampada[nLampadas];
        for (int i = 0; i < listaDeLampadas.length; i++) {
            listaDeLampadas[i] = new Lampada();
        }
        
    }

    public boolean haLampadaQueimada(){
        boolean resultado=false;
        for (Lampada l : listaDeLampadas)
            resultado |= l.estahQueimada();
        return resultado;
    }

    public int[] listaLampadasQueimadas(){
        int nQueimadas=0;
        for (Lampada l : listaDeLampadas)
            if(l.estahQueimada())
                nQueimadas++;
        if(nQueimadas==0)
            return null;
        else{
            int lista[] = new int[nQueimadas], count=0;
            
            for(int i=0; i<listaDeLampadas.length; i++)
                if(listaDeLampadas[i].estahQueimada()){
                    lista[count]=i;
                    count++;
                }
            return lista;
        }        
    }

    public void acender(){
        for (Lampada l : listaDeLampadas)
            l.acende();
    }

    public void apagar(){
        for (Lampada l : listaDeLampadas)
            l.apaga();
    }

}