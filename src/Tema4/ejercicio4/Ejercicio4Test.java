package Tema4.ejercicio4;

import java.util.ArrayList;

public class Ejercicio4Test {
    public static void main(String[] args) {
        ArrayList<String> listaActores= new ArrayList<>();
        listaActores.add("Alex");
        listaActores.add("Bob");
        listaActores.add("Jose");
        listaActores.add("Mery");
        listaActores.add("Jack");
        listaActores.add("Jane");
        DvdCine cine1= new DvdCine("Hola","Mario","ies",listaActores,
                Generos.ACCION,120);
        DvdCine cine2= new DvdCine("Adios","Angel","ies",listaActores,
                Generos.ACCION,110);
        System.out.println(cine1);
        if (cine1.esThriller()){
            System.out.println("Es thriller");
        }else {
            System.out.println("No es thriller");
        }

        if (cine1.mismaProductora(cine2)){
            System.out.println("Cine 1 es misma productora");

        }else {
            System.out.println("Cine 1 no es la misma productora");
        }
    }

}
