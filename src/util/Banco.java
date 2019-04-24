package util;

public class Banco {
	
	private String correntista;
	private int conta;
	private double saldo;
	
	public Banco() {
		
	}

	public Banco(String correntista, int conta) {
		this.correntista = correntista;
		this.conta = conta;
	}

	public Banco(String correntista, int conta, double depositoInicial) {
		this.correntista = correntista;
		this.conta = conta;
		deposito(depositoInicial);
	}
	

	public String getCorrentista() {
		return correntista;
	}

	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}


	public void deposito(double valor) {
       saldo += valor;		
	}
	
	public void saque(double valor) {
		saldo -= valor + 5.0;
	}
	
	public String toString() {
		return "Account " +
	           getConta() +
	           " Holder: "+
	           getCorrentista()+
	           " Balance: "+
	           String.format("%.2f", getSaldo()) ;
	}

}
