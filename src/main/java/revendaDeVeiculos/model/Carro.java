package revendaDeVeiculos.model;

import java.math.BigDecimal;

public class Carro extends Veiculos{
	
	public Carro() {}
	
	public Carro(String marca, String modelo, int ano, BigDecimal preco) {
		super(marca, modelo, "CARRO" ,ano, preco);
		
	}
}