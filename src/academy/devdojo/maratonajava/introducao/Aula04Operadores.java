package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {

    public static void main(String[] args) {

        int numero01 = 10;
        int numero02 = 20;

double resultado = numero01 / (double) numero02;

        System.out.println("Valor "+  resultado);
        System.out.println("Valor "+ (numero02+numero01));

        //% resto

        int resto = 21 % 7;
        System.out.println(resto);

        // < > <=  >=  ==  != ===

        boolean isDezMaiorqueVinte = 10 > 20;
        boolean isDezMenorqueVinte = 10 < 20;
        boolean  isDezIgualVinte = 10 == 20;
        boolean  isDezDiferneteVinte = 10 != 20;
        System.out.println("isDezMaiorqueVinte " + isDezMaiorqueVinte);
        System.out.println("isDezMenorqueVinte " + isDezMenorqueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezDiferneteVinte " + isDezDiferneteVinte);

        // && (AND) || (OR) !
         int idade = 29;
         float salario = 3500;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta= idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

            double ValorTotalContaCorrente = 200;
            double ValorTotalContaPoupanca  = 10000;
            float  ValorPlaystation = 5000f;
            boolean isPlaystationCincoCompravel = ValorTotalContaCorrente > ValorPlaystation || ValorTotalContaPoupanca > ValorPlaystation;

        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

    double bonus = 1800; //1800
    bonus += 1000;  //2800
        bonus -= 1000; //1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);


        //
        int contador  = 0;
         contador += 1;  // contador = contador + 1;
        contador++;
        contador--;
        ++contador;
        --contador;

        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador);
    }
}

