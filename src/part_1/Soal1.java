public class Soal1 {
    public static void main(String[] args) {
        byte angka1 = 125;
        byte angka2 = 6;
        byte hasil = (byte) (angka1+angka2); //hasil dari angka1+angka2 adalah int sehingga di cast ke byte dan terjadi overflow
        System.out.println("Hasil 1 " +hasil); // Hasil 1 -125 karena overflow byte
    }
}
