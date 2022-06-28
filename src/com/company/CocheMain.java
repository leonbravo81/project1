package com.company;

public class CocheMain {
    public static void main(String[] args) {
        String coche = "Alfa Romeo";
        Coche cocheobj = new CocheHibrido();
        Coche cocheobj2 = new CocheElectrico("Rojo","Honda","Civic",14.30,25.0);
        //cocheobj2.acelerar(50);
        System.out.println(cocheobj2.color+cocheobj2.fabricante+cocheobj2.modelo+cocheobj2.peso);
        System.out.println(cocheobj2);
        cocheobj2.peso=4444.5;
        System.out.println(cocheobj2.color+cocheobj2.fabricante+cocheobj2.modelo+cocheobj2.peso);
        System.out.print(cocheobj2+" Este es el segundo");

        CocheElectrico cocheElectrico=new CocheElectrico();

        cocheElectrico.motorElectrico="Ejemplo Motor";
        cocheElectrico.color="verde";
        cocheElectrico.fabricante="Honda";
        cocheElectrico.modelo="Civic";

        System.out.println("cocheElectrico = " + cocheElectrico);


        CocheElectrico cocheElectrico2=new CocheElectrico("azul","Alfa","Romeo",1435.6,45.6);

        System.out.println(cocheElectrico2);

        cocheElectrico2.acelerar(40);

        System.out.println(cocheElectrico2);


    }
}
