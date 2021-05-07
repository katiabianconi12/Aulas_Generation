package Herança;

public class Cavalo1 extends Animal1 {

	private String Cavalgar;
	 
	public Cavalo1 ()
	{
		
	}
	
	@Override
	public String Locomover ()
	{
		return "Correndo";
	}

	public Cavalo1 (String Nome, String Idade, String Correr, String Cavalgar, String EmitirSom)
	{
		super (Nome, Idade, Correr, EmitirSom);
		this.Cavalgar = Cavalgar;	
	}

	public String getCavalgar() {
		return Cavalgar;
	}

	public void setCavalgar(String cavalgar) {
		Cavalgar = cavalgar;
	}
	
	
}
