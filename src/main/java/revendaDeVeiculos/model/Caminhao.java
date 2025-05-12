package revendaDeVeiculos.model;

import java.math.BigDecimal;

public class Caminhao extends Veiculos{
		
	public Caminhao() {
		
	}
	
	public Caminhao(String marca, String modelo, int ano, BigDecimal preco) {
		super(marca, modelo,"CAMINHAO" ,ano, preco);
		
	}
}