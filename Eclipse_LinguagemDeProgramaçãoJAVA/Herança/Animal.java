package Herança;

public class Animal {
	private String Nome;
	private String Idade;

	public Animal (String Nome, String Idade)
	{
		this.Nome = Nome;
		this.Idade = Idade;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getIdade() {
		return Idade;
	}

	public void setIdade(String idade) {
		Idade = idade;
	}

	
}
