package br.com.newMyProject;

public class Conta {
	
	String Cliente;
	String Destinatario;
	
	double saldo;
	double transferencia;
	
	void exibeSaldo() {
		System.out.println(Cliente + " voce possui R$"+ saldo + " de saldo.");
	}
	
	void saque(double valor) {
		saldo -= valor;
		System.out.println(Cliente + " voce fez um saque de R$"+ valor + " de saldo.");
	}
	
	void deposito(double valor) {
		saldo+=valor;
		System.out.println(Cliente + " voce fez um deposito de R$"+ valor + " reais.");
	}
	void depositoTransferido(double valor) {
		saldo+=valor;
	}
	
	void valorTransferido(double valor) {
		saldo -= valor;
		System.out.println(Cliente + " voce fez uma transferencia no valor de R$"+ valor + " para a conta do(a) Sr.(a) " + Destinatario);
	}
	
	void transferencia(Conta destino,double valor) {
		this.valorTransferido (valor);
		destino.depositoTransferido(valor);
		
	}
	
}
