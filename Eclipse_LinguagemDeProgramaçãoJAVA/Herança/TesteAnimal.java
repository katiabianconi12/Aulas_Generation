package Herança;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Cachorro animal1 = new Cachorro ("Cachorro \nNome: Rex", "\nIdade: 3 anos", "\nEle Late", " e Pula");
	Cavalo animal2 = new Cavalo ("\nCavalo \nNome: Garanhão", "\nIdade: 20 anos", "\nEle Relincha", " e Cavalga");
	BichoPreguiça animal3 = new BichoPreguiça ("\nBicho Preguiça \nNome: Fofa", "\nIdade: 5 anos", "\nEla Dorme", " e Sobe em arvores");
	
    System.out.println(animal1.getNome() +animal1.getIdade() +animal1.getLatir() +animal1.getPular());
    System.out.println(animal2.getNome() +animal2.getIdade() +animal2.getRelinchar() +animal2.getCavalgar());
    System.out.println(animal3.getNome() +animal3.getIdade() +animal3.getDorme() +animal3.getSubirEmArvores());
     
	}

}
