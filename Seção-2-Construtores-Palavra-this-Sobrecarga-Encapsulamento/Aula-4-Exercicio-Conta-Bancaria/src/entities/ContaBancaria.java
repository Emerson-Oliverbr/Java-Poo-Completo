package entities;

public class ContaBancaria {
	private int number;
	private String holder;
	private double balance;	
	
	public ContaBancaria(int number, String holder ) {
		this.number = number;
		this.holder = holder;		
	}
	
	public ContaBancaria(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public int getNumber() {
		return number;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder() {
		this.holder = holder;}		 	
	
	
	public void deposit(double amount ) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}	
	
	public String toString() {
		return "Conta: " + number + " Titular: " + holder + " Saldo: R$ " + String.format("%.2f", balance);
	}
	
}
