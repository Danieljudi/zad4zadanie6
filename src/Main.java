import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Podaj jakikolwiek tekst:");
        Scanner scanner = new Scanner(System.in);
        String tekst = scanner.nextLine();

        System.out.println("Podaj dowolna liczbe:");
        int liczba = scanner.nextInt();

        System.out.println("Czy wydrukowac podany tekst? Wprowadz 1-tak, 2-nie.");
        int taknie = scanner.nextInt();

            if (taknie == 1) {

                for (int i = liczba; i > 0; i--) {
                    System.out.println(tekst);
                }
                System.out.println();
                System.out.println("Koniec");
            }
            else{
                    System.out.println("Koniec");
                }



    }
}
