package evaluation;

class Banking {   
    String name;
    String accountNumber;
    int balance;
    
    public Banking(String name, String accountNumber, int balance) {
    	this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
    }
    
    public void deposit(int balance) {
    	this.balance += balance;
    	System.out.println(balance + "원이 입금됨");
	}
    
    public void withdraw(int balance) {
    	this.balance -= balance;
    	System.out.println("계좌에서 " + balance + "원이 출금됨");
	}
    
    public void showAccount() {
		System.out.println("계좌주 : " + this.name);
		System.out.println("계좌번호 : " + this.accountNumber);
		System.out.println("잔고 : " + this.balance);
	}
}

public class Q7BankingMain {
	public static void main(String[] args) {
		Banking banking = new Banking("장동건", "123-45-67890", 10000);
        banking.deposit(5000);
	    banking.withdraw(9000);
        banking.showAccount();
	}
}
