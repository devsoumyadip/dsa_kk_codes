public class Recursion_Example {

    static int fibo(int n){

        //base condition
        if (n<2){
            return n;
        }

        return fibo(n-1)+fibo(n-2);
    }

    static int bsRec(int[] arr,int target,int s,int e){
        if (s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if (arr[m]==target){
            return m;
        } else if (arr[m]>target) {
            return bsRec(arr,target,s,m-1);
        }
        return bsRec(arr,target,m+1,e);
    }
    public static void main(String[] args) {
//        System.out.println(fibo(50));
        int[] arr={2,4,6,8,10,12};
        System.out.println(bsRec(arr,10,0,arr.length-1));
    }
}
