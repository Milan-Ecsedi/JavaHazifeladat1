import java.util.Scanner;

public class feladat4 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.printf("Adja meg a háromszög befogó(a) oldalát: ");
        a= sc.nextDouble();
        sc.nextLine();
        System.out.printf("Adja meg a háromszög befogó(b) oldalát: ");
        b=sc.nextDouble();
        sc.nextLine();
        System.out.printf("Adja meg a háromszög átfogó(c) oldalát: ");
        c=sc.nextDouble();

        if (a+b > c){

            double K = a+b+c;
            System.out.printf("A háromszög Kerülete:" + K);

        }
        else {


            System.out.printf("Hibás adatok, a háromszög nem szerkezthető");

        }

    }




}
