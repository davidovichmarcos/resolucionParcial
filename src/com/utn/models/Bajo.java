package com.utn.models;

public class Bajo extends InstrumentoDeCuerda implements IElectrico {

    public Bajo(String marca, double precio) {
        super(marca, precio);
        this.setCantidadCuerdas(4);
    }

    @Override
    public double actualizarPrecio() {
        return this.getPrecio() * 1.2;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String sonidoAmplificado() {
        return "Bajo: Sonido Amplificado";
    }
}
