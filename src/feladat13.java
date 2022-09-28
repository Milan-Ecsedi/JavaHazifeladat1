import java.util.Random;
import java.util.Scanner;

public class feladat13 {


    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        Random rnd= new Random();
        System.out.printf("Gondoltam egy számra tippelj 1-100 között: ");

        int rndGenerator= rnd.nextInt(1,101);
        int tipp= sc.nextInt();
        while (tipp != rndGenerator)
        {

        if (tipp > rndGenerator ){

            System.out.printf("Nem találtad el, a szám amire gondoltam az kissebb...Probáld újra: ");

        }
        else {

            System.out.printf("Nem találtad el, a szám amire gondoltam az nagyobb...Probáld újra: ");
        }
                tipp= sc.nextInt();


        }
        System.out.printf("Eltaláltad! Gratula");





    }


}
