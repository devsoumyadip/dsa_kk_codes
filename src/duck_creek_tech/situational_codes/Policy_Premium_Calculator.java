package duck_creek_tech.situational_codes;

import java.util.Locale;
import java.util.Scanner;

public class Policy_Premium_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your age : ");
        int age=sc.nextInt();
        System.out.println("Enter vehicle type (car/bike) : ");
        String vtype=sc.next().toLowerCase();

        double basePremium=0.0;
        if (vtype.equals("car")){
            basePremium=5000;
        } else if (vtype.equals("bike")) {
            basePremium=3000;
        }
        else{
            System.out.println("Invalid vehicle type! Please enter either 'car' or 'bike'.");
        }

        double discount=0.0;
        if (age>30){
            discount=0.10;
        }
        double finalPremium=basePremium-(basePremium*discount);

        System.out.println("The premium have to pay after applying discount : "+finalPremium);
    }
}
