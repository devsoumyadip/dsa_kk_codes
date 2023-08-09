package java_open_elective_assignments;

//Implement a class for "Date". Write member functions for (i) getting the previous
//day. (iv) getting the next day. (iii) printing a day
//There should be four constructors: (i) day, month and year are initialized
//to 01,01, 1970: (ii) day is initialized to user specified value but month and
//year are initialized to 01, 1970: (ii) day, month are initialized to user
//specified value but year is initialized to 1970: (iv) day, month and year are
//initialized to user defined values.
//Also, wrile a "main" function to (i) create a date object: (ü) print the next
//and the previous day.

class MyDate{
    private int day,month,year;
    public MyDate(int d,int m,int y){
        this.day=d;
        this.month=m;
        this.year=y;
    }
    public MyDate(){
        this.day=01;
        this.month=01;
        this.year=1970;
    }
    public MyDate(int d){
        this.day=d;
        this.month=01;
        this.year=1970;
    }
    public MyDate(int d,int m){
        this.day=d;
        this.month=m;
        this.year=1970;
    }
    void display(){
        System.out.println("Date : "+this.day+"/"+this.month+"/"+this.year);
    }
    void getNextDay(){
        this.day++;
        if (this.day>30){
            this.day=1;
            this.month++;
        }
        if (this.month>12){
            this.month=1;
            this.year++;
        }
    }
    void getPreviousDay(){
        day--;
        if (day<1){
            day=30;
            month--;
        }
        if (month<1){
            month=12;
            year--;
        }
    }
}
public class Ass_2_5 {
    public static void main(String[] args) {
        MyDate d1=new MyDate(30,1,2001);
        d1.display();
        d1.getNextDay();
        d1.display();
        d1.getPreviousDay();
        d1.getPreviousDay();
        d1.display();


    }
}
