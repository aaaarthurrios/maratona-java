package academy.devdojo.maratonajava.introducao;

/*Texto do exercício:

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o
 salário de <salario>, na data <data>. */



public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {

        String  nome = "Arthur";
        String  endereco = "São paulo";
         float salario = 2300.f;
         String dataRecebimentoSalario = "20/12/2021";


        System.out.println("Eu " + nome + " morando no endereco " + endereco + " Confirmo que recebi o salário de " + salario + " na data " + dataRecebimentoSalario);

    }
}
