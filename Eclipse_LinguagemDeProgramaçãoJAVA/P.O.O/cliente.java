package POO;

public class cliente {
	private String nome;
	private String cpf;
	private String endere�o;
	
	public cliente (String nome,String cpf,String endere�o)
	{
		this.nome = nome;
		this.cpf = cpf;
		this.endere�o = endere�o;
	}
	public String getDadosCompleto()
	{
		String DadosCompleto =  nome+" "+cpf+" "+endere�o;
		return DadosCompleto;
	}
}
