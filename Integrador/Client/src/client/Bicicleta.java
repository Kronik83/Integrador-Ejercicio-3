package client;

import java.util.Scanner;

public class Bicicleta {
    public Bicicleta() {
        super();
    }
    
    private String nroDeSerie;
    private String modelo;
    private Integer a�o;
    private float precio;
    
    public Bicicleta(String nroDeSerie, String modelo, int a�o){
        this.nroDeSerie= nroDeSerie;;
        this.modelo=modelo;
        this.a�o=a�o;
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

    public void setA�o(Integer a�o) {
        this.a�o = a�o;
    }

    public Integer getA�o() {
        return a�o;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    
    public String toString(){
        return "Bicicleta {"+"N� de Serie:"+nroDeSerie+", Modelo:"+modelo+", A�o:"+a�o+"}";
    }
}
