package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        //carro = carro2;

        carro.nome =   "Skyline";
        carro.modelo = "gtr r34";
        carro.ano = 2001;
        carro.cor = "Roxo";

        carro2.nome =   "Ferrari";
        carro2.modelo = "458 Italia ";
        carro2.ano = 2009;
        carro2.cor = "Azul";

// Serve para pular linha "\n"


        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);
        System.out.println(carro.cor);

        System.out.println("------------------");

        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
        System.out.println(carro2.cor);
    }
}
