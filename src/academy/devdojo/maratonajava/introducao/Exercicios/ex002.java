package academy.devdojo.maratonajava.introducao.Exercicios;

public class ex002 {

    public static void main(String[] args) {

        //Tabuada de um Número: Crie um programa que receba um número inteiro e utilize um laço de
        // repetição para imprimir a tabuada desse número (de 1 a 10).

        {
            int numero = 5; // Você pode alterar este valor para o número desejado

            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }
}
