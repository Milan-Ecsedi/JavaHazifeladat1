import java.util.Scanner;

public class feladat10 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int szamsorozat=0;
        int paros=0;
        int paratlan=0;
        int szam;

        while(szamsorozat !=100){

            System.out.printf("Adjon meg egy számot: ");

            szam = sc.nextInt();

            if (szam % 2 == 0){

                paros++;

            }
            else {

                paratlan++;

            }

            szamsorozat += szam;
        }
        System.out.printf(paros+ "páros"+ paratlan +" páratlan volt a sorozatban");


    }


}
