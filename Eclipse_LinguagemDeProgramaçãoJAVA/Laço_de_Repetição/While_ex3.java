package exercicos;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int idade,tp21=0,tp50=0;

Scanner ler = new Scanner (System.in);

System.out.println("\nEntre com uma idade: ");
idade = ler.nextInt();

    while (idade!=-99)
{
	if(idade <21)
	{
	tp21++;
	}
	if(idade >50)
	{
	tp50++;
	}
	
		System.out.println("\nEntre com idade: ");
		idade = ler.nextInt();
    
}
    System.out.println("\nTotal de pessoas com mais de 21 anos: "+ tp21);
	System.out.println("\nTotal de pessoas com mais de 50 anos: "+ tp50);

	}

}
