package duck_creek_tech;

public class LeapYear {
    public static boolean isLeapYear(int year){
        if (year !=0){
            if (year%100==0){
                if (year%400==0){
                    return true;
                }
            }
            else if (year%4==0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isLeapYear(2010));
    }
}
