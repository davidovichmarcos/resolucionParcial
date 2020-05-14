package com.utn.models;

public class GuitarraAcustica extends InstrumentoDeCuerda {

    public GuitarraAcustica(String marca, double precio) {
        super(marca, precio);
        this.setCantidadCuerdas(6);
    }

    @Override
    public double actualizarPrecio() {
        return this.getPrecio() * 1.10;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
