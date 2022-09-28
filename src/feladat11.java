import java.util.Scanner;

public class feladat11 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.printf("Adjon meg egy számot: ");
        int szam= sc.nextInt();

        for (int i = 0; i <= szam; i++) {

            if (i%2 ==1){

                System.out.printf(i+ "; ");

            }


        }

    }

}
