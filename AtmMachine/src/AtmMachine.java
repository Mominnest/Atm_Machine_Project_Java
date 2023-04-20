import java.util.Scanner;

class ATM{
    float balance = 10000;
    int pin = 1122;
    public void checkpin(){
        System.out.println("Enter your pin");
        Scanner sc =new Scanner(System.in);
        int enteredpin =sc.nextInt();
        if (enteredpin == pin){
            menu();
           
           


        }
        else{
            System.out.println("Enter a valid PIN");
        }
     }

   
public void menu(){
    System.out.println(" 1: Check balance ");
    System.out.println(" 2: Withdraw money ");
    System.out.println(" 3: Deposit Money ");
    System.out.println(" 4: EXIT ");

    Scanner sc = new Scanner(System.in);
    int opt =sc.nextInt();

    if(opt ==1){
        checkBalance();
    }
    else if(opt ==2){
        withdraw();
    }
    else if(opt==3){
        deposit();
    }
    else if(opt ==4){
       return;
    }
    else{
        System.out.println("Enter opt between 1-4");
    }
}

public void checkBalance(){
    System.out.println("Balance:" + balance);
    menu();
}

public void withdraw(){
    System.out.println("Enter Amount to Withdraw");
    Scanner sc = new Scanner(System.in);
    float amount = sc.nextFloat();
    if(amount > balance){
        System.out.println("Insufficient Balanace");
    }
    else{
        balance =balance-amount;
        System.out.println("Money withdrawl Successful");
        System.out.println("Account balance :"+balance);
       
    }
    menu();

}
public void deposit(){
    System.out.println("Enter Amount to deposit");
    Scanner sc = new Scanner(System.in);
    float amount = sc.nextFloat();
    if(amount<=1000){
        System.out.println("Enter Amount more than Rs 1000");
    }
    else{
        balance=balance+amount;
        System.out.println("Money deposit Successful");
        System.out.println("Account balance :"+balance);
    }
    menu();
}

    
      
}        
   
public class AtmMachine {

    public static void main(String[]args){
ATM obj = new ATM();
obj.checkpin();

    }
}