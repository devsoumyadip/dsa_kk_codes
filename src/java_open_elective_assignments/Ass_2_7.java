package java_open_elective_assignments;

import java.util.Arrays;

//Implement a class for a "Student". Information about a student includes name, roll
//number and an array of two subject names. The class should have suitable
//        constructor and get/set methods.
//Implement a class *TabulationSheet". A tabulation sheet contains roll numbers
//and marks of each student for a particular subject. This class should have a
//        method for adding the marks and roll number of a student.
//Implement a class "MarkSheet". A mark sheet contains marks of all subjects for a
//particular student. This class should have a method lo add name of a student and
//        marks in each subject.
//Write a "main" function to creale three "Student" objects, two "TabulationSheet"
//objects for two subjects and three "MarkSheet" object for three students. Print the
//mark sheets.
class Student27{
    private String name;
    private int roll;
    private String sub[];

    public Student27(String n,int r,String s[]){
        this.name=n;
        this.sub=s;
        this.roll=r;
    }
    void setName(String newName){
        this.name=newName;
    }
    void setRoll(int newRoll){
        this.roll=newRoll;
    }
    void setSub(String newS[]){
        this.sub=newS;
    }
    int getRoll(){
        return this.roll;
    }
    String[] getSub(){
        return this.sub;
    }
    String getName(){
        return this.name;
    }
    void display(){
        System.out.println("Student : "+name+" Roll : "+roll);
    }

}
class TabulationSheet{
int rolls[]=new int[100];
int marks[]=new int[100];
int count=0;
void addMark(int roll,int mark){
    rolls[count]=roll;
    marks[count]=mark;
    count++;
}
int getMark(int roll){
    for (int i = 0; i <= count; i++) {
        if (rolls[i]==roll){
            return marks[i];
        }
    }
    return -1;
}
void showTabulationSheet(){
    for (int i = 0; i < count; i++) {
        System.out.print(rolls[i]+" : "+marks[i]+" , ");
    }
    System.out.println();
}
}
class MarkSheet{
    String name;
    int roll;
    int marks[];

    public MarkSheet(String n,int r,int m[]){
     this.name=n;
     this.marks=m;
     this.roll=r;
    }
    void displayMarksheet(){
        System.out.println("Marksheet of : "+name);
        System.out.println("Roll no. : "+roll);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks of subject "+(i+1)+" : "+marks[i]);
        }
    }
}
public class Ass_2_7 {
    public static void main(String[] args) {
        Student27 s=new Student27("mahesh",12,new String[]{"java","deep learning"});
        s.display();
        s.setName("ramesh");
        s.setSub(new String[]{"bengali","english"});
        s.display();
        System.out.println(Arrays.toString(s.getSub()));

        TabulationSheet t=new TabulationSheet();
        t.addMark(1,85);
        t.addMark(2,78);
        t.addMark(3,81);
        t.showTabulationSheet();
        System.out.println(t.getMark(23));

        MarkSheet m=new MarkSheet("mahesh",23,new int[]{85,98});
        m.displayMarksheet();

    }
}
