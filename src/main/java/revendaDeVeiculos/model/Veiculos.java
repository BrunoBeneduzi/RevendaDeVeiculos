package revendaDeVeiculos.model;

import java.math.BigDecimal;

public class Veiculos {
	
	private String marca;
	private String modelo;
	private int ano;
	private BigDecimal preco;
	private String tipoDeVeiculo;
	
	public Veiculos() {
		
	}
	
	public Veiculos(String marca, String modelo,String tipoDeVeiculo ,int ano, BigDecimal preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.preco = preco;
		this.tipoDeVeiculo = tipoDeVeiculo;
	}

	public String getMarca() {return marca;}
	
	public void setMarca(String marca) {this.marca = marca;}
	
	public String getModelo() {return modelo;}
	
	public void setModelo(String modelo) {this.modelo = modelo;}
	
	public int getAno() {return ano;}
	
	public void setAno(int ano) {this.ano = ano;}
	
	public BigDecimal getPreco() {return preco;}
	
	public void setPreco(BigDecimal preco) {this.preco = preco;}
	
	public String getTipoDeVeiculo() {return tipoDeVeiculo;}
	
	
	@Override
	public String toString() {
		return "Veiculo marca = " + marca + ", modelo = " + modelo + ", ano = " + ano + ", preco = " + preco+ "R$, tipoDeVeiculo = " + tipoDeVeiculo;
	}
}