import java.util.ArrayList;
import java.util.Scanner;

import java.util.concurrent.TimeUnit;


import javax.swing.plaf.synth.SynthScrollBarUI;



public class Biblioteca {
	private String nome;
	private String login;
	private String senha;
	private double saldo;
	private int idade;
	private int genero;
	Scanner input = new Scanner(System.in);
	public Biblioteca(String nome, String login, String senha, double saldo, int idade, int genero) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.saldo = saldo;
		this.idade = idade;
		this.genero = genero;
	}
	
	String user ="asd";
	String password= "asd";

	private ArrayList<Double> precoLivro = new ArrayList<Double>();
	
	 public void addItems(){
	precoLivro.add(23.99);
	precoLivro.add(34.90);
	precoLivro.add(29.99);
	precoLivro.add(59.99);
	precoLivro.add(49.99);
	precoLivro.add(19.99);

	 }
	 int escolha = 0;
	
	
	public void login() {


		System.out.println("\nLogin: ");
		this.login = input.next();
		System.out.println("\nSenha: ");
		this.senha =input.next();
		
		if(user.equals(this.login)&& password.equals(this.senha)) {
			visualizar();
			menu();
		}else {

			System.out.println("\nLogin ou senha incorretos!");
			System.out.println("\nTente novamente.\n");

			login();
		}

	}
	public void menu() {
		
		addItems();
		int op =0;
		
		visualizar2();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nGENEROS: ");


		System.out.println("\nEscolha uma opção: ");
		System.out.println("\n(0) Faca um deposito");
		System.out.println("\n (1) Romance");
		System.out.println("\n (2) Ficcao");
		System.out.println("\n (3) Terror");
		System.out.println("\n (4) Comedia");
		System.out.println("\n (5) Auto-Ajuda");
		System.out.println("\n (6) Aventura");
		System.out.println("\n (7) Infantil");
		op = input.nextInt();
		switch(op) {
		case 0: deposito1(0);
		break;
		case 1: 
				System.out.println("\t  ROMANCE ");
				System.out.println("\t¨¨¨¨¨¨¨¨¨¨¨ ");
				System.out.println("\n(1) Romeo e Julieta: ");
				System.out.println("\n(2) O apanhador no campo de Centeio: ");
				System.out.println("\n(3) A peste: ");
				System.out.println("\n(4) O Amor nos tempos do colera: ");
				System.out.println("\n(5) Cidade de papel: ");
				System.out.println("\n(6) Dom Casmurro: ");
				escolha=input.nextInt();
		
		if(escolha == 1) {
			System.out.println("\t\t\tSINOPSE");
			System.out.println("\nO amor apresenta-se à vida de Romeu e Julieta de modo traiçoeiro - "
					+ "\nambos apaixonam-se instantaneamente, em uma festa - "
					+ "\num baile de máscaras -, desconhecendo a identidade um do outro."
					+ "\nEle é filho dos Montéquio, e ela, dos Capuleto, duas das mais poderosas "
					+ "\nfamílias de Verona, inimigas entre si.\n");
			loja();
			}
		else if(escolha ==2) {
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
		else if(escolha == 3) {
			System.out.println("Na manhã de um dia 16 de abril dos anos de 1940, o doutor Bernard Rieux sai do seu "
					+ "\nconsultório e tropeça num rato morto. "
					+ "\nEste é o primeiro sinal de uma epidemia de peste que em"
					+ "\nbreve toma conta de toda a cidade de Orão, na Argélia."
					+ "\nSujeita a quarentena, esta torna-se um território irrespirável e os seus habitantes são"
					+ "\nconduzidos até estados de sofrimento, de loucura, mas também de compaixão de proporções desmedidas.");
			loja();
		}
		else if(escolha == 4) {
			System.out.println("Florentino Ariza nunca esqueceu Fermina, seu primeiro amor. "
					+ "\nEle esperou quase a vida toda por ela, que se casou com outro. "
					+ "\nAgora, 51 anos depois, o marido morre, e ele finalmente tem uma chance de reconquistá-la.\n");
			loja();
		}
		else if(escolha==5) {
			System.out.println("\nÉ Natal, e Holden Caulfield conseguiu ser expulso de mais uma escola. Com uns trocados da venda de uma máquina de escrever e"
					+ " \nnportando seu indefectível boné vermelho de caçador,"
					+ " \nno jovem traça um plano incerto: tomar um trem para Nova York e vagar por três dias pela grande cidade, "
					+ "\nadiando a volta à casa dos pais até que eles recebam a notícia da expulsão por alguém da escola.\n");
					loja();
		}
		else if(escolha == 6) {
			System.out.println("\nDom Casmurro conta a história de Bento Santiago (Bentinho), "
					+ "\napelidado de Dom Casmurro por ser calado e introvertido."
					+ "\nNa adolescência, apaixona-se por Capítu, abandonando o seminário e,"
					+ "\ncom ele, os desígnios traçados por sua mãe, Dona Glória, para que se tornasse padre.\n");
			loja();
		}
		break;
		case 2: 
				System.out.println("FICCAO: ");
				System.out.println("(1) Outsider: ");
				System.out.println("(2) Drácula - Dark Edition: ");
				System.out.println("(3) O diário perdido de gravity falls: ");
				System.out.println("(4) O livro dos cinco anéis");
				System.out.println("(5) Mitologia Nórdica: ");
				System.out.println("(6) A arte da guerra: ");
				System.out.println("Escolha uma opcao: ");													
				escolha=input.nextInt();
			
		if(escolha == 1) {
			System.out.println("\nO corpo de um menino de onze anos é encontrado abandonado no parque de Flint City, brutalmente assassinado. Testemunhas e impressões digitais apontam o criminoso como uma das figuras mais conhecidas da cidade ― Terry Maitland, treinador da Liga Infantil de beisebol, professor de inglês, casado e pai de duas filhas.\r\n"
					+ "O detetive Ralph Anderson não hesita em ordenar uma prisão rápida e bastante pública, fazendo com que em pouco tempo toda a cidade saiba que o Treinador T é o principal suspeito do crime. Maitland tem um álibi, mas Anderson e o promotor público logo têm amostras de DNA para corroborar a acusação. O caso parece resolvido.\r\n"
					+ "Mas conforme a investigação se desenrola, a história se transforma em uma montanha-russa, cheia de tensão e suspense. Terry Maitland parece ser uma boa pessoa, mas será que isso não passa de uma máscara? A aterrorizante resposta é o que faz desta uma das histórias mais perturbadoras de Stephen King.\n");
					loja();
		}
		else if(escolha == 2) {
			System.out.println("\nDrácula, um clássico que ainda corre quente na veia de inúmeras gerações de leitores por todo o mundo e a mais celebrada narrativa de vampiros, continua a transcender fronteiras de tempo, espaço, história e memória.Mais de 120 anos após sua primeira publicação, o romance epistolar mobiliza leitores e estudiosos,\r\n"
					+ " confirmando o vigor perene de uma árvore cujas sólidas raízes respondem pela vitalidade de suas ramificações. Embora o famoso conde não tenha sido o primeiro vampiro literário, certamente é o mais popular, sugado e adaptado para inúmeros universos: teatro, cinema, quadrinhos, séries e brinquedos, o semblante é reconhecido \r\n"
					+ " até mesmo por aqueles que nunca leram o romance. Ele está em todos os lugares.A obra atemporal de Bram Stoker narra, por meio de fragmentos de cartas, diários e notícias de jornal, a história de humanos lutando para sobreviver às investidas do vampiro Drácula. O grupo formado por Jonathan Harker, Mina Harker, dr. Van Helsing \r\n"
					+ " e dr. Seward tenta impedir que a vil criatura se alimente de sangue humano na Londres da época vitoriana, no final do século XIX.Um clássico absoluto do terror, Bram Stoker define em Drácula a forma como nós entendemos e pensamos os vampiros atualmente. Mais que isso, ele traz esse monstro para o centro do palco da cultura pop \r\n"
					+ " do nosso século e eterniza o vilão de modos refinados e comportamento sanguinário.DUAS EDIÇÕES PARA UM ROMANCE ÚNICONão é de agora que os leitores clamam por uma edição de Drácula feita pela DarkSide® Books para honrar o legado do mestre Bram Stoker. Uma obra tão grandiosa quanto essa será publicada em duas versões, \r\n"
					+ " para nenhum vampiro colocar defeito: FIRST EDITION, com a icônica capa amarela da primeira publicação, em 1897, uma edição inédita no mercado brasileiro que eterniza o brilho e o encanto do sol, algo inalcançável diante de toda a dor da eternidade; e a DARK EDITION, dedicada aos leitores trevosos de coração sombrio. \r\n "
					+ "Por dentro elas carregam o mesmo conteúdo sangrento; por fora demonstram a vida e a beleza de um clássico imortal.Para fazer os leitores se arrepiarem, Marcia Heloisa assina a tradução e introdução de Drácula. E como sangue tem poder, o descendente direto do autor, Dacre Stoker, escreve a preciosa apresentação desta edição.\r\n"
					+ " Carlos Primati e Marcia Heloisa dão suas contribuições para a perpétua criatura. O leitor encontra textos de apoio que contam as relações entre a verdadeira Transilvânia e a aquela eternizada no livro, bem como a influência dos vampiros na cultura pop mundial. E como a DarkSide® Books sabe o que faz o coração dos vivos leitores \r\n"
					+ " da editora bater mais forte, apresenta também o conto “O Hóspede de Drácula”, que fazia parte do texto de Stoker, mas foi retirado da primeira publicação.Todo esse conteúdo, planejado especialmente para os darksiders que sabem que existe uma razão para as coisas serem como são, é ornamentado com as belas e poderosas \r\n "
					+ "imagens de Samuel Casal, premiado quadrinista e ilustrador brasileiro, que fez uma releitura deslumbrante de personagens imortais.A coleção Medo Clássico da DarkSide® se consolida a cada mestre que entra em sua casa, fazendo uma homenagem aos grandes nomes da literatura que já causaram pesadelos inenarráveis aos leitores, \r\n"
					+ "década após década. Para eternizar a experiência, sempre traz ilustradores convidados e tradutores que respiram e conhecem profundamente as obras originais. De fã para fã. Até o fim.DEIXE ELE ENTRAR PARA A SUA COLEÇÃO E CONHEÇA TAMBÉM A FIRST EDITION\n");	
					loja();		
		}
		else if(escolha == 3) {
			System.out.println("\nVocê possui em suas mãos o cobiçado diário do autor da série Gravity Falls, um tesouro de 288 páginas coloridas e sem dono, com segredos nunca antes revelados, monstros e mistérios da pacata cidade do Tivô Stan.\r\n"
					+ "\r\n"
					+ "Com ele, você irá aprender a trágica história de Ford, o paradeiro de Blendin, qual é a Dimensão 52 e como atrair um “ornitorrinco xadrez”.\r\n"
					+ "\r\n"
					+ "Mas cuidado: este é um livro desejado por muitas forças sombrias, por isso fique alerta se qualquer um quiser tirá-lo de você (especialmente se tiverem olhos amarelos e brilhantes). E, o mais importante, divirta-se. Afinal, não existe um lugar como Gravity Falls. Ou será que existe?\n");
					loja();
		}
		else if(escolha == 4) {
			System.out.println("O Livro dos Cinco Anéis é hoje um manual de gente de sucesso que soube aproveitar as lições de Miyamoto Musashi (1584-1645) nas batalhas do dia a dia. Espadachim imbatível desde os 13 anos, o autor resumiu nesta obra clássica a experiência de quem representou o apogeu do Bushido, ou “caminho do guerreiro”, \r\n "
					+ "o código de conduta e modo de vida para os samurais que inclui equilíbrio, sabedoria e honra. Nos cinco capítulos ou tomos do livro, Terra, Água, Fogo, Vento e Vácuo, Musashi trata de liderança e dos princípios ligados aos conflitos da existência humana para fazer do leitor uma pessoa vencedora. Esta edição da Jardim \r\n"
					+ " dos Livros tem primorosa tradução, direta do japonês, do professor doutor Wataru Kikuchi, diretor do Centro de Estudos Japoneses da USP. Um caderno de fotos, pinturas do autor e mapas de batalhas do Japão antigo tornam o livro, além de tudo, uma requintada obra de arte, inclui ainda páginas para anotações do leitor.");
					loja();
		}
		else if(escolha == 5) {
			System.out.println("Uma jornada da origem do universo até o fim do mundo.\r\n"
					+ "\r\n"
					+ "Quem, além de Neil Gaiman, poderia se tornar cúmplice dos deuses e usar de sua habilidade com as palavras para recontar as histórias dos mitos nórdicos? Fãs e leitores sabem que a mitologia nórdica sempre teve grande influência na obra do autor. Depois de servirem de inspiração para clássicos como Deuses americanos e \r\n"
					+ " Sandman, Gaiman agora investiga o universo dos mitos nórdicos. Em Mitologia nórdica, ele vai até a fonte dos mitos para criar sua própria versão, com o inconfundível estilo sagaz e inteligente que permeia toda a sua obra.\r\n"
					+ "\r\n"
					+ "Fascinado por essa mitologia desde a infância, o autor compôs uma coletânea de quinze contos que começa com a narração da origem do mundo e mostra a relação conturbada entre deuses, gigantes e anões, indo até o Ragnarök, o assustador cenário do apocalipse que vai levar ao fim no mundo. Às vezes intensos e sombrios, \r\n"
					+ "outras vezes divertidos e heroicos, os contos retratam tempos longínquos em que os feitos dos deuses eram contados ao redor da fogueira em noites frias e estreladas.\r\n"
					+ "\r\n"
					+ "Mitologia nórdica é o livro perfeito para quem quer descobrir mais sobre a mitologia escandinava e também para aqueles que desejam desvelar novas facetas dessas histórias.\r\n"
					+ "\r\n"
					+ "Mitologia nórdica é uma obra de referência, um novo e precioso registro dos pouco conhecidos mitos escandinavos.\r\n"
					+ "\r\n"
					+ "Os mitos nórdicos estão em obras que se tornaram bastante populares, como os livros de J. R. R. Tolkien, a série de TV Game of Thrones, nas HQs e filmes da Marvel. E, em abril, estreia a adaptação de Deuses americanos para a TV.");
					loja();
		}
		else if (escolha == 6) {
			System.out.println("A guerra é um assunto de importância vital para o Estado; o reino da vida ou da morte; o caminho para a sobrevivência ou a ruína. É indispensável estudá-la profundamente.\" Sun Tzu");
			loja();
		}
		break;
		case 3: System.out.println("Escolha uma opcao: ");
        System.out.println("TERROR: ");
        System.out.println("(1)Medo - Edgar Allan Poe: ");
        System.out.println("(2)Carrie - Stephen King: ");
        System.out.println("(3)Frankenstrein - Mary Shelley: ");
        System.out.println("(4)It - a coisa - Stephen King: ");
        System.out.println("(5)O mistério da casa do lago - Diego Cassiolato: ");
        System.out.println("(6)Condado maldito: Bruxas e Assombrações - Cullen Bunn: ");
        escolha=input.nextInt();

        if(escolha==1) {
            System.out.println("As asas de um corvo se misturam à escuridão. "
                    + "A velha casa em ruínas observa com janelas que pareciam olhos."
                    + " Você jura ouvir a voz de alguém que já partiu para o outro lado,"
                    + " bem na hora em que um gato preto cruza seu caminho. "
                    + "Tudo o que hoje conhecemos como terror começou a ganhar "
                    + "forma na obra de Edgar Allan Poe.");
            loja();
        }
        else if(escolha==2) {
            System.out.println("Carrie é uma adolescente tímida e solitária. Aos 16 anos, é completamente dominada pela mãe, "
                    + "uma fanática religiosa que reprime todas as vontades "
                    + "e descobertas normais aos jovens de sua idade. Para Carrie, "
                    + "tudo é pecado. Viver é enfrentar todo dia o terrível peso da culpa.");
            loja();
        }
        else if(escolha==3) {
            System.out.println("O brilhante e pouco ortodoxo doutor Victor Frankestein trabalha na criação de um monstro com partes de "
                    + "diferentes corpos humanos. Após ser rejeitada pelo criador,"
                    + "a criatura escapa e passa a agir com uma violenta sede de vingança.");
            loja();
        }
else if(escolha==4) {
            System.out.println("Naquele verão, eles enfrentaram pela primeira vez a Coisa, um ser sobrenatural e "
                    + "maligno que deixou terríveis marcas de sangue em Derry. "
                    + "Quase trinta anos depois, os amigos voltam a se encontrar. "
                    + "Uma nova onda de terror tomou a pequena cidade, "
                    + "e somente eles serão capazes de enfrentar a Coisa. O tempo é curto.");
            loja();
        }
		else if(escolha==5) {
            System.out.println("Jack Campbell, um professor de natação, e sua pequena filha Emily, "
                    + "decidem passar um tempo juntos em uma casa do lago "
                    + "a fim de superarem o luto pela morte de Hannah,"
                    + " ex-esposa de Jack e mãe de Emily. Mas, logo após chegarem à propriedade, "
                    + "Emily afirma ter visto uma menina misteriosa na floresta e, "
                    + "no porão da casa, Jack encontra desenhos antigos que parecem ter sido feitos por uma criança. "
                    + "Os desenhos parecem retratar uma pequena família feliz que sofreu uma grande tragédia.\r\n"
                    + "\r\n"
                    + "O que aconteceu com essa família? A menina da floresta é real? Estariam Jack e "
                    + "Emily ligando-se aos desaparecimentos que ocorreram naquela propriedade muitos anos atrás? "
                    + "Enquanto tenta descobrir respostas, Jack precisa salvar sua filha de um mundo gélido e sombrio, "
                    + "e de perigos inimagináveis que tem que enfrentar.");
            loja();
        }
else if(escolha==6) {
            System.out.println("Emmy sempre soube que a floresta ao redor de sua casa estava cheia de fantasmas e monstros. "
                    + "No entanto, na véspera de seu aniversário de dezoito anos ela descobre que está conectada "
                    + "a essas criaturas ― e à própria terra ― de uma maneira que não imaginava ser possível. "
                    + "Aguarde na sombra do carvalho retorcido e ouça o balido das cabras. Condado Maldito: Bruxas & "
                    + "Assombrações é o primeiro de uma série de oito volumes a ser publicada pela "
                    + "DarkSide Books em parceria com a Macabra Filmes ao longo dos próximos meses, e chega para "
                    + "os leitores em uma edição assombrosa e com um tratamento especial de tirar o fôlego. "
                    + "Você está pronto para ver os cordeiros virarem lobos?");
            loja();
        }
        break;
        }
		 
		}
	public void deposito(double depTotal) {
		int op = 0;
		System.out.println("Bem vindo a sessão de compras!");
		System.out.println("Deseja prosseguir com o depósito ? (1)SIM (2)RETORNAR AO MENU");
		op = input.nextInt();
		if (op == 1){
		System.out.println("Faça um depósito: ");
		depTotal = input.nextDouble();
		this.saldo += depTotal;
		loja();
	}
		else menu();
	}

	
	public void loja() {
		int op = 0;
		
		System.out.println("Escolha a opcao desejada: ");
		System.out.println("(1) COMPRAR");
		System.out.println("(2) ALUGAR");
		System.out.println("(3) RETORNAR AO MENU");
		op = input.nextInt();
		if(op == 1) {
			
			System.out.println("\nSaldo disponível: "+saldo);
			System.out.println("O livro custa R$"+precoLivro.get(escolha - 1));
			System.out.println("Deseja prosseguir com a compra? (1)SIM (2)NAO");

			

			int decida = input.nextInt();
			if(decida == 1){
				if(this.saldo - precoLivro.get(escolha -1) <0) {
					System.out.println("\nSaldo insuficiente!");
					System.out.println("\nVocê foi redirecionado para nossa loja.");
					System.err.println("                                          ");
					deposito(0);
				}else if(this.saldo >= precoLivro.get(escolha-1)) {
				this.saldo -= precoLivro.get(escolha-1);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				System.out.println("\t************************************");
				System.out.println("\t*  Compra realizada com sucesso!!  *");
				System.out.println("\t************************************");

				System.out.println("                                    ");
				System.out.println("   Novo saldo: R$"+this.saldo);
				System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
				System.out.println("                             ");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				menu();
			}
			else if (decida == 2 ){
				menu();
			}
		}		
	}		
		else if(op == 2) {
			int decida = 0;
			System.out.println("Tem certeza prosseguir com a operação ? (1) SIM (2) NÃO");
			System.out.println("\nSaldo disponível: "+saldo);
			decida = input.nextInt();
			if(decida==1 ){int aluguel = 5;
				if(saldo - aluguel <0){
					System.out.println("\nSaldo insuficiente!");
					System.out.println("\nVocê foi redirecionado para nossa loja.");
					System.err.println("                                          ");
					deposito(0);
				}
				else if (saldo >= aluguel){
				saldo -=aluguel;
				System.out.println("\nO aluguel do livro custa: "+aluguel);
				System.out.println("\t************************************");
				System.out.println("\t* Operação realizada com sucesso!! *");
				System.out.println("\t************************************");
				System.out.println("\nSeu novo saldo ficou em: "+saldo+"\n");
				System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
				System.out.println("                             ");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				menu();
				}
				else{
					menu();
				}
			}
	
		else {
			menu();
		}
	}
}
	public void cadastro() {
		
		System.out.println("\nInsira seu nome: ");
		this.nome = input.nextLine();
		System.out.println("\nEscolha um nome de usuario: ");
		user = input.nextLine();
		System.out.println("\nEscolha uma senha: ");
		password = input.nextLine();
		System.out.println("\nQual a sua idade?: ");
		this.idade = input.nextInt();
		System.out.println("\nInforme seu genero (1) Masculino || (2)Feminino || (3) Outres: ");
		this.genero = input.nextInt();
		System.out.println("\nFaca um deposito inicial: ");
		this.saldo += input.nextInt();
		System.out.println("CADASTRO REALIZADO COM SUCESSO!! EFETUE O LOGIN PARA CONTNUAR!");
		login();
		}
		public void visualizar(){

		System.out.println("*************************************************************");
		System.out.println("\t           SEJA BEM-VINDO "+nome);
		System.out.println("\n\t          É um prazer tê-lo aqui!");
		System.out.println("\n\t     Você possui: "+saldo+" de Saldo. Aproveite! ");
		System.out.println("*************************************************************");
	}
	
	 public void visualizar2(){
		System.out.println("                           MENU                              ");
		System.out.println("                          ¨¨¨¨¨¨                            ");
		System.out.println("   30% de nossos lucros são enviados para Instituições de caridade.");
		System.out.println("\t Além de alimentar seu conhecimento, alimente vidas! \n ");
		System.out.println("                        __________         ");
		System.out.println("                       | CATÁLOGO |        ");
		System.out.println("                        ¨¨¨¨¨¨¨¨¨¨         ");
	}
		public void visualizar3(){


		}
		public void deposito1(double depTotal) {
			System.out.println("Bem vindo a sessao de compras!");
			System.out.println("Faca um deposito: ");
			depTotal = input.nextDouble();
			this.saldo += depTotal;
			System.out.println("Deposito de R$"+saldo+" realizado com sucesso!");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			menu();
		}
}

