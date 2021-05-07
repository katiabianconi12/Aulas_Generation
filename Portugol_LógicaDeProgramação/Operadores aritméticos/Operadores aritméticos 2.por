programa
{
	inclua biblioteca Matematica -->mat
	funcao inicio()
	{
		inteiro anos, meses, dias, total
		
		escreva("coloque os dias: ")
		leia(total)

		anos = total / 365
		meses = (total % 365) / 30
		dias = (total % 365) % 30

		 escreva("\nEu tenho: ", anos, "anos e", meses, "meses e", dias, "dias de vida")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 321; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */