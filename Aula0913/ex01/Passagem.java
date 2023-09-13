public class Passagem{
  private String cpf;
  private String nome;
  private String assento;
  private double custoPassagem;
  protected double custoDasBagagens;

  public Passagem(String c, String n, double v){
    this.cpf=c;
    this.nome=n;
    this.custoPassagem=v;
    this.custoDasBagagens=0;
    this.assento=null;
  }

  public String getCPF(){
    return cpf;
  }

  public String getNome(){
    return nome;
  }

  public double getCustoPassagem(){

    double custoAssento = (this.assento==null)?0:5.0;

    return custoPassagem+custoAssento+custoDasBagagens;
  }

  public double custoBagagem(int qtde, int [] pesos){
    if(qtde<=0)
	    custoDasBagagens=0;
    else{
        custoDasBagagens=0;
        for(int i=0; i<qtde; i++)
            custoDasBagagens += pesos[i]*0.5;
    }
    return custoDasBagagens;
  }

  public double defineAssento(String a){
    if( (a!=null) && (! a.isEmpty()) ){
      assento=a;
      return 5.0;
    }
    else{
      assento=null;
      return 0.0;
    }
  }

  public String toString(){
    String aux;
    aux = "Passagem aérea: ("+this.getClass().getName()+")\n";
    aux+= "  Nome: "+this.nome+"\n";
    aux+= "  CPF:  "+this.cpf+"\n";
    aux+= "  Valor da Passagem: R$ "+this.custoPassagem+"\n";
    aux+= "  Valor do assento:  R$ "+((this.assento==null)?0.0:5.0)+"\n";
    aux+= "  Valor de bagagem:  R$ "+this.custoDasBagagens+"\n";
    aux+= "  -=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n";
    aux+= "  Total:             R$ "+getCustoPassagem()+"\n";
    
    return aux;
  }

}
