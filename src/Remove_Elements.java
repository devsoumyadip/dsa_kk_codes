public class Remove_Elements {
        public static int removeElement(int[] nums, int val) {

            int i=0;
            int count=0;
            while (i<nums.length){
                if(nums[i] != val){
                    nums[count]=nums[i];
                    count+=1;
                    i+=1;
                }
            }
            return count;
        }

    public static void main(String[] args) {

    }

}
