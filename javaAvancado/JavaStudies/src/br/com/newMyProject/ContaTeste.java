package br.com.newMyProject;

public class ContaTeste {
	 public static void main(String[]args) {
		 Conta conta = new Conta();
		 conta.Cliente = "Joana";
		 conta.saldo = 4_000.00;
		 conta.exibeSaldo();
		 
		 conta.saque(1200.00);
		 conta.exibeSaldo();
		 
		 conta.deposito(3000.00);
		 conta.exibeSaldo();
		 
		 Conta destino = new Conta();
		 conta.Destinatario = "Maria";
		 destino.transferencia = 2_000.00;
		 
		 conta.transferencia(destino, 2_000.00);
		 conta.exibeSaldo();
		
	 }
	
}

