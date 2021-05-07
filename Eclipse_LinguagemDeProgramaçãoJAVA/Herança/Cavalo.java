package Herança;

public class Cavalo extends Animal{
	
	private String Relinchar;
	private String Cavalgar;
	
	public Cavalo (String Nome, String Idade)
	{
        super (Nome, Idade);
	}
	
	public Cavalo (String Nome, String Idade, String Relinchar, String Cavalgar)
	{
		super (Nome, Idade);
		this.Relinchar = Relinchar;
		this.Cavalgar = Cavalgar;
	}

	public String getRelinchar() {
		return Relinchar;
	}

	public void setRelinchar(String relinchar) {
		Relinchar = relinchar;
	}

	public String getCavalgar() {
		return Cavalgar;
	}

	public void setCavalgar(String cavalgar) {
		Cavalgar = cavalgar;
	}

}
