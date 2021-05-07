package Herança;

public class testeAnimal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Cachorro1 Cachorro = new Cachorro1();
		Cachorro.setNome("Cachorro \nRex,");
		Cachorro.setIdade(" tem 2 anos.");
		Cachorro.setLatir(" Ele late");
		Cachorro.setCorrer(" e pula.");
		Cachorro.Locomover();
		
		
		Cavalo1 Cavalo = new Cavalo1();
		Cavalo.setNome("\nCavalo \nGaranhão,");
		Cavalo.setIdade(" tem 5 anos.");
		Cavalo.setEmitirSom(" Relincha");
		Cavalo.setCavalgar(" e cavalga.");
		
		BichoPreguiça1 Preguiça = new BichoPreguiça1();
		Preguiça.setNome("\nPreguiça \nFofa,");
		Preguiça.setIdade(" tem 20 anos.");
		Preguiça.setDorme(" Ela dorme");
		Preguiça.setSobeEmArvores(" e sobe em arvores.");
	
		System.out.println(Cachorro.getNome() +Cachorro.getIdade() +Cachorro.getLatir() +Cachorro.getCorrer());
	    System.out.println(Cavalo.getNome() +Cavalo.getIdade() +Cavalo.getEmitirSom() +Cavalo.getCavalgar());
	    System.out.println(Preguiça.getNome() +Preguiça.getIdade() +Preguiça.getDorme() +Preguiça.getSobeEmArvores());
	     
		
	}

}
