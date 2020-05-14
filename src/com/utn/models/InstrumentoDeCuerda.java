package com.utn.models;

public abstract class InstrumentoDeCuerda extends Instrumento{

    private Integer cantidadCuerdas;

    public InstrumentoDeCuerda(String marca, double precio) {
        this.setMarca(marca);
        this.setPrecio(precio);
    }

    public Integer getCantidadCuerdas() {
        return cantidadCuerdas;
    }

    public void setCantidadCuerdas(Integer cantidadCuerdas) {
        this.cantidadCuerdas = cantidadCuerdas;
    }

    @Override
    public String toString() {
        return super.toString() +
                " ,cantidadCuerdas= " + cantidadCuerdas +
                " }";
    }
}
