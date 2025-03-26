package PraticaHeranca;

public class Telefonista extends Funcionario {
	  private int codigoEstacao;
	  public Telefonista(String nome, double salario, int codigoEstacao) {
	        super(nome, salario);
	        this.codigoEstacao = codigoEstacao;
	    }

	    public int getCodigoEstacao() {
	        return codigoEstacao;
	    }

	    public void setCodigoEstacao(int codigoEstacao) {
	        this.codigoEstacao = codigoEstacao;
	    }

}
