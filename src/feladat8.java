import java.util.Random;
import java.util.Scanner;

public class feladat8 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rnd= new Random();

        System.out.printf("Fej vagy írás játék, adja meg a tippjét[0-fej ; 1-írás]: ");
        int tipp= sc.nextInt();

        int randomizer= rnd.nextInt(0,2);

        if (tipp==randomizer){

            System.out.printf("Sikerült eltalálnia!!");

        }
        else {


            System.out.printf("Sajnálom de nem sikerült eltalálnia, próbálja meg újra. Következőre biztosan fog sikerülni");

        }


    }


}
