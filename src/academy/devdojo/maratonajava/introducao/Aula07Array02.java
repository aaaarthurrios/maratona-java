package academy.devdojo.maratonajava.introducao;

public class Aula07Array02 {
    public static void main(String[] args) {
// byte,short, int,long, float e double 0
        // char ' \ u0000' ' '
        // boolean  false
        // String null

        String[] nomes = new String[4];

        nomes[0] = "Sanji";
        nomes[1] = "Zoro";
        nomes[2] = "Luffy";
        nomes[3]=   "nami";


        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes [i]);

        }
    }
}
