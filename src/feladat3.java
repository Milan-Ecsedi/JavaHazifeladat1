import java.util.Scanner;

public class feladat3 {

    public static void main(String[] args) {

        System.out.printf("Adjon meg egy valós számot [használj vesszőt a valós számban]:");

        Scanner sc= new Scanner(System.in);
        double number= sc.nextDouble();





        System.out.printf("A megadott szám a "+Math.floor(number) +" és a "+Math.ceil(number) +" egész számok között van, és ezek közül a "+ Math.round(number) + " számhoz van közelebb.");


    }


}
