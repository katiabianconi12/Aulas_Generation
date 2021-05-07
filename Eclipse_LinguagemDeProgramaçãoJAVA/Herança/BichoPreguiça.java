package Heran�a;

public class BichoPregui�a extends Animal{
	
	private String Dorme;
	private String SubirEmArvores;
	
	public BichoPregui�a (String Nome, String Idade)
	{
        super (Nome, Idade);
	}
	
	public BichoPregui�a (String Nome, String Idade, String Dorme, String SubirEmArvores)
	{
		super (Nome, Idade);
		this.Dorme = Dorme;
		this.SubirEmArvores = SubirEmArvores;
	}

	public String getDorme() {
		return Dorme;
	}

	public void setDorme(String Dorme) {
		this.Dorme = Dorme;
	}

	public String getSubirEmArvores() {
		return SubirEmArvores;
	}

	public void setSubirEmArvores(String subirEmArvores) {
		SubirEmArvores = subirEmArvores;
	}
	

}
