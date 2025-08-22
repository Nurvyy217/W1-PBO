import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input string A dan B
        System.out.println("Input:");
        String A = scan.nextLine();
        String B = scan.nextLine();

        // 1. Jumlah panjang A + B
        int sumLength = A.length() + B.length();
        System.out.println();
        System.out.println("Output:");
        System.out.println(sumLength);

        // 2. Apakah A lebih besar secara leksikografis dari B?
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. Kapital huruf pertama A dan B
        String capA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capB = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(capA + " " + capB);
        scan.close();
    }
}
