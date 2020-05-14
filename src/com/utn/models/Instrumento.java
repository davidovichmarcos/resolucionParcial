package com.utn.models;

public abstract class Instrumento {

    private String marca;
    private double precio;

    public Instrumento() {}

    public Instrumento(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public Instrumento(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract double actualizarPrecio();

    @Override
    public String toString() {
        return "instrumento {" +
                " marca='" + marca + '\'' +
                ", precio=" + precio ;
    }
}
