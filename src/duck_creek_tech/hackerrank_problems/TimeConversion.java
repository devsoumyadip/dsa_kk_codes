package duck_creek_tech.hackerrank_problems;

public class TimeConversion {
    public static String timeConversion(String s) {
        // Write your code here
        String ans = "";
        String[] arr = s.substring(0, 8).split(":");
        if (s.endsWith("PM")) {
            if (Integer.valueOf(arr[0]) != 12) {
                int hr = Integer.valueOf(arr[0]) + 12;
                ans += hr + ":" + arr[1] + ":" + arr[2];
            } else {
                ans += "12:" + arr[1] + ":" + arr[2];
            }
        } else {
            if (Integer.valueOf(arr[0]) == 12) {
                ans += "00:" + arr[1] + ":" + arr[2];
            } else {
                ans += arr[0] + ":" + arr[1] + ":" + arr[2];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String time = "12:01:00PM";
        System.out.println(timeConversion("12:01:00PM"));    //12:01:00
        System.out.println(timeConversion("12:01:00AM"));    //00:01:00
        System.out.println(timeConversion("08:40:07PM"));    //20:40:07
        System.out.println(timeConversion("06:30:09AM"));    //06:30:09
    }
}
