package com.company;

public class VendaCliente {
    public static void main(String[] args) {
        FabricadeCarro fabrica = new FabricaTeslaS();  //* TESLA S
        Carro carro = fabrica.criarCarro();
        carro.venderveiculo();
        carro.acelerar();
        carro.trocarMarcha();
        carro.frear();
        System.out.println("\n");


        fabrica = new FabricaTeslaX();    // TESLA X
        carro = fabrica.criarCarro();
        carro.venderveiculo();
        carro.acelerar();
        carro.trocarMarcha();
        carro.frear();
        System.out.println("\n");

        fabrica = new FabricaDodgeC();   // DODGE C
        carro = fabrica.criarCarro();
        carro.venderveiculo();
        carro.acelerar();
        carro.trocarMarcha();
        carro.frear();
        System.out.println("\n");

        fabrica = new FabricaDodgeD();  // DODGE D
        carro = fabrica.criarCarro();
        carro.venderveiculo();
        carro.acelerar();
        carro.trocarMarcha();
        carro.frear();
        System.out.println("\n");




    }



}
