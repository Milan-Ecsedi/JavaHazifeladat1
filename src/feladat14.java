import java.util.Scanner;

public class feladat14 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Adjon meg egy Szöveget: ");
        String szoveg= sc.nextLine();
        String ActionManager;
        sc.nextLine();
        System.out.print("Adja meg a feladatot a programnak[a-nagybetüssé alakítani ; b-kisbetüssé alakítani ; c-lekérni a szöveg hosszát ; f-kilépés]: ");
        ActionManager=sc.nextLine();
        while (ActionManager.equals("f")) {


            System.out.print("Adja meg a feladatot a programnak[a-nagybetüssé alakítani ; b-kisbetüssé alakítani ; c-lekérni a szöveg hosszát ; f-kilépés]: ");
            ActionManager = sc.nextLine();

            if (ActionManager.equals("a")) {

                System.out.printf(szoveg.toUpperCase());


            } else if (ActionManager.equals("b")) {

                System.out.printf(szoveg.toLowerCase());


            } else if (ActionManager.equals("c")) {

                System.out.printf(String.valueOf(szoveg.length()));


            } else {

                System.out.printf("Viszontlátásra");


            }
        }
    }


}
