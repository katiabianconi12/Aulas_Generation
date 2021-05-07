programa
{
	inclua biblioteca Matematica -->mat
	funcao inicio()
	{
		inteiro anos, meses, dias, total
		cadeia nome

		escreva("entre com o seus nome: ")
		leia(nome)
		escreva("coloque os anos: ")
		leia(anos)
		escreva("meses: ")
		leia(meses)
		escreva("dias: ")
		leia(dias)
		
		total = anos*365 + meses*30 + dias 
		escreva("resultado: ", total)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 116; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */