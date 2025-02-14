package academy.devdojo.maratonajava.introducao.Exercicios;

public class TimesDaNbaArrayMultidimensional {

    public static void main(String[] args) {
       String [][] nba = {
               {"Lakers", "Celtics", "Miami heat","Brooklyn Nets", "Philadelphia 76ers",
               "Golden State Warriors ", "Milwaukee Bucks", "Oklahoma City Thunder", "San Antonio Spurs",
                "Memphis Grizzlies", "Dallas Mavericks"}


       };
        System.out.println("Times da NBA \n");
        for (int i = 0; i < nba.length; i++) {
            for (int j = 0; j < nba[i].length ; j++) {

                System.out.println("Times NBA "+ (j+1) + ": "  + nba[i][j]);

            }

        }
    }
}
