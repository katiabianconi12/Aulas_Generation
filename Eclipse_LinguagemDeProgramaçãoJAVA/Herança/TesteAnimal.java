package Heran�a;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Cachorro animal1 = new Cachorro ("Cachorro \nNome: Rex", "\nIdade: 3 anos", "\nEle Late", " e Pula");
	Cavalo animal2 = new Cavalo ("\nCavalo \nNome: Garanh�o", "\nIdade: 20 anos", "\nEle Relincha", " e Cavalga");
	BichoPregui�a animal3 = new BichoPregui�a ("\nBicho Pregui�a \nNome: Fofa", "\nIdade: 5 anos", "\nEla Dorme", " e Sobe em arvores");
	
    System.out.println(animal1.getNome() +animal1.getIdade() +animal1.getLatir() +animal1.getPular());
    System.out.println(animal2.getNome() +animal2.getIdade() +animal2.getRelinchar() +animal2.getCavalgar());
    System.out.println(animal3.getNome() +animal3.getIdade() +animal3.getDorme() +animal3.getSubirEmArvores());
     
	}

}
