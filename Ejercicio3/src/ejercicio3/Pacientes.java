package ejercicio3;

public class Pacientes {
    private Menus menu = new Menus();
    private String nombres[]={"Angel","Raul","Federico"};
    
    
    public Pacientes() {
        super();
    }
    
    public void verPacientes(){
        System.out.printf("|%s|%s|\n",1,"Listado");

        for (int i =0; i<this.getLongPa();i++){
            System.out.print(i+"|"+this.getPaciente(i)+" ");
        }
        System.out.println(" ");
        menu.waiting();
        menu.menuInicio();
        
    }
    
    public String getPaciente(int i){
        return this.nombres[i];
    }
    
    public int getLongPa(){
        return this.nombres.length;
    }

}
