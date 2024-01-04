package entities;

public class Banco {

	private String nameBanco;
	private int agencia;
	
	public Banco(String nameBanco, int agencia) {
		this.nameBanco = nameBanco;
		this.agencia = agencia;
	}
	
	public String getNameBanco() {
		return nameBanco;
	}
	public void setNameBanco(String nameBanco) {
		this.nameBanco = nameBanco;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
}
