package ejercicio3;

public class Horarios {
    private String horas[]={"09:00","09:30","10:00","10:30","11:00","11:30"};
    public Horarios() {
        super();
    }
    public String getHora(int i){
        return this.horas[i];
    }
    public int getLongHo(){
        return this.horas.length;
    }
}
