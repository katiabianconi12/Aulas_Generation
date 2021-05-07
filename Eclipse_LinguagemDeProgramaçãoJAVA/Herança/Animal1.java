package Herança;

public abstract class Animal1 {

	private String Nome;
	private String Idade;
	private String Correr;
	private String EmitirSom;
	
	public Animal1 ()
	{
		
	}
	
	public abstract String Locomover ();
	
	public Animal1 (String Nome, String Idade, String Correr, String EmitirSom)
	{
		this.Nome = Nome;
		this.Idade = Idade;
		this.Correr = Correr;
		this.EmitirSom = EmitirSom;
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

	public String getCorrer() {
		return Correr;
	}

	public void setCorrer(String correr) {
		Correr = correr;
	}

	public String getEmitirSom() {
		return EmitirSom;
	}

	public void setEmitirSom(String emitirSom) {
		EmitirSom = emitirSom;
	}
	
	
	
	
}
