package aula15;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int somapar=0, contimp=0; 

		int [] numeros = new int [6];
		
		Scanner ler = new Scanner (System.in);
		
		for(int i=0;i<6;i++)
		{			
				System.out.println("\nEntre com um numero: ");
				numeros[i] = ler.nextInt();	
				
				if(numeros[i]%2==0)
				{
					somapar = somapar + numeros[i];
				}
				else
				{
					contimp++;
				}		
		}
		
		for(int i=0;i<6;i++)
		{
			if(numeros[i]%2==0)
			{
				System.out.println("Numeros pares: " + numeros[i]);
			}
			else
			{
				System.out.println("Numeros impares: " + numeros[i]);
			}
		}
		System.out.println("\nSoma dos números pares: " + somapar);
		System.out.println("\nQuantidade de números impares: " + contimp);
	}

}
