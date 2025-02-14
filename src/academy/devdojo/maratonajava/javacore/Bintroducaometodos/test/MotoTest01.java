package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Moto;

public class MotoTest01 {

    public static void main(String[] args) {

        Moto moto = new Moto();

        moto.nome = "Honda";
        moto.cor = "Preta";
        moto.ano = 2024;
        moto.motor = "V3";
        moto.modelo = "Twister";

        System.out.println("Nome da moto " + moto.nome);
        System.out.println("Nome da mot or " + moto.motor);
        System.out.println("Nome da ano " + moto.ano);
        System.out.println("Nome da cor " + moto.cor);
        System.out.println("Nome da modelo " + moto.modelo);



    }
}
