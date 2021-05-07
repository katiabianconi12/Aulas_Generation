programa
{
	
	funcao inicio() 
	
	{
		real pstomate, excesso, multa
		
		escreva("entre com o peso do tomate")
		leia(pstomate)

		
		se (pstomate >50)

		{
			excesso = pstomate - 50
			multa = excesso*4
			escreva ("Houve multa")
		}
		senao 
		{
			excesso = 0
			multa = 0
		}
		escreva("\nO excesso foi de: ", excesso, " E a multa sera de: ", multa)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 364; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */