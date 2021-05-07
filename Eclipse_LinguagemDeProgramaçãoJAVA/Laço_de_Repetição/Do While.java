package exercicos;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,somamult3=0,contmult3=0;
		float mediamult3;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com um número: ");
		n = leia.nextInt();
		
		do
		{
			if(n%3==0)
			{
				somamult3 = somamult3+ n;
				contmult3++;
			}
			System.out.println("\nEntre com um número: ");
			n = leia.nextInt();
			
		}while(n!=0);
		
		mediamult3 = somamult3 / contmult3;
		System.out.println("\nA média dos números multiplos de 3 foi de: "+mediamult3);
	}

}
