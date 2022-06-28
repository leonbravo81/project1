package com.company.interfaces;

import com.company.Coche;

public interface interfacesMain {

    public static void main(String[] args) {

        CocheService service1 = new CocheServiceClassicImpl();
        CocheService service2 = new CocheServiceSportImpl();
//        Coche coche2 = service1.crearCocheDemo();
//        Coche coche1 = service1.crearCocheDemo(coche2);



    }
}
