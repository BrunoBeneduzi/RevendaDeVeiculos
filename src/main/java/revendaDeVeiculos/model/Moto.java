package revendaDeVeiculos.model;

import java.math.BigDecimal;

public class Moto extends Veiculos{

	
	public Moto() {
		
	}
	
	public Moto(String marca, String modelo, int ano, BigDecimal preco) {
		super(marca, modelo,"MOTO" ,ano, preco);
		
	}
	

	
	
}