package constructors;
class Cylinder{
    private int height;
    private int radius;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
class Rectangle{
    private int len;
    private int brdth;

    public Rectangle() {
        this.len = 4;
        this.brdth = 5;
    }

    public Rectangle(int len, int brdth) {  //overloaded constructor
        this.len = len;
        this.brdth = brdth;
    }

    public int getLen() {
        return len;
    }

    public int getBrdth() {
        return brdth;
    }
    public double areaRec(){
        return len*brdth;
    }
}

public class Constructor_practice {


    public static void main(String[] args) {
        Cylinder c=new Cylinder();
        c.setHeight(15);
        c.setRadius(5);
        System.out.println(c.getRadius());
        System.out.println(c.getHeight());

        Rectangle r=new Rectangle();
        System.out.println(r.getLen());
        System.out.println(r.getBrdth());
        System.out.println(r.areaRec());
    }
}
