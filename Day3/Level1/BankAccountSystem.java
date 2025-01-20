import java.util.*;
class BankAccount{
    static String bankName= "SBI";
    String accountHolderName;
    final int accountNumber;
    static int count = 0;
    public BankAccount(String accountHolderName, int accountNumber){
        this.accountHolderName=accountHolderName;
        this.accountNumber= accountNumber;
        count++;
    }
    void display (){
        System.out.println("Customer Name "+accountHolderName+ "\n Account Number "+ accountNumber+" \n Bank name "+bankName);
    }
    static void getTotalAccount(){
        System.out.println("Total accounts "+ count);
    }

}
public class BankAccountSystem{
    public static void main(String[] args) {
        BankAccount object1=new BankAccount("Abc", 123);
        BankAccount object2 = new BankAccount("xyz",789);
        if (object1 instanceof BankAccount){
            System.out.println("Object one is instance of class \n  ");
            object1.display();
        }
        
        if (object2 instanceof BankAccount){
            System.out.println("Object two is instance of class \n Details of object 2");
            object2.display();
        }
        BankAccount.getTotalAccount();
        
    }
}