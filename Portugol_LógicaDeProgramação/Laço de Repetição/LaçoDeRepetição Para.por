programa
{
	
	funcao inicio()
	{
	inteiro x, nf, somafilhos=0, cont100=0
	real ms, mf, salario, somasalario=0.0, maiorsalario=0.0, porcentagem
	
	para(x=1;x<=5;x++)// x = x+1
	{
		limpa()
		escreva("entre com salario: ") 
		leia(salario)
		escreva("entre com numero de filhos: ") 
		leia(nf)

		somasalario = somasalario + salario
		somafilhos = somafilhos + nf
		
		se(maiorsalario<salario)
		{
			maiorsalario = salario
		}
		se(salario<=100)
	{
		cont100++
	}
	}

	     ms = somasalario/5
	     mf = somafilhos/5
	     porcentagem = (cont100*100)/5
	     escreva("valor da media salarial: ", ms) 
	     escreva("valor da media de numero de filhos: ", mf)
	     escreva("valor do maior salario: ", maiorsalario)
	     escreva("valor da porcentagem de salario até 100 reais: ", porcentagem)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 572; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */