package academy.devdojo.maratonajava.introducao.Exercicios;

public class ArrayDeRappers {
    public static void main(String[] args) {
        String [] rappers = {"Kendrick Lamar", "A$AP ROCKEY", "Nas ", "Sza ", "Denzel curry ", "Tyler the creator "};

        System.out.println("Rappers que escuto \n");

        for (int i = 0; i < rappers.length; i++) {

            System.out.println("Rappers " +  (i+1) + ": " + rappers[i]);



        }
    }
}
