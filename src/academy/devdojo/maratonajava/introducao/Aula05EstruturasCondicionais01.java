package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {

    public static void main(String[] args) {

int idade = 15;
boolean isAutorizadoComprarBebida = idade >= 18;

// !
        if (isAutorizadoComprarBebida != false) {

            System.out.println("Autorizado a comprar bebida alcólica ");
        }else{

            System.out.println("Não Autorizado a comprar bebida alcólica ");
        }

      if (isAutorizadoComprarBebida){
          System.out.println("Não Autorizado a comprar bebida alcólica ");
      }


        System.out.println("fora do if ");

      boolean c = false;
      if( c = true){
          System.out.println("Dentro de algo que nunca deve ser feito ");

      }


    }
}
