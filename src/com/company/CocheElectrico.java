package com.company;

public class CocheElectrico extends Coche{
    String motorElectrico;

    public CocheElectrico(){}

    public CocheElectrico(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }

    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo){
        super(color, fabricante, modelo, peso, largo);//Con esto estamos invocando el construtor de la clase madre
        //this.motorElectrico = motorElectrico;
    }

    @Override
    public void acelerar(Integer cantidad) {
        Integer nuevoValor=cantidad*2;
        super.acelerar(nuevoValor);
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
