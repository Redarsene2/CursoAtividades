package Atividade;

public class Exibir {

	public static void main(String[] args) {
		
		InfoClien c1 = new InfoClien();
		InfoClien2 c2 = new InfoClien2();
		Cartao1 n1 = new Cartao1();
		Cartao2 n2 = new Cartao2();
		
		System.out.println("========================");
		c1.nome = "Daniel";
		c1.codigo = 22;
		c1.endereço = "Estancia III mod";
		c1.conta = 3825;
		c1.imprimirDados();
		n1.exibirDados();
		
		System.out.println("========================\n");
		System.out.println("========================");
		
		c2.nome = "Lula";
		c2.codigo = 13;
		c2.endereço = "Estancia I mod";
		c2.conta = 11111;
		c2.imprimirDados();
		n2.exibirDados();
		System.out.println("========================\n");
	}

}
