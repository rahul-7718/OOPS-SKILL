package oops;

public class TrimExample {


    public static void main(String[] args) {
        String raw = "   Welcome to Java!   ";
        System.out.println("Before Trim: [" + raw + "]");
        System.out.println("After Trim: [" + raw.trim() + "]");
    }
}
