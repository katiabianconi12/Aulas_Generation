package Heran�a;

public class BichoPregui�a1 extends Animal1 {
	
	private String Dorme;
	private String SobeEmArvores;
	
	public BichoPregui�a1 ()
	{
		
	}
	
	@Override
	public String Locomover ()
	{
		return "Correndo";
	}

	
	public BichoPregui�a1 (String Nome, String Idade, String Correr, String Dorme, String SobeEmArvores, String EmitirSom)
	{
		super (Nome, Idade, Correr, EmitirSom);
		this.Dorme = Dorme;
		this.SobeEmArvores = SobeEmArvores;	
	}

	public String getDorme() {
		return Dorme;
	}

	public void setDorme(String dorme) {
		Dorme = dorme;
	}

	public String getSobeEmArvores() {
		return SobeEmArvores;
	}

	public void setSobeEmArvores(String sobeEmArvores) {
		SobeEmArvores = sobeEmArvores;
	}

	
	
}
