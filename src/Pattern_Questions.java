public class Pattern_Questions {

    static void ptrn1(int row){
        for (int i=1;i<=row;i++){
            for (int j = 1; j <i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void ptrn2(int row){
        for (int i=1;i<=row;i++){
            for (int j = 1; j <=row-i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void ptrn3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void ptrn4(int n){
        for (int row = 1; row <= 2*n-1; row++) {
            //upper half
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int col = 0; col <=n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ptrn4(5);
    }
}
