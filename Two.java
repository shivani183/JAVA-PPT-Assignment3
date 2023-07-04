
//Q1.Write a simple Banking System program by using OOPs concept where you can get account Holder name balance etc?

package Practice;
import java.util.*;
class BankDetails {  
    private String accno;  
    private String name;  
    private String acc_type;  
    private long balance;  
    Scanner sc = new Scanner(System.in);  
    public void openAccount() {  
        System.out.print("Enter Account No: ");  
        accno = sc.next();  
        System.out.print("Enter Account type: ");  
        acc_type = sc.next();  
        System.out.print("Enter Name: ");  
        name = sc.next();  
        System.out.print("Enter Balance: ");  
        balance = sc.nextLong();  
    }  
    public void showAccount() {  
        System.out.println("Name of account holder: " + name);  
        System.out.println("Account no.: " + accno);  
        System.out.println("Account type: " + acc_type);  
        System.out.println("Balance: " + balance);  
    }  
    public void deposit() {  
        long amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextLong(); 
        System.out.println(name + " deposited amount" + amt);
        balance = balance + amt;  
		System.out.println("Balance after deposit: " + balance);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }  
    public void withdrawal() {  
        long amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong();
        if (balance >= amt) {
			System.out.println(name + " withdrawn amount " + amt);
			balance = balance - amt;

			System.out.println("Amount left in "+name+" acount is :: "+balance);

			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		else {

			System.out.println(name + " you can not withdraw " + amt);
			System.out.println("Your withdrawal amount is more than current balance: " + balance);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
         
    }  
    public boolean search(String ac_no) {  
        if (accno.equals(ac_no)) {  
            showAccount();  
            return (true);  
        }  
        return (false);  
    }  
} 
class ThreadWithdrawal1 extends Thread {

	BankDetails object;

	ThreadWithdrawal1(BankDetails ob) {
		this.object = ob;}
	public void run() {
		object.withdrawal();
	}
}
class ThreadDeposit1 extends Thread {

	BankDetails object;
	ThreadDeposit1(BankDetails ob) {
		this.object = ob;}
	
	public void run() {
		object.deposit();
	}
}
public class Two {  
    public static void main(String arg[]) {  
        Scanner sc = new Scanner(System.in);  
        //create initial accounts  
        System.out.print("How many number of customers do you want to input? ");  
        int n = sc.nextInt();  
        BankDetails C[] = new BankDetails[n];  
        for (int i = 0; i < C.length; i++) {  
            C[i] = new BankDetails();  
            C[i].openAccount();  
        }  
        int ch;  
        do {  
            System.out.println("\n *** Welcome to Banking Application***");  
            System.out.println("1. Display all account details \n2. Search by Account number\n3. Deposit the amount \n4. Withdraw the amount \n5.Exit ");  
            System.out.println("Enter your choice: ");  
            ch = sc.nextInt();  
                switch (ch) {  
                    case 1:  
                        for (int i = 0; i < C.length; i++) {  
                            C[i].showAccount();  
                        }  
                        break;  
                    case 2:  
                        System.out.print("Enter account no. : ");  
                        String newAcc = sc.next();  
                        boolean flag = false;  
                        for (int i = 0; i < C.length; i++) {  
                            flag = C[i].search(newAcc);  
                            if (flag) {  
                                break;  
                            }  
                        }  
                        if (!flag) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 3:  
                        System.out.print("Enter Account no. : ");  
                        newAcc = sc.next();  
                        flag = false;  
                        for (int i = 0; i < C.length; i++) {  
                            flag = C[i].search(newAcc);  
                            if (flag) {  
                            	ThreadDeposit1 t1 = new ThreadDeposit1(C[i]);  
                            	t1.start();
                                break;  
                            }  
                        }  
                        if (!flag) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 4:  
                        System.out.print("Enter Account No : ");  
                        newAcc = sc.next();  
                        flag = false;  
                        for (int i = 0; i < C.length; i++) {  
                            flag = C[i].search(newAcc);  
                            if (flag) {  
                            	ThreadWithdrawal1 t2 = new ThreadWithdrawal1(C[i]);
                            	t2.start();
                                break;  
                            }  
                        }  
                        if (!flag) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    default :  
                        System.out.println("thank you visit again");  
                        break;  
                }  
            }  
            while (ch <5);  
        }  

}
