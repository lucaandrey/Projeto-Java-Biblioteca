package model;

import java.util.Random;
import java.util.Scanner;

public class Biblioteca {
	private String nome;
	private String login;
	private String senha;
	private int saldo;
	private int idade;
	private String genero;
	Scanner input = new Scanner(System.in);
	public Biblioteca(String nome, String login, String senha, int saldo, int idade, String genero) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.saldo = saldo;
		this.idade = idade;
		this.genero = genero;
	}
	Random random = new Random();
	double[] livro = new double[42];
	
	public void gerarPreco() {
		for(int i=0;i<42;i++) {
			livro[i] = random.nextInt(30,60);
			System.out.println(livro[i]);
		}
	}
	
	
	
	public void login() {
		String a,b;
		System.out.println("login: ");
		a = input.nextLine();
		System.out.println("senha: ");
		b = input.nextLine();
		
		if(a.equals(this.login) && b.equals(this.login)) {
		System.out.println("Coloque exibir menu aqui");
		}else {
			System.out.println("Login ou senha incorretos!");
		}
	}
	public void menu() {
		int op =0;
		
		System.out.println("GENEROS: ");
		System.out.println("(1)Romance");
		System.out.println("(2)Ficcao");
		System.out.println("(3)Terror");
		System.out.println("(4)Comedia");
		System.out.println("(5)Auto-Ajuda");
		System.out.println("(6)Aventura");
		System.out.println("(7)Infantil");
		System.out.println("Escolha uma opcao: ");
		op = input.nextInt();
		int a = 0;
		switch(op) {
		
		case 1: System.out.println("Escolha uma opcao: ");
				System.out.println("ROMANCE: ");
				System.out.println("(1)Romeo e Julieta: ");
				System.out.println("(2)O apanhador no campo de Centeio: ");
				System.out.println("(3)A peste: ");
				System.out.println("(4)O Amor nos tempos do colera: ");
				System.out.println("(5)Cidade de papel: ");
				System.out.println("(6)Dom Casmurro: ");
				a=input.nextInt();
		
		if(a == 1) {
			System.out.println("\nO amor apresenta-se à vida de Romeu e Julieta de modo traiçoeiro - "
					+ "\nambos apaixonam-se instantaneamente, em uma festa - "
					+ "\num baile de máscaras -, desconhecendo a identidade um do outro."
					+ "\nEle é filho dos Montéquio, e ela, dos Capuleto, duas das mais poderosas "
					+ "\nfamílias de Verona, inimigas entre si.");
			loja();
			}
		else if(a ==2) {
			System.out.println("É Natal, e Holden Caulfield conseguiu ser expulso de mais uma escola. Com uns trocados da venda de uma máquina de escrever e "
					+ "\nportando seu indefectível boné vermelho de caçador, "
					+ "\no jovem traça um plano incerto: tomar um trem para Nova York e vagar por três dias pela grande cidade,"
					+ "\nadiando a volta à casa dos pais até que eles recebam a notícia da expulsão por alguém da escola."
					+ "\nSeus dias e noites serão marcados por encontros confusos, e ocasionalmente comoventes, "
					+ "\ncom estranhos, brigas com os tipos mais desprezíveis, encontros com ex-namoradas, visitas à sua irmã Phoebe -- "
					+ "\na única criatura neste mundo que parece entendê-lo -- "
					+ "\ne por dúvidas que irão consumi-lo durante sua estadia,"
					+ "\nentre elas uma questão recorrente: afinal, para onde vão os patos do Central Park no inverno? ");
			loja();
		}
		else if(a == 3) {
			System.out.println("Na manhã de um dia 16 de abril dos anos de 1940, o doutor Bernard Rieux sai do seu "
					+ "\nconsultório e tropeça num rato morto. "
					+ "\nEste é o primeiro sinal de uma epidemia de peste que em"
					+ "\nbreve toma conta de toda a cidade de Orão, na Argélia."
					+ "\nSujeita a quarentena, esta torna-se um território irrespirável e os seus habitantes são"
					+ "\nconduzidos até estados de sofrimento, de loucura, mas também de compaixão de proporções desmedidas.");
			loja();
		}
		else if(a == 4) {
			System.out.println("Florentino Ariza nunca esqueceu Fermina, seu primeiro amor. "
					+ "\nEle esperou quase a vida toda por ela, que se casou com outro. "
					+ "\nAgora, 51 anos depois, o marido morre, e ele finalmente tem uma chance de reconquistá-la.");
			loja();
		}
		else if(a==5) {
			System.out.println("É Natal, e Holden Caulfield conseguiu ser expulso de mais uma escola. Com uns trocados da venda de uma máquina de escrever e"
					+ " \nnportando seu indefectível boné vermelho de caçador,"
					+ " \nno jovem traça um plano incerto: tomar um trem para Nova York e vagar por três dias pela grande cidade, "
					+ "\nadiando a volta à casa dos pais até que eles recebam a notícia da expulsão por alguém da escola.");
					loja();
		}
		else if(a == 6) {
			System.out.println("\nDom Casmurro conta a história de Bento Santiago (Bentinho), "
					+ "\napelidado de Dom Casmurro por ser calado e introvertido."
					+ "\nNa adolescência, apaixona-se por Capítu, abandonando o seminário e,"
					+ "\ncom ele, os desígnios traçados por sua mãe, Dona Glória, para que se tornasse padre.");
			loja();
		}
		break;
		 
		}
	}
	public void deposito(double depTotal) {
		System.out.println("Bem vindo a sessao de compras!");
		System.out.println("Faca um deposito: ");
		depTotal = input.nextDouble();
		this.saldo += depTotal;
	}
	
	public void loja() {
		int op =0;
		
		System.out.println("Escolha a opcao desejada: ");
		System.out.println("(1)COMPRAR");
		System.out.println("(2)ALUGAR");
		System.out.println("(3)RETORNAR AO MENU");
		op = input.nextInt();
		if(op == 1) {
			int preco = 25;//TESTE DELETAR DEPOIS
			System.out.println("O livro custa R$"+preco);
			if(this.saldo - preco <0) {
				System.out.println("Saldo insuficiente!!");
			}else {
				this.saldo -= preco;
				System.out.println("Compra realizada com sucesso!!");
				System.out.println("Novo saldo: R$"+this.saldo);
				menu();
			}
		}
		else if(op == 2) {
			int aluguel = 3;
			System.out.println("O aluguel do livro custa: "+aluguel);
			System.out.println("Seu novo saldo ficou em: ");
		}
		else {
			menu();
		}	
	}
	public void cadastro() {
		System.out.println("Insira seu nome: ");
		this.nome = input.nextLine();
		System.out.println("Escolha um nome de usuario: ");
		this.login = input.nextLine();
		System.out.println("Escolha uma senha: ");
		this.senha = input.nextLine();
		System.out.println("Qual a sua idade?: ");
		this.idade = input.nextInt();
		System.out.println("Faca um deposito inicial: ");
		this.saldo += input.nextInt();
		menu();
		
	}
}
