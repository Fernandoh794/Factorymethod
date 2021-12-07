package com.company;

public class FabricaTeslaX implements FabricadeCarro{

    public Carro criarCarro() {
        return new TeslaX();
    }
}
