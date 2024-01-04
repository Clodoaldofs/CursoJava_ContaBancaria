package contaBancaria;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;
import entities.Conta;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Nome do Banco: ");
		String nameBanco = sc.nextLine();
		System.out.print("Agência: ");
		int agencia = sc.nextInt();
		
		Banco banco = new Banco(nameBanco, agencia);

		System.out.print("Enter account number: ");
		int numero = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String cliente = sc.nextLine();

		System.out.print("Is there na initial deposit (y/n)? ");
		char confDeposit = sc.next().charAt(0);		
		double saldo = 0;
		if (confDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			saldo = sc.nextDouble();
			
		}	 
		Conta conta = new Conta(numero, cliente, saldo, banco);
		System.out.println();
		System.out.println("Account data:\n" + conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		saldo = sc.nextDouble();
		conta.deposito(saldo);
		System.out.println("Updated account data:\n" + conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		saldo = sc.nextDouble();
		conta.saque(saldo);
		System.out.println("Updated account data:\n" + conta);
		
		sc.close();
		
	}

}
