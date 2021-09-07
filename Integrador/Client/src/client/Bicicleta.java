package client;

import java.util.Scanner;

public class Bicicleta {
    public Bicicleta() {
        super();
    }
    
    private String nroDeSerie;
    private String modelo;
    private Integer año;
    private float precio;
    
    public Bicicleta(String nroDeSerie, String modelo, int año){
        this.nroDeSerie= nroDeSerie;;
        this.modelo=modelo;
        this.año=año;
    }

    public void setNroDeSerie(String nroDeSerie) {
        this.nroDeSerie = nroDeSerie;
    }

    public String getNroDeSerie() {
        return nroDeSerie;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public Integer getAño() {
        return año;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    
    public String toString(){
        return "Bicicleta {"+"Nº de Serie:"+nroDeSerie+", Modelo:"+modelo+", Año:"+año+"}";
    }
}
