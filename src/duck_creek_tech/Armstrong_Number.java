package duck_creek_tech;
//Write the code to for Armstrong number
// Armstrong number is any number following the given rule
// abcd... = a^n + b^n + c^n + d^n + ...
// Where n is the order(length/digits in number)

// Example = 153 (order/length = 3)
// 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

// Example = 1634 (order/length = 4)
// 1634 = 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634

// number of digits in a number is order
public class Armstrong_Number {
    public static int findOrder(int n){
        return String.valueOf(n).length();
    }
    public static boolean isArmstrong(int n){
        int order=findOrder(n);
        int ans = 0;
        int prev=n;
        for (int i = 0; i < order; i++) {
            ans+=Math.pow(n%10,order);
            n=n/10;
        }
        if (ans==prev){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isArmstrong(123));
        System.out.println(isArmstrong(153));
    }
}
