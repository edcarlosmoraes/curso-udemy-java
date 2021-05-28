package exercicio4;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Enter account number: ");
		int numeroConta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char resposta = sc.next().charAt(0);
		

		if (resposta == 'y') {
			System.out.print("Enter initial deposit value: ");
			double valorInicial = sc.nextDouble();
			account = new Account(numeroConta, nomeTitular, valorInicial);
		} else {
			account = new Account(numeroConta, nomeTitular);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account.toString());

		System.out.println();
		System.out.print("Enter a deposit value: ");
		account.deposito(sc.nextDouble());
		System.out.println("Update account data:");
		System.out.println(account.toString());
		System.out.println();

		System.out.print("Enter a withdraw value: ");
		account.saque(sc.nextDouble());
		System.out.println("Update account data:");
		System.out.println(account.toString());
		
		sc.close();

	}

}
