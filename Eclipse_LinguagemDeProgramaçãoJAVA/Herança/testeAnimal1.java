package Heran�a;

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
		Cavalo.setNome("\nCavalo \nGaranh�o,");
		Cavalo.setIdade(" tem 5 anos.");
		Cavalo.setEmitirSom(" Relincha");
		Cavalo.setCavalgar(" e cavalga.");
		
		BichoPregui�a1 Pregui�a = new BichoPregui�a1();
		Pregui�a.setNome("\nPregui�a \nFofa,");
		Pregui�a.setIdade(" tem 20 anos.");
		Pregui�a.setDorme(" Ela dorme");
		Pregui�a.setSobeEmArvores(" e sobe em arvores.");
	
		System.out.println(Cachorro.getNome() +Cachorro.getIdade() +Cachorro.getLatir() +Cachorro.getCorrer());
	    System.out.println(Cavalo.getNome() +Cavalo.getIdade() +Cavalo.getEmitirSom() +Cavalo.getCavalgar());
	    System.out.println(Pregui�a.getNome() +Pregui�a.getIdade() +Pregui�a.getDorme() +Pregui�a.getSobeEmArvores());
	     
		
	}

}
