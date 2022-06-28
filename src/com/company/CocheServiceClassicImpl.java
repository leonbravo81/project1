package com.company;

public class CocheServiceClassicImpl implements CocheService{

    @Override
    public Coche crearCocheDemo() {
        return new CocheElectrico();
    }
}
