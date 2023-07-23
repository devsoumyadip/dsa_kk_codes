class MyThr extends Thread{
    public MyThr(String name) {
        super(name);
    }
    public void run() {
        System.out.println("This is a thread here");
    }
}
class MyThreadRun1 implements Runnable {
    public void run(){
        System.out.println("Inside ThRun1");
    }
}
class MyThreadRun2 implements Runnable {
    public void run(){
        System.out.println("Inside ThRun2");
    }
}
class MyThread1 extends Thread{
    public void run() {
        System.out.println("Inside MyTh1");
    }
}
class MyThread2 extends Thread {
    public void run(){
        System.out.println("Inside MyTh2");
    }
}
public class ThreadClass {
    public static void main(String[] args) {

        //Extending the thread class
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();

        t1.start();
        t2.start();

        //Implementing Runnable interface
        MyThreadRun1 tr1=new MyThreadRun1();
        Thread th1=new Thread(tr1);

        MyThreadRun1 tr2=new MyThreadRun1();
        Thread th2=new Thread(tr2);

        th1.start();
        th2.start();

        //Thread name & id
        MyThr mthr=new MyThr("Cute_Thread101");
        mthr.start();
        System.out.println("Name of the thread : "+mthr.getName());
        System.out.println("ID of the thread : "+mthr.getId());

        //priority
        t1.setPriority(3);
        t2.setPriority(9);
        System.out.println("t1 priority : "+t1.getPriority());
        System.out.println("t2 priority : "+t2.getPriority());

        //current state
        System.out.println(t1.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
