package revendaDeVeiculos.service;

import revendaDeVeiculos.model.Veiculos;
import revendaDeVeiculos.repository.ListaDeVeiculos;

public class Excluir {
	private ListaDeVeiculos listaDeVeiculos = new ListaDeVeiculos();
	private ExibeVeiculosOrdenados exivExibeVeiculosOrdenados = new ExibeVeiculosOrdenados();
	
	
	public void excluirVeiculo() {
	
		Veiculos excluirVeiculo = this.exivExibeVeiculosOrdenados.exibirPosicaoDosVeiculos();
		
		if(excluirVeiculo != null) {
			this.listaDeVeiculos.getVeiculos().remove(excluirVeiculo);
			System.out.println("-------------------Veiculo Excluido com sucesso-------------------");
		}
		
	}
	
}