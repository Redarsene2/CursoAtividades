package PraticaHeranca;

public class TesteFuncionario {
	public static void main(String[] args) {
        // Criando um objeto da classe Gerente
        Gerente gerente = new Gerente("Carlos", 5000.0, "carlos123", "senha123");
        System.out.println("Gerente: " + gerente.getNome());
        System.out.println("Salário: " + gerente.getSalario());
        System.out.println("Login: " + gerente.getLogin());

        // Criando um objeto da classe Telefonista
        Telefonista telefonista = new Telefonista("Ana", 2000.0, 101);
        System.out.println("\nTelefonista: " + telefonista.getNome());
        System.out.println("Salário: " + telefonista.getSalario());
        System.out.println("Código da Estação: " + telefonista.getCodigoEstacao());

        // Criando um objeto da classe Secretaria
        Secretaria secretaria = new Secretaria("Maria", 2500.0, 202);
        System.out.println("\nSecretaria: " + secretaria.getNome());
        System.out.println("Salário: " + secretaria.getSalario());
        System.out.println("Número do Ramal: " + secretaria.getNumeroRamal());
    }

}
