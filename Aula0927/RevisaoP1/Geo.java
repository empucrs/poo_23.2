public class Geo {

    private double latitude;
    private double longitude;

    public Geo(double lat, double lon){
        latitude=lat;
        longitude=lon;
    }

    public double getLatitude(){
        return latitude;
    }

    public double getLongitude(){
        return longitude;
    }

    public String toString(){
        String resultado;
        resultado ="{\n";
        resultado+="  latitude: "+latitude+"\n";
        resultado+="  longitude: "+longitude+"\n";
        resultado+="}\n";
        return resultado;
    }

    
}