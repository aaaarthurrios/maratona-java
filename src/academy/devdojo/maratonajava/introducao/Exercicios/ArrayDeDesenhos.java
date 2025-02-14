package academy.devdojo.maratonajava.introducao.Exercicios;

public class ArrayDeDesenhos {

    public static void main(String[] args) {

        String [] desenhos =  new String[5];

        desenhos [0] = "Apenas um show";
        desenhos [1] = "Hora de aventura";
        desenhos [2] = "As aventuras de jack chan";
        desenhos [3] = "Dragão Ocidental";
        desenhos [4] = "supershock";

        System.out.println("Meus desenhos \n");

        for (int i = 0; i < desenhos.length; i++) {

            System.out.println("Desenhos " + desenhos[i] );
        }
        System.out.println("\n");

        String [] desenho2 = {"X-Men: Evolution", "Rocket Power", "Avatar: A Lenda de Aang",
                "Futurama","Liga da Justiça", "Três Espiãs Demais" , "Homem-Aranha"};

        System.out.println("Meus Desenhos parte 2 \n");

        for (int i = 0; i < desenho2.length ; i++) {

            System.out.println("Desenhos " + desenho2[i]);

        }

        }
    }

