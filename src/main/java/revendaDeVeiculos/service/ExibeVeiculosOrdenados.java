package revendaDeVeiculos.service;

import java.util.Scanner;

import revendaDeVeiculos.model.Veiculos;
import revendaDeVeiculos.repository.ListaDeVeiculos;

public class ExibeVeiculosOrdenados {
	private Scanner sc = new Scanner(System.in);
	private ListaDeVeiculos listaDeVeiculos = new ListaDeVeiculos();
	
	protected Veiculos exibirPosicaoDosVeiculos() {
		if(!this.listaDeVeiculos.getVeiculos().isEmpty()) {
			System.out.println("Selecione o Veiculo");
			
			for(int i = 0; i < listaDeVeiculos.getVeiculos().size(); i++) {
				
				System.out.println((i+1) + " - " + listaDeVeiculos.getVeiculos().get(i));	
			}
			System.out.print("-> ");
			
			Veiculos veiculoParaEdicao = listaDeVeiculos.getVeiculos().get(sc.nextInt()-1);
			sc.nextLine();
			return veiculoParaEdicao;
		}else {
			System.out.println("Lista de veiculos vazia");
			return null;
		}
	}
	
	
}