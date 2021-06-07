package ejercicio3;


import java.util.Scanner;

public class Turnos {
    private int turno[][]={{1,1,2,1},{0,2,1,0},{0,3,5,2},{2,0,0,1}};
    
    private Fechas day = new Fechas();
    private Pacientes paci = new Pacientes();
    private Horarios hora = new Horarios();
    private Odontologos odon = new Odontologos();
    private Scanner eT = new Scanner(System.in);
    private Menus back = new Menus();
    private String odonNombre="";
    private String fecha="";
    private String time="";
    private String pacNombre="";
    
    public Turnos() {
        super();
    }
    
    public void verTurnos(){
        int i=0;
        int j=0;
        back.clean();
        for(i=0;i<turno.length;i++){
            System.out.print(i);
            for(j=0;j<turno[i].length;j++){
                switch (j){
                case 0:
                    odonNombre=odon.getNombre(turno[i][j]);
                    break;
                case 1:
                    fecha=day.getFecha(turno[i][j]);
                    break;
                case 2:
                    time=hora.getHora(turno[i][j]);
                    break;
                case 3:
                    pacNombre=paci.getPaciente(turno[i][j]);
                    break;
                }
                
            }
            System.out.print("- Odontologo:"+odonNombre+"|Dia:"+fecha+"|Hora:"+time+"|Paciente:"+pacNombre+"\n");
        }
        back.waiting();
        back.menuTurnos();
    }
    
    public void turnosOdontologos(){
        int select=0;
        int i=0;
        int j=0;
        int aux=0;
        back.clean();
        System.out.println("Listado de Odontologos:");
        for (i=0;i<odon.getLongOd();i++){
            System.out.print(i+"- "+odon.getNombre(i)+"  ");
        }
        System.out.println("Ingrese el Número de Odontologo:");
        select=eT.nextInt();
        for(i=0;i<turno.length;i++){
            aux=i;
            for(j=0;j<turno[i].length;j++){
                switch (j){
                    case 0:
                        odonNombre=odon.getNombre(turno[i][j]);
                        break;
                    case 1:
                        fecha=day.getFecha(turno[i][j]);
                        break;
                    case 2:
                        time=hora.getHora(turno[i][j]);
                        break;
                    case 3:
                        pacNombre=paci.getPaciente(turno[i][j]);
                        break;
                }
            }
            if(odon.getNombre(select)==odonNombre){
                System.out.print(i+"- Odontologo:"+odonNombre+"|Dia:"+fecha+"|Hora:"+time+"|Paciente:"+pacNombre+"\n");
            }
            
        }
        back.waiting();
        back.menuTurnos();
    }
    
    
    public void turnosFecha(){
        int select=0;
        int i=0;
        int j=0;
        int aux=0;
        back.clean();
        
        System.out.println("Listado de Días:");
        for (i=0;i<day.getLongFe();i++){
            System.out.print(i+"- "+day.getFecha(i)+"  ");
        }
        System.out.println("Ingrese el Número de Fecha:");
        select=eT.nextInt();
        for(i=0;i<turno.length;i++){
            for(j=0;j<turno[i].length;j++){
                switch (j){
                    case 0:
                        aux=i;
                        odonNombre=odon.getNombre(turno[i][j]);
                        break;
                    case 1:
                        fecha=day.getFecha(turno[i][j]);
                        break;
                    case 2:
                        time=hora.getHora(turno[i][j]);
                        break;
                    case 3:
                        pacNombre=paci.getPaciente(turno[i][j]);
                        break;
                }
            }
            if(day.getFecha(select)==fecha){
                System.out.print("- Odontologo:"+odonNombre+"|Dia:"+fecha+"|Hora:"+time+"|Paciente:"+pacNombre+"\n");
            }
            
        }
        back.waiting();
        back.menuTurnos();
    }
    
    
    public void turnosLibresFecha(){
        /*int select=0;
        int i=0;
        int j=0;
        int aux=0;        */
        back.clean();
        /*matriz[4][6];*/
        System.out.println("                                  Andres                               ");
        System.out.println("|       |    Lunes 07   |    Lunes 14   |    Lunes 21   |    Lunes 28  |");
        System.out.println("| 09:00 |               |               |               |              |");
        System.out.println("| 09:30 |               |               |               |              |");
        System.out.println("| 10:00 |               |               |               |              |");
        System.out.println("| 10:30 |               |               |               |              |");
        System.out.println("| 11:00 |               |               |               |              |");
        System.out.println("| 11:30 |               |               |               |              |");
       /* for(i=0;i<turno.length;i++){
            for(j=0;j<turno[i].length;j++){
                switch (j){
                    case 1:
                        fecha=day.getFecha(turno[i][j]);
                        break;
                    case 2:
                        time=hora.getHora(turno[i][j]);
                        break;

                }
            }
            if(day.getFecha(select)==fecha){
                System.out.print("- Odontologo:"+odonNombre+"|Dia:"+fecha+"|Hora:"+time+"|Paciente:"+pacNombre+"\n");
            }
            
        }*/
    
        
      
        
        back.waiting();
        back.turnosLibres();
    }
    
    public void turnosLibresHora(){
        back.clean();
        
        
        back.waiting();
        back.turnosLibres();
    }
    
    public void turnosLibresOdo(){
        back.clean();
        
        
        back.waiting();
        back.turnosLibres();
    }
    
    
    
}
