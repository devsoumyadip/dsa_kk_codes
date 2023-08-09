package java_open_elective_assignments;

//Write a class to represent complex numbers with necessary constructors. Write
//member functions to add. multiply and show.
//There should be three constructors: (i) to initialize real and imaginary
//parts to 0: (ii) to initialize imaginary part to 0 but to initialize the real part
//to user defined value: (iii) to initialize the real part and the imaginary part
//to user defined values
//Also, write a "main" function to (i) create two complex numbers 3+2i and
//4-2i: (i) to print the sum and product of those numbers.

class Complex{
    int real,img;
    public Complex(int r,int i){
        this.real=r;
        this.img=i;
    }
    public Complex(){
        this.real=0;
        this.img=0;
    }
    public Complex(int r){
        this.real=r;
        this.img=0;
    }
    Complex add(Complex a){
        return new Complex(a.real+this.real,a.img+this.img);
    }
    void show() {
        System.out.println(real + (img >= 0 ? "+" : "") + img + "i");
    }
    Complex multiply(Complex a){
        //z1 = a + ib and z2 = c + id
        // z1z2 = (ac – bd) + i(ad + bc)
        int r=a.real*this.real-this.img*a.img;
        int im=this.real*a.img+this.img*a.real;
        return new Complex(r,im);
    }
}

public class Ass_2_4 {
    public static void main(String[] args) {
        Complex c1=new Complex(2,3);
        Complex c2=new Complex(4,-7);

        Complex c3=c1.add(c2);
        Complex c4=c1.multiply(c2);
        c3.show();
        c4.show();

    }
}
