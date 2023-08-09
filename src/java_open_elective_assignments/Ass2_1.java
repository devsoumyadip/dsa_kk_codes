package java_open_elective_assignments;


//Create a class "Room" which will hold the height, width and breadth of the room
//in three fields. This class also has a method to calculate the volume of this room.
//Create another class "RoomDemo" which will use the earlier class. create
//instances of rooms, display the volume of room.
class Room{
    double height;
    double width;
    double breadth;
    public Room(double h,double w,double b){
        this.height=h;
        this.breadth=b;
        this.width=w;
    }
    public double calculateVolume(){
        return height*width*breadth;
    }
}
public class Ass2_1 {
    public static void main(String[] args) {
        Room r1=new Room(3,4,5);
        System.out.println(r1.calculateVolume());
    }
}
