package Herança;

public class Cachorro1 extends Animal1{
	
	private String Latir;
	
	
	public Cachorro1 ()
	{
	
	}
	
	@Override
	public String Locomover ()
	{
		System.out.println("Correndo"); 
		return "correndo";
	}

	public Cachorro1 (String Nome, String Idade, String Correr, String Latir, String EmitirSom)
	{
		super(Nome, Idade, Correr, EmitirSom);
		this.Latir = Latir;
	}


	public String getLatir() {
		return Latir;
	}


	public void setLatir(String latir) {
		Latir = latir;
	}


}
