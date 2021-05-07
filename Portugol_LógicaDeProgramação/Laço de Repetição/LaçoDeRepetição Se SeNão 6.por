programa
{
	
	funcao inicio()
	{
	inteiro idade
	
		escreva("Entre com a sua idade: ")
		leia(idade)
		
		se (idade >=5 e idade <=7)
		{
			escreva ("Grupo infantil A: Infantil") 
		}
		senao se (idade >=8 e idade <=11)
		{
			escreva ("Grupo infantil B: Infantil") 
		}
		senao se (idade >=12 e idade <=13)
		{
			escreva("Grupo juvenil A: Juvenil")
		}
		senao se (idade >=14 e idade <=17)
		{
			escreva("Grupo juveanil B: Juvenil")
		}
		senao se (idade>=18)
		{
			escreva("Grupo adulto: Adulto")
		}
		senao 
		{
			escreva("O nadador não tem idade suficiente")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 565; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */