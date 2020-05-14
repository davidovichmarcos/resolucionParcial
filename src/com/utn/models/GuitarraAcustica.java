package com.utn.models;

public class GuitarraAcustica extends InstrumentoDeCuerda {

    private TipoMadera tipoMadera;

    public GuitarraAcustica() {}

    public GuitarraAcustica(String marca, double precio, TipoMadera tipoMadera) {
        super(marca, precio);
        this.tipoMadera = tipoMadera;
        this.setCantidadCuerdas(6);
    }

    @Override
    public double actualizarPrecio() {
        return this.getPrecio() * 1.10;
    }

    @Override
    public String toString() {

        return super.toString() +
                " tipoMadera="+ this.tipoMadera + " }";
    }

}
