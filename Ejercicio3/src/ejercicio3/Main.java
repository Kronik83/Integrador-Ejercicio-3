package ejercicio3;
import java.util.Scanner;

public class Main {
    public Main() {
        super();
    }

    public static void main(String[] args) {
        Main main = new Main();

        Menus uno = new Menus();
        
        System.out.println("Bienvenido al Sistema de Agenda de Odontologia");
        
        uno.menuInicio();
        
    }
    public void salir(){
        System.exit(0);
    }
}