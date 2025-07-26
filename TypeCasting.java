package oops;

public class TypeCasting {


    public static void main(String[] args) {
        double d = 123.456;
        float f = (float) d;
        long l = (long) f;
        int i = (int) l;
        short s = (short) i;
        byte b = (byte) s;
        int num = 65;
        char ch = (char) num;

        System.out.println("byte: " + b);
        System.out.println("int to char: " + ch);
    }
}
