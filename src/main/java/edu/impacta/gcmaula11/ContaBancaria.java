package edu.impacta.gcmaula11;
//Metodos implementados.
public class ContaBancaria {
	private long saldo;
	public ContaBancaria() { saldo = 0; }
	public ContaBancaria(long s) { saldo = s; }
	
	public void depositar(long valor) {
		saldo += valor;
	}
	
	public boolean sacar(long valor) {
		if(saldo <= saldo) {
			saldo -= valor;
		}
		return false;
	}
	
	public long getSaldo() {
		return saldo;
	}
	
}
 
