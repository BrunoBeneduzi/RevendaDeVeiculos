package revendaDeVeiculos.service;


import java.util.InputMismatchException;
import java.util.Scanner;
import revendaDeVeiculos.model.Veiculos;

public class Atualizar {
	private Scanner sc = new Scanner(System.in);
	private VerificaData verificaData = new VerificaData();
	private VerificaPreco verificaPreco = new VerificaPreco();
	private ExibeVeiculosOrdenados exibeVeiculosOrdenados = new ExibeVeiculosOrdenados();
	int escolha = 0;
	
	public void atualizar() {
		this.linha();
		try {
			System.out.print("Digite o que deseja atualizar"+"\n1- Marca"+"\n2- Modelo"+"\n3- Ano"+"\n4- Preco"+"\n5- Alterar tudo"+"\n-> ");
			escolha = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Digite um numero valido, retornando para o Menu principal");
			
		}
		
		sc.nextLine();
		
		switch(escolha) {
		case 1:
			this.alterarMarca();
			break;
		case 2:
			this.alterarModelo();
			break;
		case 3:
			this.alterarAno();
			break;
		case 4:
			this.alterarPreco();
			break;
		case 5:
			this.alteraTudo();
			break;
		default:
			System.out.println("--------------- Opção Invalida ---------------- Nenhum Veiculo alterado ---------------- ");
		}
		
	}
	
	private void alteraTudo() {
		this.linha();
		Veiculos atualizarTudo =  this.exibeVeiculosOrdenados.exibirPosicaoDosVeiculos();
		this.linha();
		
		System.out.print("Digite a nova marca -> ");
		atualizarTudo.setMarca(sc.nextLine());
		System.out.println("------------------------------------------ NOVA MARCA CADASTRADA ------------------------------------------");
		
		System.out.print("Digite o novo modelo -> ");
		atualizarTudo.setModelo(sc.nextLine());
		System.out.println("------------------------------------------ NOVO MODELO CADASTRADO' ------------------------------------------");
		
		atualizarTudo.setAno(this.verificaData.cadastraAno());
		System.out.println("------------------------------------------ NOVO ANO CADASTRADO' ------------------------------------------");
		
		atualizarTudo.setPreco(this.verificaPreco.cadastraPrecoDeVenda());
		System.out.println("------------------------------------------ NOVO PREÇO CADASTRADO' ------------------------------------------");
	}
	
	private void alterarMarca() {
		this.linha();
		Veiculos atualizarMarca = this.exibeVeiculosOrdenados.exibirPosicaoDosVeiculos();
		this.linha();
		System.out.print("Digite a nova marca -> ");
		atualizarMarca.setMarca(sc.nextLine());
		
		System.out.println("------------------------------------------ NOVA MARCA CADASTRADA ------------------------------------------");
	}
	
	private void alterarModelo() {
		this.linha();
		Veiculos atualizarModelo = this.exibeVeiculosOrdenados.exibirPosicaoDosVeiculos();
		this.linha();
		System.out.print("Digite o novo modelo -> ");
		atualizarModelo.setModelo(sc.nextLine());
		
		
		System.out.println("------------------------------------------ NOVO MODELO CADASTRADO' ------------------------------------------");
	}
	
	private void alterarAno() {
		this.linha();
		Veiculos atualizaAno = this.exibeVeiculosOrdenados.exibirPosicaoDosVeiculos();
		this.linha();
		atualizaAno.setAno(this.verificaData.cadastraAno());
		
		System.out.println("------------------------------------------ NOVO ANO CADASTRADO' ------------------------------------------");
		
	}
	
	private void alterarPreco() {
		this.linha();
		Veiculos atualizaPreco = this.exibeVeiculosOrdenados.exibirPosicaoDosVeiculos();
		this.linha();
		atualizaPreco.setPreco(this.verificaPreco.cadastraPrecoDeVenda());
		
		System.out.println("------------------------------------------ NOVO PREÇO CADASTRADO' ------------------------------------------");
		
	}
	
	private void linha() {
		System.out.println("-----------------------------------------------------------------------------------------------");
	}
}