package com.company;

public class FabricaTeslaS implements FabricadeCarro {
    public Carro criarCarro() {
        return new TeslaS();
    }
}
