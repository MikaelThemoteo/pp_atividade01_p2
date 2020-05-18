package pp.atividade01.p2;

import java.util.Scanner;

public class Testes {

	public static void main(String[] args) throws Throwable {
	
		Scanner entrada = new Scanner(System.in);
		
		int numero = entrada.nextInt();
		
		if (numero == 0) {
			throw new Exception(numero + " Entrada inválida, número deve ser diferente de zero");
		}else {	
			ConvParaAlgarismosRomanos conversor = new ConvParaAlgarismosRomanos(numero);
			conversor.converteParaRomano();
		}
		
	}
}
