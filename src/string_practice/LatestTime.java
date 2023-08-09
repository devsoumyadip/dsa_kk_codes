package string_practice;
/*
3114. Latest Time You Can Obtain After Replacing Characters

You are given a string s representing a 12-hour format time where some of the digits (possibly none) are replaced with a "?".

12-hour times are formatted as "HH:MM", where HH is between 00 and 11, and MM is between 00 and 59. The earliest 12-hour time is 00:00, and the latest is 11:59.

You have to replace all the "?" characters in s with digits such that the time we obtain by the resulting string is a valid 12-hour format time and is the latest possible.

Return the resulting string.



Example 1:

Input: s = "1?:?4"

Output: "11:54"

Explanation: The latest 12-hour format time we can achieve by replacing "?" characters is "11:54".
 */

public class LatestTime {
    public String findLatestTime(String s) {
        String ans="";
        char[] arr=s.toCharArray();
        if (arr[0]=='?'){
            if(arr[1]=='?'){
                ans=ans+"11";
            }
            else if(arr[1] =='0'){
                ans="10";
            }
            else if(arr[1] =='1'){
                ans="11";
            }
            else{
                ans=ans+'0'+arr[1];
            }
        }

        if (arr[1] == '?'){
            if(arr[0]=='1'){
                ans=ans+"11";
            }
            else if(arr[0] == '0'){
                ans=ans+"09";
            }
        }
        if(arr[0] != '?' && arr[1] != '?'){
            ans=ans+arr[0]+arr[1];
        }
        ans=ans+":";

        if(arr[3]=='?'){
            if(arr[4]=='?'){
                ans=ans+"59";
            }
            else {
                ans=ans+"5"+arr[4];
            }
        }
        if(arr[4]=='?'){
            if(arr[3] != '?'){
                ans=ans+arr[3]+"9";
            }
        }

        if(arr[3] != '?' && arr[4] != '?'){
            ans=ans+arr[3]+arr[4];
        }

        return ans;
    }
    public static void main(String[] args) {
        String s="??:??";
        LatestTime lt=new LatestTime();
        System.out.println(lt.findLatestTime(s));
    }
}
