package com.utn.models;

public class GuitarraElectrica extends InstrumentoDeCuerda implements IElectrico{

    public GuitarraElectrica(String marca, double precio) {
        super(marca, precio);
        this.setCantidadCuerdas(6);
    }

    @Override
    public double actualizarPrecio() {
        return this.getPrecio() * 1.05;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String sonidoAmplificado() {
        return "Guitarra Electrica: Sonido Amplificado";
    }
}
