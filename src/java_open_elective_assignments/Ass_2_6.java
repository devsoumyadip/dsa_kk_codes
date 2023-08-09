package java_open_elective_assignments;

//Implement a class for stack of integers using an array. Please note that the
//operations defined for a stack data structure are as follows: "push". "pop".
//        "print".
//There should be a constructor to create an array of integers; The size of the
//array is provided by the user.
//Write a "main" function to (i) create a stack to hold maximum of 30
//integers: (ii) push the numbers 10, 20, 30. 15, 9 to the stack:(iii) print the
//stack: (ii) pop thrice and (iv) print the stack again.

class Stack{
    private int[] arr;
    private int top;

    public Stack(int size){
        arr=new int[size];
        top=-1;
    }
    void push(int val){
        if (top==arr.length-1){
            System.out.println("Stack overflow !!!");
            return;
        }
        arr[++top]=val;
        System.out.println("Pushed : "+val);
    }
    void pop(){
        if (top== -1){
            System.out.println("Stack underflow !!!");
            return;
        }
        System.out.println("Popped : "+arr[top--]);
    }
    void print(){
        if (top==-1){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack : ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class Ass_2_6 {
    public static void main(String[] args) {
        Stack s=new Stack(7);
        s.push(5);
        s.push(15);
        s.push(25);
        s.push(35);
        s.push(45);
        s.push(55);
        s.push(65);
        s.print();

        s.pop();
        s.pop();
        s.pop();
        s.print();
    }
}
