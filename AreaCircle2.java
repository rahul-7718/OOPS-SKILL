package oops;


class Circle1 {
    void calculateArea(double radius) {
        double area = 3.14159 * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area of the circle: " + area);
    }
}

public class AreaCircle2 {
    public static void main(String[] args) {
        Circle1 c = new Circle1();
        c.calculateArea(2.5);
    }
}
