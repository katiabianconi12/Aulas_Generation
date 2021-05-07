package pacoteJava;

import java.util.Scanner;

public class lacoCondicional {

	public static void main(String[] args) {
	
		int idade;
		String nome;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Entre com o seu nome");
		nome = ler.nextLine();
		ler.nextLine(); //para limpar o banfer de memorias
		System.out.println("Entre com a sua idade");
		idade = ler.nextInt();
		
		if (idade>=18)
		{
			System.out.printf("Você é maior de idade");
		}
		
		else if (idade>=1 && idade<=18)
		{
			System.out.printf("Você é menor de idade");
		}
		
		else
		{
			System.out.printf("Digite uma idade valida");
		}
	}

}
