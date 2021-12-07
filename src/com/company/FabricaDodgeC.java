package com.company;

public class FabricaDodgeC implements FabricadeCarro{

    public Carro criarCarro() {
        return new DodgeC();
    }
}
