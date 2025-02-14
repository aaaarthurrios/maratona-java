package Guanabarajava;

public class Vetores02 {
    public static void main(String[] args) {
        String mes[] = {"JAN", "FEV", "MAR", "ABR", "MAI", "JUN", "JUL", "AGO", "SET", "OUT", "NOV", "DEZ"};

        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Opcionalmente, você pode imprimir os arrays para verificar os valores
        for(int i = 0; i < mes.length; i++) {
            System.out.println(mes[i] + ": " + tot[i] + " dias");
        }
        for(String m: mes){
            System.out.println(m + " ");

        }
    }
}


