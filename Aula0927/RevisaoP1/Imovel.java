public abstract class Imovel {

    private String proprietario;
    private int areaConstruida;
    private Geo localizacao;
    private static int VR=1;

    public Imovel(String prop, int area, Geo local){
        proprietario=prop;
        areaConstruida=area;
        localizacao=local;
    }

    public void setVR(int valor){
        VR=valor;
    }

    public int getVR(){
        return VR;
    }

    public String getProprietario(){
        return proprietario;
    }

    public int getAreaConstruida(){
        return areaConstruida;
    }

    public abstract double calculaImposto();

    public String toString(){

        String resultado;
        resultado="{\n";
        resultado+="  proprietario: "+proprietario+"\n";
        resultado+="  areaConstruida: "+areaConstruida+"\n";
        resultado+="  localização: "+localizacao+"\n";
        resultado+="  imposto: "+calculaImposto()+"\n";
        resultado+="}\n";
        return resultado;

    }
    
}
