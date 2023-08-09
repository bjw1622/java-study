package prob05;

public class Account {
	private String accountNo;
	private int balance = 0;

	public Account(String accountNo) {
		this.accountNo = accountNo;
	}

	public void save(int i) {
		System.out.println(accountNo+"계좌에 "+i+"만원이 입금 되었습니다.");
		this.balance = this.balance+i;
		// TODO Auto-generated method stub

	}

	public void deposit(int i) {
		System.out.println(accountNo+"계좌에 "+i+"만원이 출금 되었습니다.");
		this.balance = this.balance - i;
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

}
