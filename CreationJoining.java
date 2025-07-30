package oops;

public class CreationJoining {


    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        System.out.println(a.concat(" ").concat(b));  // Hello World
        String joined = String.join("-", "A", "B", "C");
        System.out.println(joined);  // A-B-C
    }
}

