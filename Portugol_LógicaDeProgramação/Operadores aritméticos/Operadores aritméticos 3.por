programa
{
	inclua biblioteca Matematica -->mat
	funcao inicio()
	{
		inteiro horas, min, seg, ts
		
		escreva("entre com total de segundos: ")
		leia(ts)

		horas = ts / 3600
		min = (ts % 3600) / 60
		seg = (ts % 3600) % 60

		escreva("\no evento tem: " , horas, " horas " , min, " minutos ", seg, " segundos ", "") 
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 326; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */