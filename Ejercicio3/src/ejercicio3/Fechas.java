package ejercicio3;

public class Fechas {
    private String fecha[]={"07","14","21","28"};
    public Fechas() {
        super();
    }
    public String getFecha(int i){
        return this.fecha[i];
    }
    public int getLongFe(){
        return this.fecha.length;
    }
}
