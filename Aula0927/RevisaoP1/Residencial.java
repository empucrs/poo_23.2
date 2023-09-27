public class Residencial extends Imovel{

    private int areaTerreno;

    public Residencial(String prop, int area, Geo local, int terreno){
        super(prop, area, local);
        areaTerreno=terreno;
    }

    public int getAreaTerreno(){
        return areaTerreno;
    }

    @Override
    public double calculaImposto() {

        int resultado;
        if(getAreaConstruida()<=200)
            resultado=0;
        else
            resultado=getAreaConstruida()-200;

        resultado=resultado*getVR();

        if(areaTerreno>1000)
            resultado+=100*getVR();

        return resultado;
    }

    public String toString(){
        String resultado = super.toString();
        if(areaTerreno>1000)
            resultado+="\n  --> Há imposto adicional area de terreno superior a 1000m2\n";
        return resultado;            
    }

    
}