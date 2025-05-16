package revendaDeVeiculos.service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VerificaData {
	private Scanner sc = new Scanner(System.in);
	
	protected int cadastraAno() {
		int ano = 0; 
		System.out.print("Digite o ano do Veiculo -> ");
		
		try {
			ano = sc.nextInt();
			sc.nextLine();
		}catch(InputMismatchException e) {
			sc.nextLine();
			System.out.println("------------------- Numero invalido, foi adicionado o ano de 2025 por ser o ano mais recente ------------------- ");
			return 2025;
		}
			
		
			if(ano >= 1885 && ano <= 2025) {
				return ano;
			}else {
				System.out.println("----------------DATA INVALIDA ---------------- Foi adiconado a data de 2025 por ser a mais atual ---------------- ");
				return 2025;
			}
	}
	
}