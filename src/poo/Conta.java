package poo;

public class Conta {

	int numero;
	double limite;
	double saldo;
	
	public Conta() {
		
		// TODO Auto-generated method stub

	}
	
	public Conta(int numero, double saldo) {
		
		this.numero = numero;
		this.limite = 300.0D;
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo + limite;
	}
	
	public void exibeSaldo() {
		System.out.println("Conta: "+numero+" - Saldo: " +String.format(" R$ %.2f", getSaldo()));
	}
	
	public void depositar(double valor) {
		if(valor <= 0) {
			System.out.println("Operação cancelada, valor inválido!");
		}else {
		 saldo += valor;
	}
}	
	public void sacar(double valor) {
		if(valor <= 0) {
			System.out.println("Operação cancelada, valor inválido!");
		}else {
		if(valor <= getSaldo()) {
			saldo -= valor;
		}else {
			System.out.println("Operação inválida.\nSaldo Indisponível...");
			}
		}
	}
	
	public boolean validaValor(double valor) {
		if(valor <= 0) {
			System.out.println("Operação inválida: valor inválido.");
			return false;
		}else if(valor > getSaldo()) {
		System.out.println("Operação inválida: Saldo indisponível.");
		return false;
	}else {
		return true;
	}
}	
	
	public void transfere(Conta conta, double valor) {
		if(validaValor(valor)) {
			sacar(valor);
			conta.saldo += valor;
		}
	}
	public String tostring() {
		return String.format("[numero = %d],[limite = %.2f], [saldo = %.2f]\n\n", numero, limite, saldo);
	}
}
