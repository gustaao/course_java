package course;

import java.util.Locale;
import java.util.Scanner;

import util.Banco;


public class AberturaConta {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Banco banco;
		
		
		System.out.print("Enter account number: ");
		int conta = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Name: ");
		String nome = sc.nextLine();

		System.out.println("Is there na initial deposit (y/n)? ");
		String depositaValor = sc.next();
		
	
		if (depositaValor.equals("y")){
			System.out.print("Enter valor: ");
			double valor = sc.nextDouble();
			banco = new Banco(nome,conta,valor);	
			System.out.println("Account data:");
			System.out.println(banco);
			
		}else {
			banco = new Banco(nome,conta);
			System.out.println("Account data:");
			System.out.println(banco);
		}
		
	System.out.print("Enter a deposit value: ");
	double deposito = sc.nextDouble();
	banco.deposito(deposito);
	System.out.println("Updated account data:");
	System.out.println(banco);
	
	System.out.println("Enter a withdraw value:");
	double retirada = sc.nextDouble();
	banco.saque(retirada);
	System.out.println("Updated account data:");
	System.out.println(banco);
		
		
		
	sc.close();	
	}


}
