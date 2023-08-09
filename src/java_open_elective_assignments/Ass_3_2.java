package java_open_elective_assignments;

//Consider a class "Enmployee". The class Employee" has the following attributes: (i) name
//and (ii) age. It should be possible to print the name of an employee object.
//Consider another class "Manager" which is a specialization of the class "Employee". Each
//manager object contains a list of employees that the manager supervises. Printing a manager
//object involves printing his/her name, age and the details of the employees that he/she is
//managing. Each employee object must also have a reference to his/her manager. An
//employee may be queried about his/her manager. Implement the classes "Employee" and
//"Manager" in JAVA.

class Employee{
    String name;
    int age;
    public Employee(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name : "+name+" , Age : "+age);
    }
}
class Manager extends Employee{
    Employee employees[];
    public Manager(String name, int age,Employee employees[]) {
        super(name, age);
        this.employees=employees;
    }
}
public class Ass_3_2 {
    public static void main(String[] args) {
        Employee e=new Employee("sanmoy",23);
        Employee e1=new Employee("rik",23);
        Employee e2=new Employee("anu",23);
        e.display();
        e1.display();
        e2.display();
    }
}
