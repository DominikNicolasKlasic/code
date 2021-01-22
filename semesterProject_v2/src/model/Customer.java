package model;

public class Customer extends Person {
	private double balance;

	public Customer(int id, String name, String email, double balance) {
		super(id, name, email);
		this.setBalance(balance);
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
