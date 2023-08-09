package java_open_elective_assignments;

class X {
    public int f(){
        return 2;
    }
}

class Y extends X {
    public int f() {
        return 4;
    }
    public int f(int x){
        return x;
    }
}

public class OverrideExample {
    public static void main(String[] args) {
        Y b=new Y();
        X a=new Y();

        System.out.println(a.f());
        System.out.println(b.f());
//        System.out.println(a.f(3));
        System.out.println(b.f(3));
    }
}
