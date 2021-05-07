package aula15;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cont=0;
		int [][]matriz = new int [3][3];
		
		 Scanner ler = new Scanner (System.in);
		 System.out.println("Matriz M[3][3]\n");
		  
		for(int l=0;l<3;l++)
		{
			for(int c=0;c<3;c++)
			{
				System.out.println("entre com um numero: ");
				matriz[l][c] = ler.nextInt();
				
				if (matriz[l][c]>10)
				{
					cont++;
				}
			}
		}
            System.out.println("Os numeros maiores que dez são: " + cont++);
		   
			
	}

}
