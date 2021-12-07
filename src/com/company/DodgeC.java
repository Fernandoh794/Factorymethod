package com.company;

public class DodgeC implements Carro{
    @Override
    public void venderveiculo() {
        System.out.println("Modelo: Dodge Charger\n Montadora: Dodge  Preço: 799.000R$" );
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
