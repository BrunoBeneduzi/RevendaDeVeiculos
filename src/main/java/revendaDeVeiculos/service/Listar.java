package revendaDeVeiculos.service;


import revendaDeVeiculos.model.Veiculos;
import revendaDeVeiculos.repository.ListaDeVeiculos;

public class Listar {
	private ListaDeVeiculos listaDeVeiculos = new ListaDeVeiculos();
	
	public void exibirTodosOsVeiculos() {
		
		if(this.listaDeVeiculos.getVeiculos().isEmpty()) {
		
			for(Veiculos veiculo : this.listaDeVeiculos.getVeiculos()) {
				System.out.println(veiculo);
			}
			System.out.println("---------------------------------------------------------------");
		}else
			System.out.println("Lista vazia");
	}
	
}