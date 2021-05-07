package POO;

public class cliente {
	private String nome;
	private String cpf;
	private String endereço;
	
	public cliente (String nome,String cpf,String endereço)
	{
		this.nome = nome;
		this.cpf = cpf;
		this.endereço = endereço;
	}
	public String getDadosCompleto()
	{
		String DadosCompleto =  nome+" "+cpf+" "+endereço;
		return DadosCompleto;
	}
}
