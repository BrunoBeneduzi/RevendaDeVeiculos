package revendaDeVeiculos.repository;

import java.util.ArrayList;
import java.util.List;

import revendaDeVeiculos.model.Veiculos;

public class ListaDeVeiculos {
	private static List<Veiculos> veiculos = new ArrayList<>();

	
	public List<Veiculos> getVeiculos() {
		return veiculos;
	}

	public void cadastraUmVeiculo(Veiculos veiculo) {
		veiculos.add(veiculo);
	}
	
	@Override
	public String toString() {
		return "ListaDeVeiculos [veiculos=" + veiculos + "]";
	}
}