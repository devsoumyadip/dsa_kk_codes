package java_open_elective_assignments;

//reate a class "BankAccount" with the following fields:
//Account Holder's Name
//Account Number
//Account Type (S for savings account and 'C for current account)
//Balance amount
//Methods:
//        Initialize data
//Deposit money
//Withdrawal of money - minimum balance Rs. 1,000/
//To display all fields for an account
//Write an appropriate main() to run it.

class BankAccount{
    private String name,acType;
    private int acNo,balance;

    public BankAccount(String n,int ac,int bal,String type){
        this.acNo=ac;
        this.acType=type;
        this.balance=bal;
        this.name=n;
    }
    void depositMoney(int amt){
        if (amt>0){
            balance=balance+amt;
            System.out.println("Rs."+amt+" deposited successfully.\nCurrent balance : "+balance);
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    void withdrawMoney(int amt){
        if (amt>0 && balance-amt >= 1000){
            balance=balance-amt;
            System.out.println("Rs. "+amt+" Withdraw successfully.\nCurrent balance : "+balance);
        }
        else {
            System.out.println("Invalid amount");
        }
    }
    void display(){
        System.out.println("Name of the A/C holder : "+name);
        System.out.println("A/C No. : "+acNo);
        System.out.println("A/C Type : "+acType);
        System.out.println("Current Balance : "+balance);
    }

}
public class Ass_2_3 {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount("Bullet",120123456,1000,"s");
        b1.depositMoney(200);
//        b1.depositMoney(-200);
        b1.withdrawMoney(100);
//        b1.withdrawMoney(500);
        b1.display();

    }
}
