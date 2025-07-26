package oops;

import java.util.ArrayList;

class Unboxing {
    public static void main(String[] args) {
        Integer obj = Integer.valueOf(10);
        int x = obj;

        System.out.println("objectcreation/cached object " + obj);
        System.out.println("unboxing " + x);
    }
}

