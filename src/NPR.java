public class NPR {
    static int factorial(int x){
        if(x==0 || x==1){
            return 1;
        }
        return x*factorial(x-1);
    }
    static int nPr(int n,int r){
        return factorial(n)/factorial(n-r);
    }

    public static void main(String[] args) {
        int x=5;
        int n=5;
        int p=2;
        System.out.println(factorial(x));
        System.out.println(nPr(n,p));
    }
}
