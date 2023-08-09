package java_open_elective_assignments;

import java.util.StringTokenizer;

public class StringTokenExample {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Welcome to Java");
        while (st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }

        StringTokenizer st2=new StringTokenizer("hii,i am a boy,who wants to become rich,day by day",",");
        while (st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }
        StringTokenizer st3=new StringTokenizer("hii,i am   a boy,who       wants to become rich,day by day",",\t",true);
        while (st3.hasMoreTokens()){
            System.out.println(st3.nextToken());
        }
    }
}
