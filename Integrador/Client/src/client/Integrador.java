package client;

import java.util.Scanner;

public class Integrador {
    public Integrador() {
        super();
    }

    public static void main(String[] args) {

        Bicicleteria lista = new Bicicleteria();
        Scanner sc;
        String nroDeSerie;
        String modelo;
        String buscar;
        String opcion;
        boolean seguir=true;
        int año;
        
        sc = new Scanner(System.in).useDelimiter("\n");
        do{
            System.out.print("Ingrese el Numero de Serie:->");
            nroDeSerie = sc.next();
            System.out.print("Ingrese el Modelo:->");
            modelo = sc.next();
            System.out.print("Ingrese el Año:->");
            año = sc.nextInt();
            lista.addBicicleta(new Bicicleta(nroDeSerie, modelo, año));
            System.out.print("Desea seguir ingresando bisicletas. (Si/No):->");
            opcion = sc.next();
            if(opcion.equalsIgnoreCase("s") || opcion.equalsIgnoreCase("si")){
                seguir=true;
            }else{
                lista.showBicicletas();
                buscar = sc.next();
                System.out.println(lista.buscarBicicleta(buscar));
                seguir = false;
            }
        }while(seguir);

    }
}
