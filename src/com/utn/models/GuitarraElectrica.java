package com.utn.models;

public class GuitarraElectrica extends InstrumentoDeCuerda implements IElectrico{

    private String modelo;

    public GuitarraElectrica() {}

    public GuitarraElectrica(String marca, double precio, String modelo) {
        super(marca, precio);
        this.modelo = modelo;
        this.setCantidadCuerdas(6);
    }

    @Override
    public double actualizarPrecio() {
        return this.getPrecio() * 1.05;
    }

    @Override
    public String toString() {
        return super.toString() +
                " modelo="+ this.modelo + " }";
    }

    @Override
    public String sonidoAmplificado() {
        return "Guitarra Electrica: Sonido Amplificado";
    }
}
