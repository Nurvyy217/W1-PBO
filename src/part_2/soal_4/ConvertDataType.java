class ConvertDataType
{
    static short methodOne(long l) // Method untuk mengubah long menjadi short
    {
        int i = (int) l;
        return (short)i;
    }
    public static void main(String[] args)
    {
        double d = 10.25;
        float f = (float) d; // konversi double ke float
        byte b = (byte) methodOne((long) f); // konversi float ke long dan kemudian ke short melalui methodOne lalu konversi ke byte
        System.out.println(b);
    }
}