class FloatingPoint{
public static void main(String[] args) {
    double x = 92.98;
    int nx = (int) Math.round(x); // hasil Math.round dari parameter double adalah long sehingga di cast ke int
    System.out.println("Nilai nx: " + nx);
}
}
