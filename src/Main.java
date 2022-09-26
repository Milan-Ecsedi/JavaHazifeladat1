import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Adja meg a kör alakú medence átmérőkjét[m]: ");
        Scanner scanner= new Scanner(System.in);
        double d= Integer.parseInt(scanner.nextLine());
        scanner.nextLine();
        double r= d/2;
        System.out.print("Adja meg a kör alakú medence mélységét [m]: ");
        double m= Integer.parseInt(scanner.nextLine());

        double V = (Math.PI * Math.pow(r, 2)) * m;


        System.out.printf("%f m3 víz fér bele a medencébe", V);
    }
}