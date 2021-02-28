package ailton;

import ailton.entidades.EspacoParaCafe;
import ailton.entidades.Pessoa;
import ailton.entidades.Sala;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static Pessoa[] pessoa = new Pessoa[100];
	static Sala[] sala = new Sala[50];
	static EspacoParaCafe[] espacoParaCafe = new EspacoParaCafe[2];

	public static void main(String[] args) {
		mostraMenuPrincipal();
	}

	public static void mostraMenuPrincipal() {
		System.out.println("");
		System.out.println("MENU PRINCIPAL");
		System.out.println("1 - Cadastro");
		System.out.println("2 - Consulta");
		System.out.println("3 - Sair");

		System.out.print("Escolha uma das opções acima: ");
		int opcao = sc.nextInt();

		switch (opcao) {
			case 1:
				mostraMenuDeCadastro();
				break;
			case 2:
				mostraMenuDeConsulta();
				break;
			case 3:
				// TODO
				break;
			default:
				System.out.println("Entrada inválida. Selecione 1, 2 ou 3.");
				break;
		}

		mostraMenuPrincipal();
	}

	public static void mostraMenuDeCadastro() {
		System.out.println("");
		System.out.println("MENU DE CADASTRO");
		System.out.println("1 - Cadastro de pessoas");
		System.out.println("2 - Cadastro de salas ");
		System.out.println("3 - Cadastro de espaço para café ");
		System.out.println("4 - Menu principal ");
		System.out.println("5 - Sair");

		System.out.print("Escolha uma das opções acima: ");
		int opcao = sc.nextInt();

		switch (opcao) {
			case 1:
				mostraMenuDeCadastroDePessoas();
				break;
			case 2:
				mostraMenuDeCadastroDeSalas();
				break;
			case 3:
				mostraMenuDeCadastroDeEspacosParaCafe();
				break;
			case 4:
				mostraMenuPrincipal();
				break;
			case 5:
				// TODO
				break;
			default:
				System.out.println("Entrada inválida. Selecione um número entre 1 e 6.");
				break;
		}
	}

	public static void mostraMenuDeCadastroDePessoas() {
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		int opcaoPessoa = 1;

		for (int i = 0; opcaoPessoa != 0; i++) {
			System.out.println("");
			System.out.println("MENU DE CADASTRO DE PESSOAS");

			System.out.print("Informe o nome da pessoa: ");
			String nome = sc2.nextLine();

			System.out.print("Informe o sobrenome da pessoa: ");
			String sobrenome = sc3.nextLine();

			pessoa[i] = new Pessoa(nome, sobrenome);

			System.out.println("ID da pessoa: " + i);

			System.out.println("Sair? Digite 0.");
			opcaoPessoa = sc.nextInt();
		}

		mostraMenuPrincipal();
	}

	private static void mostraMenuDeCadastroDeSalas() {
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		int opcaoSala = 1;

		for (int i = 0; opcaoSala != 0; i++) {
			System.out.println("");
			System.out.println("MENU DE CADASTRO DE SALAS");

			System.out.print("Informe o nome da sala: ");
			String nome = sc2.nextLine();

			System.out.print("Informe a lotação máxima da sala: ");
			int lotacao = sc3.nextInt();

			sala[i] = new Sala(nome, lotacao);

			System.out.println("ID da sala: " + i);

			System.out.println("Sair? Digite 0.");
			opcaoSala = sc.nextInt();
		}

		mostraMenuPrincipal();
	}

	private static void mostraMenuDeCadastroDeEspacosParaCafe() {
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		int opcaoEspaco = 1;

		for (int i = 0; opcaoEspaco != 0; i++) {
			System.out.println("");
			System.out.println("MENU DE CADASTRO DE ESPAÇOS");

				System.out.print("Informe o nome do espaço: ");
				String nome = sc2.nextLine();

				System.out.print("Informe a lotação máxima do espaço: ");
				int lotacao = sc3.nextInt();

				sala[i] = new Sala(nome, lotacao);

				System.out.println("ID do espaço: " + i);

				System.out.println("Sair? Digite 0.");
				opcaoEspaco = sc.nextInt();
		}

		mostraMenuPrincipal();
	}

	public static void mostraMenuDeConsulta() {
		System.out.println("");
		System.out.println("MENU DE CONSULTA");
		System.out.println("1 - Consulta de pessoas");
		System.out.println("2 - Consulta de salas ");
		System.out.println("3 - Consulta de espaço para café ");
		System.out.println("4 - Menu principal ");
		System.out.println("5 - Sair");

		System.out.print("Escolha uma das opções acima: ");
		int opcao = sc.nextInt();

		switch (opcao) {
			case 1:
				Scanner sc4 = new Scanner(System.in);
				Scanner sc5 = new Scanner(System.in);
				int sair = 1;
				while (sair == 1) {
					System.out.print("Informe o ID da pessoa: ");
					int id = sc5.nextInt();
					System.out.println("");
					System.out.println("Nome: " + pessoa[id].getNome());
					System.out.println("Sobrenome: " + pessoa[id].getSobrenome());
					System.out.println("");
					System.out.println("Sair? Digite 0.");
					sair = sc4.nextInt();
				}
				break;
			case 2:
				Scanner sc6 = new Scanner(System.in);
				Scanner sc7 = new Scanner(System.in);
				int sair2 = 1;
				while (sair2 == 1) {
					System.out.print("Informe o ID da sala: ");
					int id = sc7.nextInt();
					System.out.println("");
					System.out.println("Nome: " + sala[id].getNome());
					System.out.println("Lotacao: " + sala[id].getLotacao());
					System.out.println("");
					System.out.println("Sair? Digite 0.");
					sair2 = sc6.nextInt();
				}
				break;
			case 3:
				Scanner sc8 = new Scanner(System.in);
				Scanner sc9 = new Scanner(System.in);
				int sair3 = 1;
				while (sair3 == 1) {
					System.out.print("Informe o ID do espaço: ");
					int id = sc9.nextInt();
					System.out.println("");
					System.out.println("Nome: " + sala[id].getNome());
					System.out.println("Lotacao: " + sala[id].getLotacao());
					System.out.println("");
					System.out.println("Sair? Digite 0.");
					sair3 = sc8.nextInt();
				}
				break;
			case 4:
				mostraMenuPrincipal();
				break;
			case 5:
				//TODO
				break;
			default:
				System.out.println("Entrada inválida. Selecione um número entre 1 e 6.");
				break;
		}

		mostraMenuPrincipal();
	}
}
