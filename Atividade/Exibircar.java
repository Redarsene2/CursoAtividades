package Atividade;

public class Exibircar {

	public static void main(String[] args) {
		
		Cartao1 c1 = new Cartao1();
		Cartao2 c2 = new Cartao2();
		
		c1.cartao = "40028922";
		c1.datav = "25-06-2000";
		
		c1.exibirDados();
		
		c2.cartao = "25262428292";
		c2.datav = "38-07-2001";
		
		c2.exibirDados();
	

	}

}
