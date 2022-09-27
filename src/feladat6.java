import java.util.Scanner;

public class feladat6 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.printf("Adja meg a dolgozat pontszámát: ");
        int pontszam= sc.nextInt();

        if (pontszam <=42){

            System.out.printf("Elégtelen");
        }
        else if (pontszam >= 43 && pontszam <= 57){

            System.out.printf("Elégséges");

        }
        else if (pontszam >= 58 && pontszam <= 72){

            System.out.printf("Közepes");

        }
        else if (pontszam >= 73 && pontszam <= 87){

            System.out.printf("Jó");

        }
        else if (pontszam >= 88 && pontszam <= 100){

            System.out.printf("Jeles");

        }




    }

}
