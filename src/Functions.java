public class Functions {
    public static void main(String[] args) {
      int a=7;
      int b=9;
        System.out.println("a + b= "+sum(a,b));
        Ass obj1=new Ass();
        obj1.meth1();
    }
    public static int sum(int a,int b){
        return a+b;
    }
}
class Ass{
    public void meth1(){
        System.out.println("Inside Ass,meth1");
    }
}
