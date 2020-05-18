package pp.atividade01.p2;

public class ConvParaAlgarismosRomanos {

	private int[] num = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	private String[] rom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	private int numero;
		
	public ConvParaAlgarismosRomanos(int numero) {
		this.numero = numero;
	}
	
	public void converteParaRomano() {
		
		int index = 0;
		while(numero > 0 ) {
			if (numero >= num[index]) {
				System.out.print(rom[index]);
				numero -= num[index];
			} else {
				index++;
			}
		}
	}

}
