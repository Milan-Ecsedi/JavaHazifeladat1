import java.util.Scanner;

public class feladat7 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.printf("Írja be hogy hanyadik hónapban járunk:");
        int honap= sc.nextInt();
        if ((honap >= 1 && honap <=2) ||  honap==12 ){

            System.out.printf("Évszak: Tél");


        }
        else if (honap>=3 && honap <= 5){

            System.out.printf("Évszak: Tavasz");

        }
        else if (honap>=6 && honap <= 8){

            System.out.printf("Évszak: Nyár");

        }
        else if (honap>=9 && honap <= 11){

            System.out.printf("Évszak: Ősz");

        }


    }
}
