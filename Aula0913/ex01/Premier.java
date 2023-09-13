public class Premier extends Executive{

    public Premier(String c, String n, double v) {
        super(c, n, v);
    }

    public double custoBagagem(int qtde, int [] pesos){
        super.custoBagagem(qtde, pesos);
        custoDasBagagens=custoDasBagagens/2;
        return custoDasBagagens;        
    }

    public int getMilhas(){
        return ((int)((getCustoPassagem())* 0.2));
    }
  





    
}