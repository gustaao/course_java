package course;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Excercise8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("what is the dollar price?");
		CurrencyConverter.dolarValor = sc.nextDouble();
		System.out.println("How many dollar will be bought?");
		CurrencyConverter.dolarQtd = sc.nextDouble();
		System.out.printf("Amout to be paid in reais = %.2f %n",CurrencyConverter.cotacao());
		
		
		sc.close();
		
		
		
	}

}
