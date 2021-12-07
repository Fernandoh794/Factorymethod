package com.company;

public class FabricaDodgeD  implements FabricadeCarro{
    public Carro criarCarro(){
        return new DodgeD();
    }
}
