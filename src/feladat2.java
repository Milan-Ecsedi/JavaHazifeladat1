import java.util.Scanner;

public class feladat2 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.printf("Adja meg a fal magasságát [m]: ");
        int M= sc.nextInt();

        System.out.printf("Adja meg a fal szélességét [m]:");
        sc.nextLine();
        int Sz= sc.nextInt();

        double T= ((M*100) / 22)*((Sz*100)/22);

        System.out.printf("A falra " +T+ " db 20x20 cm nagyságú csempe fér ");



    }



}
