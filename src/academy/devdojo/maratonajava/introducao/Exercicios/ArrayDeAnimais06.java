package academy.devdojo.maratonajava.introducao.Exercicios;

public class ArrayDeAnimais06 {

    public static void main(String[] args) {
        //Cria um array de Strings para armazenar nomes de animais
        String [] animais = new String [5];

         /* Preenche o array com nomes de animais

         animais é uma referência.
      O array new String[5] é o objeto criado na memória.
         animais aponta para esse objeto. */

        animais[0] = "Lobo";
        animais[1] = "Leão";
        animais[2] = "Elefante";
        animais[3] = "Gazela";
        animais[4] = "macaco";

        // Imprime os nomes dos animais
        System.out.println("Animais no array ");
        for (int i = 0; i < animais.length; i++) {
            System.out.println("Animal "  + animais[i]);

        }



    }
}
