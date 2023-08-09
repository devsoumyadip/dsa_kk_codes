package java_open_elective_assignments;
interface Shape {
    double area();       // abstract method
    double perimeter();  // abstract method
}
class Circle implements Shape {
    double radius;

    public Circle(double r) {
        radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
class Rectangle implements Shape {
    double length, width;

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}


public class InterfaceExample {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);

        System.out.println("Circle Area: " + c.area());
        System.out.println("Circle Perimeter: " + c.perimeter());

        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Rectangle Perimeter: " + r.perimeter());
    }
}
