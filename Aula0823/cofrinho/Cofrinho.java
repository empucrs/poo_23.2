import java.text.Normalizer;

public class Cofrinho {

    private final int max = 10;
    private int nroMoedas;
    private Moeda [] minhasMoedas;

    public Cofrinho(){
        nroMoedas=0;
        minhasMoedas=new Moeda[max];
    }
    
    public boolean insere(Moeda moeda){
        if((moeda!=null) && (nroMoedas<max)){
            minhasMoedas[nroMoedas]=moeda;
            nroMoedas++;
            return true;
        }
        return false;
    }
    public Moeda retira(){
        if(nroMoedas>0){
            nroMoedas--;
            Moeda aux = minhasMoedas[nroMoedas];
            minhasMoedas[nroMoedas]=null;
            return aux;
        }
        return null;
    }
    public int getQtdadeMoedas(){
        return nroMoedas;
    }
    public int getQtdadeMoedasTipo(NomeMoeda nomeMoeda){
        int qtde=0;
        for(int i=0; i<nroMoedas; i++)
            if(minhasMoedas[i].getNomeMoeda()==nomeMoeda)
                qtde++;
        return qtde;
    }
    public int getValorTotalCentavos(){
        int total=0;
        for(int i=0; i<nroMoedas; i++)
            total+=minhasMoedas[i].getValorCentavos();
        return total;
    }
    public double getValorTotalReais(){
        double total=0;
        for(int i=0; i<nroMoedas; i++)
            total+=minhasMoedas[i].getValorReais();
        return total;
    }
}
