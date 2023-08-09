package java_open_elective_assignments;

class Point {
    private double x, y;

    public Point(double a, double b) {
        x = a;
        y = b;
    }

    public double distanceFrom(Point a) {
        return Math.sqrt((x - a.x) * (x - a.x) + (y - a.y) * (y - a.y));
    }
}

class Polygon {
    private Point[] points;

    public Polygon(Point[] a) {
        points = new Point[a.length];
        for (int i = 0; i < a.length; i++) {
            points[i] = a[i];
        }
    }

    public double getPerimeter() {
        double d = 0;
        int i;
        for (i = 0; i < points.length - 1; i++) {
            d += points[i].distanceFrom(points[i + 1]);
        }
        d += points[i].distanceFrom(points[0]); // close the polygon
        return d;
    }
}

class Triangle extends Polygon {
    public Triangle(Point[] a) {
        super(a);
    }

    boolean isEquilateral() {
        Point[] pts = getPoints();
        double d1 = pts[0].distanceFrom(pts[1]);
        double d2 = pts[1].distanceFrom(pts[2]);
        double d3 = pts[2].distanceFrom(pts[0]);

        return Math.abs(d1 - d2) < 1e-6 && Math.abs(d2 - d3) < 1e-6;
    }

    // Utility method to access protected points in subclass
    private Point[] getPoints() {
        try {
            java.lang.reflect.Field f = Polygon.class.getDeclaredField("points");
            f.setAccessible(true);
            return (Point[]) f.get(this);
        } catch (Exception e) {
            return null;
        }
    }
}

public class MainPoint {
    public static void main(String[] args) {
        Point[] pts = {
                new Point(0, 0),
                new Point(1, Math.sqrt(3)),
                new Point(2, 0)
        };

        Triangle t = new Triangle(pts);
        System.out.println("Perimeter: " + t.getPerimeter());
        System.out.println("Is Equilateral: " + t.isEquilateral());
    }
}
