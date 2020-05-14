package com.utn.models;

public class Bajo extends InstrumentoDeCuerda implements IElectrico {

    private String modelo;

    public Bajo() {}

    public Bajo(String marca, double precio, String modelo) {
        super(marca, precio);
        this.modelo = modelo;
        this.setCantidadCuerdas(4);
    }

    @Override
    public double actualizarPrecio() {
        return this.getPrecio() * 1.2;
    }

    @Override
    public String toString() {
        return super.toString() +
                " modelo="+ this.modelo + " }";
    }

    @Override
    public String sonidoAmplificado() {
        return "Bajo: Sonido Amplificado";
    }
}
