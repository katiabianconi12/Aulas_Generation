programa
{
    
     
	funcao inicio()
	{
	inteiro n1, n2, n3, n4, qn1, qn2, qn3, qn4
	
	escreva("entre com o numero 1: ")
	leia(n1)
	escreva("entre com o numero 2: ")
	leia(n2)
	escreva("entre com o numero 3: ")
	leia(n3)
	escreva("entre com o numero 4: ")
	leia(n4)
	qn1 = (n1*n1)
	qn2 = (n2*n2)
	qn3 = (n3*n3)
	qn4 = (n4*n4)

	se (qn3>=1000)
	{
		escreva("\nO quadrado do n3: ", qn3)
	}
	senao
	escreva("\nO quadrado do n1: ", qn1, "\nO quadrado do n2: ", qn2, "\nO quadrado do n3: ", qn3, "\nO quadrado do n4: ", qn4)
	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 523; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */