package revendaDeVeiculos.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import revendaDeVeiculos.service.Atualizar;
import revendaDeVeiculos.service.Cadastro;
import revendaDeVeiculos.service.Excluir;
import revendaDeVeiculos.service.Listar;

public class RevendaMenu {
	private Scanner sc = new Scanner(System.in);
	int escolha = 0;
	private Cadastro cadastrar = new Cadastro();
	private Listar listar = new Listar();
	private Atualizar atualizar = new Atualizar();
	private Excluir excluirVeiculo = new Excluir();
	
	public void menu() {
		
		do {
			try {
				System.out.print("Digite o que deseja fazer"+"\n1- Adicionar um veiculo"+"\n2- Editar um veiculo"+"\n3- Listar os veiculos"+"\n4- Excluir um veiculo"+"\n5- Encerrar programa"+"\n-> ");
				escolha = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Digite um numero valido");
				
			}
			
			sc.nextLine();
			switch(escolha) {
			case 1:
				this.linha();
				cadastrar.cadastrarVeiculo();
				break;
			case 2:
				atualizar.atualizar();
				break;
			case 3:
				listar.exibirTodosOsVeiculos();
				break;
			case 4:
				excluirVeiculo.excluirVeiculo();
				break;
			case 5:
				break;
			default:
				System.out.println("Numero invalido");
				this.linha();
			}
		}while(escolha != 5);
		System.out.println("Programa encerrado");
	}
	
	public void linha() {
		System.out.println("---------------------------------------------------------------");
	}
	
}