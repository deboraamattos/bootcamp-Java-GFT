
public class Main {

	public static void main(String[] args) {
		Cliente maria = new ClientePessoaFisica();
		maria.setNome("Maria");
		
		
		Cliente empresaJava = new ClientePessoaJuridica();
		empresaJava.setNome("Empresa Java Ltda");
		
		
		Conta corrente = new ContaCorrente(maria);
		Conta poupanca = new ContaPoupanca(empresaJava);
				
		corrente.depositar(100);
		corrente.imprimirExtrato();

		
		corrente.transferir(50, poupanca);
		poupanca.imprimirExtrato();
		
	}

}
