package academy.devdojo.maratonajava.introducao.Exercicios;

public class ex005Array {
    public static void main(String[] args) {

        //Crie um programa em Java que armazene 5 números em um array e encontre o maior e o menor número.

        int[] n = {20, 32, 41, 47, 56};

        int maior = n[0];
        int menor = n[0];

        for (int i = 1; i < n.length; i++) {
            if (n[i] > maior) {
                maior = n[i];
            }
            if (n[i] < menor) {
                menor = n[i];
            }
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}
