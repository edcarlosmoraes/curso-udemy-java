package entities;

public class Account {
	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	
	public Account() {
	}
	
	public Account(int numeroConta, String nomeTitular, double valorInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		deposito(valorInicial);
	}
	public Account(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}	
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double deposito(double deposito) {
		return saldo += deposito;
	}
	public double saque( double saque) {
		return saldo -= (saque + 5);
	}

	@Override
	public String toString() {
		return "Account " + numeroConta + ", Holder: " + nomeTitular + ", Balance: $ " + String.format("%.2f", saldo);
	}
	
	

}
