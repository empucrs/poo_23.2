public class Economy extends Passagem{

    public Economy(String c, String n, double v){
        super(c,n,v);
    }
    
    public double custoBagagem(int qtde, int [] pesos){
        super.custoBagagem(qtde, pesos);
        if(qtde>0)
            custoDasBagagens+=qtde*10.0;
        return custoDasBagagens;
      }
    
}
