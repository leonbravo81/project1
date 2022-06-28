package com.company;

public class PolimorfismoMain {

    public static void main(String[] args) {
        Coche che1 = new CocheElectrico();

        CocheElectrico coche2 = new CocheElectrico();

        CocheHibrido coche3 = new CocheHibrido();

        //Polimosrfismo

        Coche coche4 = new CocheElectrico();
        Coche coche5 = new CocheHibrido();

        if(coche4 instanceof CocheHibrido){
            System.out.println("Coche");
        }
        if(coche4 instanceof CocheElectrico){
            System.out.println("Coche electrico");
        }

        if(coche4 instanceof CocheHibrido){
            System.out.println("Coche hibrido");
        }
    }



}
