package BinarySearch;

public class SmallestLetter {
    public static char sletter(char[] arr,char target){
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int m=s+(e-s)/2;
            if (target>arr[m]){
                s=m+1;
            } else {
                e=m-1;
            }
        }
        return arr[s%arr.length];
    }

    public static void main(String[] args) {
        char[] arr={'c','f','j'};
        char target='o';
        System.out.printf("Smallest letter that is greater than %c is %c",target,sletter(arr,target));
    }
}
