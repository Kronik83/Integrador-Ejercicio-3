package client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bicicleteria {

    /**
     */
    List<Bicicleta> bicicletas;
    float ganancias;
    Integer cantidadDeVentas;
    
    public Bicicleteria() {
        bicicletas = new ArrayList<Bicicleta>();
        cantidadDeVentas=0;
        ganancias=0;
    }

    public void venderBicicleta(Bicicleta bicicleta) {
        bicicletas.remove(bicicleta);
        cantidadDeVentas++;
        ganancias+=bicicleta.getPrecio();
    }
    
    public void addBicicleta(Bicicleta bicicleta){  
        bicicletas.add(bicicleta);        
    }
    
    public Bicicleta buscarBicicleta(String nroDeSerie){

        for(int i=0; i < bicicletas.size(); i++){
            if(nroDeSerie.equalsIgnoreCase(bicicletas.get(i).getNroDeSerie())){
                return bicicletas.get(i);   
            }
        }
        return null;
    }
    
    public void showBicicletas(){
        for(int i=0; i<bicicletas.size();i++){
            System.out.println(bicicletas.get(i).toString());
        }
    }
}
