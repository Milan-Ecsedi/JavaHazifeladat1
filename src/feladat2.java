import java.util.Scanner;

public class feladat2 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.printf("Adja meg a fal magasságát [m]: ");
        int M= sc.nextInt();

        System.out.printf("Adja meg a fal szélességét [m]:");
        sc.nextLine();
        int Sz= sc.nextInt();

        int T= ((M*100) / 20)*((Sz*100)/20);

        System.out.printf("A falra " +T+ " db 20x20 cm nagyságú csempe fér ");



    }



}
