package academy.devdojo.maratonajava.introducao.Exercicios;

public class ArrayDeFilmes {

    public static void main(String[] args) {
        String [] filmes = {"O Poderoso Chefão (1972) ", "Cidadão Kane (1941) ", " Casablanca (1942) ", "Clube da Luta (1999)  ","As Branquelas (2004) "};

        System.out.println("Meus Filmes \n");

        for (int i = 0; i < filmes.length ; i++) {

            System.out.println("Filme " + filmes[i]);

        }

    }
}
