package oops;

public class Stringimmutability {



    public static void main(String[] args) {

        String s1 = "data";
        String s2 = s1;            
        s1 = s1.concat("base");  
             System.out.println(s1); 
        String s3="hello";
        s3.concat("world");
             System.out.println("immutability"+" " +s3); 
        

     
    }
}