package pacoteJava;

public class For {

	public static void main(String[] args) {
	int x, soma=0;
	
	for (x=1;x<=10;x++)
	{
		System.out.printf("\n %d", x); //tem que por o %d para imprimir o valor da sama
		soma = soma + x;
	}
        System.out.printf("\nA soma é de: %d", soma);
	}

}
