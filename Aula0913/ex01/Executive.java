public class Executive extends Passagem{

    public Executive(String c, String n, double v){
      super(c, n, v);
    }
  
    public double custoBagagem(int qtde, int [] pesos){
        if(qtde<=2)
          custoDasBagagens=0;
      else{
          custoDasBagagens=0;
          for(int i=2; i<qtde; i++)
              custoDasBagagens += pesos[i]*0.5;
      }
      return custoDasBagagens;
    }
  
    public int getMilhas(){
        return ((int)getCustoPassagem())/10;
      }
    
    public String toString(){
      String aux=super.toString();
      aux+= "  -=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n";
      aux+= "  Milhas:   "+getMilhas()+"\n";
      
      return aux;
    }
  }
  
  