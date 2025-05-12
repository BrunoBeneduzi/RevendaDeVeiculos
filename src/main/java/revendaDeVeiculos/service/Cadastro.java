package revendaDeVeiculos.service;

import java.util.InputMismatchException;
import java.util.Scanner;
import revendaDeVeiculos.model.Caminhao;
import revendaDeVeiculos.model.Carro;
import revendaDeVeiculos.model.Moto;
import revendaDeVeiculos.repository.ListaDeVeiculos;

public class Cadastro {
	private Scanner sc = new Scanner(System.in);
	private ListaDeVeiculos listaDeVeiculos = new ListaDeVeiculos();
	private VerificaData verificaData = new VerificaData();
	private VerificaPreco verificaPreco = new VerificaPreco();
	int escolha = 0;
	
	public void cadastrarVeiculo() {
		this.linha();
		
		try {
			System.out.print("Digite o que deseja cadastrar"+"\n1- Carro"+"\n2- Moto"+"\n3- Caminhao"+"\n-> ");
			escolha = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Digite um numero valido, retornando para o Menu principal");
			
		}
		sc.nextLine();
		
		switch(escolha) {
		case 1:
			this.linha();
			this.listaDeVeiculos.cadastraUmVeiculo(new Carro(this.cadastraMarca(), this.cadastraModelo(), this.verificaData.cadastraAno(), this.verificaPreco.cadastraPrecoDeVenda()));
			System.out.println("\n-------------------------- CARRO CADASTRADO --------------------------");
			break;
		case 2:
			this.linha();
			this.listaDeVeiculos.cadastraUmVeiculo(new Moto(this.cadastraMarca(), this.cadastraModelo(), this.verificaData.cadastraAno(), this.verificaPreco.cadastraPrecoDeVenda()));
			System.out.println("\n-------------------------- MOTO CADASTRADO --------------------------");
			break;
		case 3:
			this.linha();
			this.listaDeVeiculos.cadastraUmVeiculo(new Caminhao(this.cadastraMarca(), this.cadastraModelo(), this.verificaData.cadastraAno(), this.verificaPreco.cadastraPrecoDeVenda()));
			System.out.println("\n-------------------------- CAMINHAO CADASTRADO --------------------------");
			break;
		default:
			System.out.println("Numero invalido");
		}
		this.linha();
	}
	
	private String cadastraMarca() {
		System.out.print("Digite a marca do Veiculo -> ");
		String marca = sc.nextLine();
		
		return marca;
	}
	
	private String cadastraModelo() {
		System.out.print("Digite o modelo do Veiculo -> ");
		String modelo = sc.nextLine();
		
		return modelo;
	}
	

	public void linha() {
		System.out.println("---------------------------------------------------------------");
	}
}