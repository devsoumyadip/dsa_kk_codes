public class WeightCheck {
    public static boolean check(int[] arr,int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        if (count>1){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] weights={12,15,78,69,44,44,23};
        int target=60;
        System.out.println(check(weights,target));

    }
}
