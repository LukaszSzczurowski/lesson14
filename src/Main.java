import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tab1 = {1, 2, 3, 4, 5};
        int[] tab2 = {1, 2, 3, 4, 5, 4, 3, 2, 1};

        System.out.println("Tablica: " + Arrays.toString(tab1) + " ,jest palindromem: " + checkPalindrom(tab1));
        System.out.println("Tablica: " + Arrays.toString(tab2) + " ,jest palindromem: " + checkPalindrom(tab2));
    }

    private static boolean checkPalindrom(int[] table) {
        for (int i = 0; i < (table.length / 2); i++) {
            if (table[i] == table[table.length - 1 - i])
                return true;
        }
        return false;
    }
}
