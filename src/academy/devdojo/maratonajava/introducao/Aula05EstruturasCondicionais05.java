package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula05EstruturasCondicionais05 {

    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo


          Byte dia = 5;

        // char, int,byte, short,enum,String

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;

            default:
                System.out.println("Opcão inválida");
        }

        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;

            case 'W':
                System.out.println("Mulher");
                break;

            default:
                System.out.println("Inválido");
        }
    }
}
