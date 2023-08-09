package duck_creek_tech;

public class FindGCD {
    public static int find_gcd(int num1,int num2){
        while(num2 != 0){
            int rem=num1%num2;
            num1=num2;
            num2=rem;
        }
        return num1;
    }
    public static void main(String[] args) {
        System.out.println(find_gcd(14,15));
    }
}
