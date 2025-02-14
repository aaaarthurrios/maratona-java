package academy.devdojo.maratonajava.introducao.Exercicios;

public class Ex004ArrayMultidimensionais {
    public static void main(String[] args) {

        //Crie uma matriz 3x3 e preencha-a com números inteiros de 1 a 9.
        // Em seguida, imprima a soma de todos os elementos da matriz.

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }

        System.out.println("Soma de todos os elementos: " + soma);
    }

    }

