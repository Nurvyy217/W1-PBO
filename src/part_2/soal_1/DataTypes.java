import java.util.Scanner;

public class DataTypes {
    public static void main (String[] args){

        // Scan int jumlah angka yang akan diiputkan
        Scanner scan = new Scanner(System.in);
        System.out.println("Input: ");
        int n = scan.nextInt();
        scan.nextLine();

        // Scan angka-angka yang diinputkan
        String[] inputs = new String[n];
        for(int i = 0; i < n; i++) {
            inputs[i] = scan.nextLine().trim();
        }

        // Cek dan print tipe data yang dapat menampung angka tsb
        for (String numStr : inputs) {
            try {
                long value = Long.parseLong(numStr);
                System.out.println();
                System.out.println(value + " can be fitted in: ");
                if (value <= Byte.MAX_VALUE && value >= Byte.MIN_VALUE) {
                    System.out.println("* byte");
                }
                if (value <= Short.MAX_VALUE && value >= Short.MIN_VALUE) {
                    System.out.println("* short");
                }
                if (value <= Integer.MAX_VALUE && value >= Integer.MIN_VALUE) {
                    System.out.println("* int");
                }
                System.out.println("* long");
            } catch (NumberFormatException e) {
                System.out.println();
                System.out.println(numStr + " can't be fitted anywhere");
            }
        }
        scan.close();
    }
}

