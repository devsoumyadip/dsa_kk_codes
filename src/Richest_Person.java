public class Richest_Person {
    public static void main(String[] args) {
        int[][] Accounts={
                {1,2,3},
                {3,9,3},
                {3,4,3}
        };
        System.out.println(maxWealth(Accounts));

    }
    static int maxWealth(int[][] account){

        int maxVal=Integer.MIN_VALUE;
        for (int person = 0; person < account.length; person++) {
            int rowSum=0;
            for (int accounts = 0; accounts < account[person].length; accounts++) {
                rowSum+=account[person][accounts];
            }
            if (rowSum>maxVal) {
                maxVal=rowSum;
            }
        }
        return maxVal;
    }

}
