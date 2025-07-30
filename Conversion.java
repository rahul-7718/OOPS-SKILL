package oops;

public class Conversion {


    public static void main(String[] args) {
        String s = "Java";
        char[] chars = s.toCharArray();
        for (char c : chars) System.out.print(c + " ");
        System.out.println();
        byte[] bytes = s.getBytes();
        for (byte b : bytes) System.out.print(b + " ");
    }
}


