package com.utn.models;

public class Bateria extends Instrumento {

    private Integer cantidadTambores;
    private Integer cantidadPlatillos;

    public Bateria() {}

    public Bateria(String marca, Integer cantidadTambores, Integer cantidadPlatillos) {
        super(marca);
        this.cantidadTambores = validateTambores(cantidadTambores);
        this.cantidadPlatillos = validatePlatillos(cantidadPlatillos);
        this.setPrecio(this.cantidadPlatillos * 2000 + this.cantidadTambores * 3000);
    }

    private Integer validatePlatillos(Integer cantidadPlatillos) {
        if (cantidadPlatillos > 5 || cantidadPlatillos < 1) {
            System.out.println("Cantidad de platillos no valida");
            cantidadPlatillos = 0;
        }
        return cantidadPlatillos;
    }

    private Integer validateTambores(Integer cantidadTambores) {
        if (cantidadTambores < 3) {
            System.out.println("Cantidad de tambores no valida.");
            cantidadTambores = 3;
        }
        return cantidadTambores;
    }

    @Override
    public double actualizarPrecio() {
        return this.getPrecio() * 1.15;
    }

    @Override
    public String toString() {
        return super.toString() +
                " ,cantidadTambores = " + cantidadTambores +
                ", cantidadPlatillos = " + cantidadPlatillos +
                " }";
    }
}
