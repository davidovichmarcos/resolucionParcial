package com.utn;

import com.utn.models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List instrumentsList = Arrays.asList(new Bateria("Pearl",2,2)
                , new Bateria("Yamaha",4,4)
                , new Bateria("Mapex",5, 7)
                , new Bajo("MusicMan", 22000)
                , new Bajo( "Fender", 15000)
                , new GuitarraAcustica("Squier", 10000)
                , new GuitarraAcustica("Gracia", 5000)
                , new GuitarraElectrica("Denver", 8000)
                , new GuitarraElectrica("Ibanez", 22000)
                );

        for(Object i : instrumentsList) {

            System.out.println(i.toString());
        }

        for (Object i : instrumentsList){
            Instrumento instrumento = (Instrumento) i;
            System.out.println("Precio sin aumento:"+ instrumento.getPrecio());
            instrumento.setPrecio(instrumento.actualizarPrecio());
            System.out.println("Precio con aumento:"+ instrumento.getPrecio());
        }
    }

}
