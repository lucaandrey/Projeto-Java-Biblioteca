package Biblioteca;

import java.util.Scanner;

public class Biblioteca {
	private String nome;
	private String login;
	private String senha;
	private String saldo;
	private int idade;
	private String genero;
	Scanner input = new Scanner(System.in);
	public Biblioteca(String nome, String login, String senha, String saldo, int idade, String genero) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.saldo = saldo;
		this.idade = idade;
		this.genero = genero;
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
				a=input.nextInt();
				System.out.println("ROMANCE: ");
				System.out.println("(1)Romeo e Julieta: ");
				System.out.println("(2)O apanhador no campo de Centeio: ");
				System.out.println("(3)A peste: ");
				System.out.println("(4)O Amor nos tempos do colera: ");
				System.out.println("(5)Cidade de papel: ");
				System.out.println("(6)Dom Casmurro: ");
		
		if(a == 1) {
			System.out.println("O amor apresenta-se à vida de Romeu e Julieta de modo traiçoeiro - "
					+ "ambos apaixonam-se instantaneamente, em uma festa - "
					+ "um baile de máscaras -, desconhecendo a identidade um do outro."
					+ " Ele é filho dos Montéquio, e ela, dos Capuleto, duas das mais poderosas "
					+ "famílias de Verona, inimigas entre si.");
			}
		else if(a ==2) {
			System.out.println("É Natal, e Holden Caulfield conseguiu ser expulso de mais uma escola. Com uns trocados da venda de uma máquina de escrever e "
					+ "portando seu indefectível boné vermelho de caçador, "
					+ "o jovem traça um plano incerto: tomar um trem para Nova York e vagar por três dias pela grande cidade,"
					+ " adiando a volta à casa dos pais até que eles recebam a notícia da expulsão por alguém da escola."
					+ " Seus dias e noites serão marcados por encontros confusos, e ocasionalmente comoventes, "
					+ "com estranhos, brigas com os tipos mais desprezíveis, encontros com ex-namoradas, visitas à sua irmã Phoebe -- "
					+ "a única criatura neste mundo que parece entendê-lo -- "
					+ "e por dúvidas que irão consumi-lo durante sua estadia,"
					+ " entre elas uma questão recorrente: afinal, para onde vão os patos do Central Park no inverno? ");
		}
		else if(a == 3) {
			System.out.println("Na manhã de um dia 16 de abril dos anos de 1940, o doutor Bernard Rieux sai do seu "
					+ "consultório e tropeça num rato morto. "
					+ "Este é o primeiro sinal de uma epidemia de peste que em"
					+ " breve toma conta de toda a cidade de Orão, na Argélia."
					+ " Sujeita a quarentena, esta torna-se um território irrespirável e os seus habitantes são"
					+ " conduzidos até estados de sofrimento, de loucura, mas também de compaixão de proporções desmedidas.");
		}
		else if(a == 4) {
			System.out.println("Florentino Ariza nunca esqueceu Fermina, seu primeiro amor. "
					+ "Ele esperou quase a vida toda por ela, que se casou com outro. "
					+ "Agora, 51 anos depois, o marido morre, e ele finalmente tem uma chance de reconquistá-la.");
		}
		else if(a==5) {
			System.out.println("É Natal, e Holden Caulfield conseguiu ser expulso de mais uma escola. Com uns trocados da venda de uma máquina de escrever e"
					+ " portando seu indefectível boné vermelho de caçador,"
					+ " o jovem traça um plano incerto: tomar um trem para Nova York e vagar por três dias pela grande cidade, "
					+ "adiando a volta à casa dos pais até que eles recebam a notícia da expulsão por alguém da escola.");
		}
		else if(a == 6) {
			System.out.println("\"Dom Casmurro\" conta a história de Bento Santiago (Bentinho), "
					+ "apelidado de Dom Casmurro por ser calado e introvertido."
					+ " Na adolescência, apaixona-se por Capítu, abandonando o seminário e,"
					+ " com ele, os desígnios traçados por sua mãe, Dona Glória, para que se tornasse padre.");
		}
		break;
		 
		}
	}
	
}

