package com.company;

public class TeslaS implements Carro{
    @Override
    public void venderveiculo() {
        System.out.println("Modelo: Tesla Modelo S \n Montadora: Tesla \n Preço: 700.000R$ ");
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
