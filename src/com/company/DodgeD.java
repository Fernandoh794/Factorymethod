package com.company;

public class DodgeD implements Carro {
    @Override
    public void venderveiculo() {
        System.out.println("Modelo: Dodge Dart\n Montadora: Dodge \n Preço: 200.000R$ ");
    }

    public void acelerar(){
        System.out.println("Acelerando!!!");
    }

    public void frear(){
        System.out.println("Freando!!!");
    }

    public void trocarMarcha() {
        System.out.println("Trocando a marcha!!");
    }


}
