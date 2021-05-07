package Herança;

public class Cachorro extends Animal{
	
	private String Latir;
	private String Pular;
	
	public Cachorro (String Nome, String Idade)
	{
        super (Nome, Idade);
	}
	
	public Cachorro (String Nome, String Idade, String Latir, String Pular)
	{
		super (Nome, Idade);
		this.Latir = Latir;
		this.Pular = Pular;
	}

	public String getLatir() {
		return Latir;
	}

	public void setLatir(String latir) {
		Latir = latir;
	}

	public String getPular() {
		return Pular;
	}

	public void setPular(String pular) {
		Pular = pular;
	}
	
	
	
	}
	
	