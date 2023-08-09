import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
public class Test_Ptrn {

    public static int[] rcMatrix(int[][] matrix,int target){

        int r=0;
        int c=matrix.length-1;

        while(r<matrix.length && c>=0){
            if (matrix[r][c]==target){
                return new int[] {r,c};
            }
            if (matrix[r][c]>target){
                c--;
            }
            else{
                r++;
            }
        }

        return new int[]{-1,-1};
    }
    private static final AtomicInteger counter = new AtomicInteger(1);
    public static String getNextEmpId() {
            return String.format("EMP%03d", counter.incrementAndGet());
        }
        public static void main(String[] args) {
//            System.out.println(getNextEmpId());
//            System.out.println(getNextEmpId());
//            System.out.println(getNextEmpId());

            int [][] matrix={
                    {2,4,6},
                    {8,10,13},
                    {15,17,19}
            };
            System.out.println(Arrays.toString(rcMatrix(matrix,10)));
        }
}

