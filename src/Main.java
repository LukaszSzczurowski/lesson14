import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj w programie w którym wyświetlę Ci sume wszystkich podanych przez Ciebie cyfr");

        int x = 0;
        int sum = 0;

        System.out.println("Podaj cyfrę: ");
        Scanner scanner = new Scanner(System.in);
        int number;

        while (Math.pow(number = scanner.nextInt(), 2) < 100) {
            sum += number;
        }

        if (sum % 2 == 0) {
            System.out.println("Suma twoich liczb jest parzysta");
        }
        else {
            System.out.println("Suma twoich liczb jest nieparzysta");
        }

        System.out.println("Suma twoich liczb wymosi: " + sum);
    }
}
