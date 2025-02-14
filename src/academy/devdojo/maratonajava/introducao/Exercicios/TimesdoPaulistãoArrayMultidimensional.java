package academy.devdojo.maratonajava.introducao.Exercicios;

public class TimesdoPaulistãoArrayMultidimensional {
    public static void main(String[] args) {
        // Matriz 3x3 de strings
        String[][] matriz = {

                {"Palmeiras", "São Paulo", "Corinthians"},
                {"Santos", "Red Bull Bragantino", "Ponte Preta"},
                {"Mirassol", "Ituano", "Guarani"}
        };

        // Exibindo a matriz
        System.out.println("Times do Paulistão: \n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }
    }
}

