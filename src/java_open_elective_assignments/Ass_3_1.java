package java_open_elective_assignments;



//Writea generic base class called Vehicle that stores number of wheels and speed. Create two
//        derived classes, Car and Truck. The Car class inherits Vehicle and also stores number of
//        passengers. The Truck class also inherits Vehicle and stores the load limit. Write a main()
//function to create objects of these classes and display all the information about Car and
//Truck. Als0, compare the speed of the two vehicles, Car and Truck and display "faster" or
//"slower" if Car is faster or slower than Truck.
class Vehicle{
    int wheels,speed;
    public Vehicle(int wheels,int speed){
        this.wheels=wheels;
        this.speed=speed;
    }
}
class Car extends Vehicle{
    int passengers;

    public Car(int wheels, int speed,int passengers) {
        super(wheels, speed);
        this.passengers=passengers;
    }
}
class Truck extends Vehicle{
    int loadLimit;

    public Truck(int wheels, int speed,int loadLimit) {
        super(wheels, speed);
        this.loadLimit=loadLimit;
    }
}
public class Ass_3_1 {
    public static void main(String[] args) {
        Vehicle v=new Vehicle(4,45);
        Car c=new Car(4,120,2);
        Truck t=new Truck(16,90,50);
        if (c.speed>t.speed){
            System.out.println("Car is Faster");
        }
        else{
            System.out.println("Truck is faster");
        }
    }
}
