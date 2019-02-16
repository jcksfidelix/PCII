package poo;

public class TestaConta {

	public static void main(String[] args) {
	
		Conta c1 = new Conta(1, 1000);
		Conta c2 = new Conta(2, 2000);
		
		c1.exibeSaldo();
		c2.exibeSaldo();
		
		c1.transfere(c2,  200);
		
		c1.exibeSaldo();
		c2.exibeSaldo();
	}

}
