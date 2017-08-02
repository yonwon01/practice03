package prob05;

public class Account {

	String accountNo;
	int balance;

	public Account(String accountNo) {
		this.accountNo = accountNo;
		System.out.println(accountNo + "계좌가 개설되었습니다.");
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void save(int bal) {
		balance += bal;
		System.out.println(accountNo + "계좌에" + bal + "이 입급되었습니다.");
	}

	public void deposit(int dep) {
		if (balance > dep) {
			balance -= dep;
			System.out.println(accountNo + "계좌에" + dep + "이 출금되었습니다.");
		} else if (balance < dep) {
			System.out.println("잔액이 부족합니다.");
		}
	}

}
