import java.util.ArrayList;

public class Cofrinho {

    private ArrayList<Moeda> minhasMoedas;

    public Cofrinho(){
        minhasMoedas=new ArrayList<>();
    }
    
    public boolean insere(Moeda moeda){
        minhasMoedas.add(moeda);
        return true;
    }
    public Moeda retira(){
        if(minhasMoedas.isEmpty())
            return null;        
        Moeda aux = minhasMoedas.remove(minhasMoedas.size()-1);
        return aux;
    }
    public int getQtdadeMoedas(){
        return minhasMoedas.size();
    }
    public int getQtdadeMoedasTipo(NomeMoeda nomeMoeda){
        int qtde=0;
        for (Moeda m : minhasMoedas) 
            if(m.getNomeMoeda()==nomeMoeda)
                qtde++;
        return qtde;
    }
    public int getValorTotalCentavos(){
        int total=0;
        for (Moeda m : minhasMoedas) 
            total+=m.getValorCentavos();
        return total;
    }
    public double getValorTotalReais(){
        double total=0;
        for (Moeda m : minhasMoedas) 
            total+=m.getValorReais();
        return total;
    }
}
