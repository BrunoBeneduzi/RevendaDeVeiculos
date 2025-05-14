package revendaDeVeiculos.service;

import java.math.BigDecimal;
import java.util.Scanner;

public class VerificaPreco {
	private Scanner sc = new Scanner(System.in);
	
	protected BigDecimal cadastraPrecoDeVenda() {
		String stringPreco = null;
		Boolean verifica = true;
		BigDecimal numeroBigDecimal = BigDecimal.ZERO;
		
		
		do {
			try {
				System.out.print("Digite o preço do Veiculo -> ");
				stringPreco =  sc.nextLine();
				numeroBigDecimal = new BigDecimal(stringPreco.replace(",", "."));
				verifica = false;
			}catch(NumberFormatException e) {
				System.out.println("Invalido, Digite um numero novamente");
			}
		}while(verifica);
		
		
		return numeroBigDecimal;
	}
}
