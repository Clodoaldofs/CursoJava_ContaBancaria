package entities;

public class Conta {

	private int numero;
	private String cliente;
	private double saldo;
	private Banco banco;

		
	public Conta(int numero, String cliente, double saldo, Banco banco) {
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
		this.banco = banco;
	}

	public int getAccount() {
		return numero;
	}

	public String getName() {
		return cliente;
	}
	public void setName(String name) {
		this.cliente = name;
	}
	
	public double totalValue() {
		return saldo;
	}

	public void deposito(double value) {
		this.saldo += value;
		}
	public void saque(double value) {
		this.saldo -= value + 5.00;
		}
	
	public String toString() {
		return "Banco: " + banco.getNameBanco() +", Agência: " + banco.getAgencia()+ ", Account: " + numero + ", Holder: " + cliente + ", Balance: $ " + String.format("%.2f", totalValue());
	}

}
