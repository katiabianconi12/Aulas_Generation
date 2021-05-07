package POO;

public class DadosCliente {

	public static void main (String args[])
	{
		cliente cliente1 = new cliente ("\nnome: Katia", "\ncpf: 000.000.000-20", "\nEndereço: Rua Generation n20");
		System.out.println(cliente1.getDadosCompleto());
		
	}
}
