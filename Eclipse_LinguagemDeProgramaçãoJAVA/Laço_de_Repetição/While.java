package pacoteJava;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
	
		int idade;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Entre com a sua idade: ");
		idade = entrada.nextInt();
		
		while(idade>=1)
		{
			System.out.printf("\nSua idade � de %d anos", idade);
			
			if(idade>=18)
			{
				System.out.printf("\nVoc� � maior de idade ...");
			}
			
			else if (idade<18)
			{
				System.out.printf("\nVoc� � menor de idade...");
			}
			System.out.println("\nEntre com uma nova idade: ");
			idade = entrada.nextInt();
		}
			
			
		}
		
		

	}


