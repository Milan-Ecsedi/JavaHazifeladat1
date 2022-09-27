import java.util.Scanner;

public class feladat5 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        double a , b;
        String action;
        System.out.printf("Adja meg a téglalap (a) oldalát:");
        a= sc.nextDouble();
        sc.nextLine();
        System.out.printf("Adja meg a téglalap (b) oldalát:");

        b = sc.nextDouble();
sc.nextLine();
        System.out.printf("Adjon meg egy utasítást [K , T]: ");
        action= sc.nextLine();

        if (action.equals("K")){


            double K= (2*a) + (2*b);
            System.out.printf(String.valueOf(K));

        }
        else if (action.equals("T")){


            double T = a*b ;
            System.out.printf(String.valueOf(T));

        }
        else{

            System.err.printf("Hibás utasítás");

        }




    }


}
