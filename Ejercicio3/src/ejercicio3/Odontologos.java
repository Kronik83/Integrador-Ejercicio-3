package ejercicio3;

import java.util.Scanner;

public class Odontologos {
    private String odontologo[]={"Andres","Mario","Pablo"};
    private Menus menu =new Menus();
    public Odontologos() {
        super();
    }
    
    public void verOdontologos(){
        int select=0;
        String newOdontologo="";
        Scanner opcion = new Scanner(System.in);
        
        System.out.printf("|%s|%s|\n",1,"Listado");

        for (int i =0; i<this.getLongOd();i++){
            System.out.print(i+"-"+this.getNombre(i)+" ");
        }
        System.out.println(" ");
        menu.waiting();
        menu.menuInicio();

    }
    
    
    public String getNombre(int i){
        return this.odontologo[i];
    }
    
    public int getLongOd(){
        return this.odontologo.length;
    }
}
