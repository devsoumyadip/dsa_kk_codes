package java_open_elective_assignments;

//Write a program to implement a class "Student" with the following members.
//Nanme of the student
//Marks of the student obtained in three subjects.
//Funetion to assign initial values
//Function to compute total average
//Function to display the student's name and the total marks
//Write an appropriate main() to demonstrale the functioning of the above.

class Student22{
    String name;
    double m1,m2,m3;
    public Student22(String n,double m1,double m2,double m3){
        this.name=n;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    double calculateAverageMarks(){
        return (m1+m2+m3)/3;
    }
    void display(){
        System.out.println("Name of the student : "+name);
        System.out.println("Total marks of the student : "+(m1+m2+m3)+" out of 300");
    }
}
public class Ass_2_2 {
    public static void main(String[] args) {
        Student22 s1=new Student22("bullet",60,25,30);
        System.out.println(s1.calculateAverageMarks());
        s1.display();
    }
}
