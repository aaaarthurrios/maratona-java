package academy.devdojo.maratonajava.introducao.Exercicios;

public class ArrayDeJogos07 {
    public static void main(String[] args) {

        String[] jogos = new String[5];

        jogos[0] = "The last of us";
        jogos[1] = "God of war";
        jogos[2] = "Bioshock Infinite";
        jogos[3] = "Gta V";
        jogos[4] = "Fifa";

        System.out.println("Meus jogos \n");
        for (int i = 0; i < jogos.length; i++) {

            System.out.println("Jogo " + jogos[i]);

        }
    }
    }
