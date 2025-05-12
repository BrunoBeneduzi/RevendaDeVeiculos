package revendaDeVeiculos.service;

import java.math.BigDecimal;
import java.util.Scanner;

public class VerificaPreco {
	private Scanner sc = new Scanner(System.in);
	
	protected BigDecimal cadastraPrecoDeVenda() {
		BigDecimal numeroBigDecimal = BigDecimal.ZERO;
		
		System.out.print("Digite o preço do Veiculo -> ");
		String stringPreco =  sc.nextLine();
		
		numeroBigDecimal = new BigDecimal(stringPreco.replace(",", "."));
		
		
		return numeroBigDecimal;
	}
}
