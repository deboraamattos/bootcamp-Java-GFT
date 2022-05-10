
public class ClientePessoaFisica extends Cliente {

	private String cpf;
	private String rg;
	private String porfissao;
	
	
	public ClientePessoaFisica() {
		super();
	}


	public ClientePessoaFisica(String cpf, String rg, String porfissao) {
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.porfissao = porfissao;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getPorfissao() {
		return porfissao;
	}


	public void setPorfissao(String porfissao) {
		this.porfissao = porfissao;
	}
	
	
	
}
