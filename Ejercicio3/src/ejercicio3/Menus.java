package ejercicio3;

import java.util.Scanner;

public class Menus {
    public Menus() {
        super();
    }
    
    public void menuInicio(){
        
        int select=0;
        Main d= new Main();
        Odontologos a =new Odontologos();
        Pacientes b = new Pacientes();
        Turnos c = new Turnos();
        
        Scanner opcion = new Scanner(System.in);
        this.clean();
        System.out.printf("|%s|%s|\n",1,"Odontologos");
        System.out.printf("|%s|%s|\n",2,"Pacientes  ");
        System.out.printf("|%s|%s|\n",3,"Turnos     ");
        System.out.printf("|%s|%s|\n",4,"Salir      ");
        System.out.println("Elija una opcion:");
        do{
            select = opcion.nextInt();
            if (select ==0 || select >4){
                System.out.println("El n° de opcion es incorrecto.");
            }
        }while (select ==0 || select >4);
        
        switch(select) {
            case 1: System.out.println("Odontologos");
                    a.verOdontologos();
            break;
            case 2: System.out.println("Pacientes");
                    b.verPacientes();
            break;
            case 3: System.out.println("Turnos");
                    this.menuTurnos();
            break;
            case 4: System.out.println("Salir");
                    d.salir();
            break;
        }
    }
    
    public void menuTurnos(){
        int select=0;
        Scanner eT = new Scanner(System.in);
        Turnos primer = new Turnos();
        
        this.clean();
        
        System.out.printf("|%s|%s|\n",1,"Ver Todos Los turnos        |");
        System.out.printf("|%s|%s|\n",2,"Ver Turnos de Odontologo    |");
        System.out.printf("|%s|%s|\n",3,"Ver Turnos solo por fecha   |");
        System.out.printf("|%s|%s|\n",4,"Ver Turnos sin reserva      |");
        System.out.printf("|%s|%s|\n",5,"Volver                      |");
        System.out.println("Elija una opcion:");
        do
            select=eT.nextInt();
        while(select==0||select>5);
        switch(select){
        case 1:
            primer.verTurnos();
            break;
        case 2:
            primer.turnosOdontologos();
            break;
        case 3:
            primer.turnosFecha();
            break;
        case 4:
            this.turnosLibres();
            break;
        case 5:
            this.menuInicio();
            break;
        default:
            System.out.println("");
            break;
        }
    }
    
    public void turnosLibres(){
        int select=0;
        Scanner eT = new Scanner(System.in);
        Turnos primer = new Turnos();
        
        this.clean();
        
        System.out.printf("|%s|%s|\n",1,"Ver por hora        |");
        System.out.printf("|%s|%s|\n",2,"Ver por fecha       |");
        System.out.printf("|%s|%s|\n",3,"Ver por odontologo  |");
        System.out.printf("|%s|%s|\n",4,"Volver              |");
        System.out.println("Elija una opcion:");
        do
            select=eT.nextInt();
        while(select==0||select>3);
        switch(select){
            case 1:
                primer.turnosLibresHora();
                break;
            case 2:
                primer.turnosLibresFecha();
                break;
            case 3:
                primer.turnosLibresOdo();
                break;
            case 4:
                this.menuTurnos();
                break;
        }
    }
    
    public void clean(){
        try{
            for(int i =0; i<5;i++){
            System.out.print("\n");
            System.out.flush();
            }
            
            //new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        } catch(Exception e){
            System.out.flush();
        }
    }
    
    public void waiting(){
        Scanner a=new Scanner(System.in);
        System.out.println("Precione una tecla para continuar...");
        a.next();
        this.clean();
    }
}
