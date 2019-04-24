package util;

public class CurrencyConverter {
	
	public static double IOF = 6.0;
	public static double dolarValor;
	public static double dolarQtd;
	
	
	public static double cotacao() {
		return  (dolarQtd * dolarValor)*((IOF/100)+1);
		
	}
	

}
