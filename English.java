
import java.util.Random;
import java.util.Scanner;


public class English {
	private String nome;
	private String login;
	private String senha;
	private int saldo;
	private int idade;
	private String genero;
	Scanner input = new Scanner(System.in);
	
	public English(String nome, String login, String senha, int saldo, int idade, String genero) {
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
		System.out.println("password: ");
		b = input.nextLine();
		
		if(a.equals(this.login) && b.equals(this.login)) {
		    menu();
		}else {
			System.out.println("Incorrect login or password!");
		}
	}
	public void menu() {
		int op =0;
		
		System.out.println(" GENEROUS: ");
		System.out.println("(1)Romance");
		System.out.println("(2)Fiction");
		System.out.println("(3)Terror");
		System.out.println("(4)Comedy");
		System.out.println("(5)Self Help");
		System.out.println("(6)Adventure");
		System.out.println("(7)Children");
		System.out.println("Choose an option: ");
		op = input.nextInt();
		int a = 0;
		switch(op) {
		
		case 1: System.out.println("Choose an option: ");
				System.out.println("ROMANCE: ");
				System.out.println("(1)Romeo and Juliet: ");
				System.out.println("(2)The Catcher In The Rye: ");
				System.out.println("(3)The Plague: ");
				System.out.println("(4) Love In The Time Of Cholera: ");
				System.out.println("(5)Paper Cities: ");
				System.out.println("(6)Dom Casmurro: ");
				a=input.nextInt();
		
		if(a == 1) {
			System.out.println("\nLove introduces itself to the life of Romeo and Juliet in a treacherous way -"
					+ "\nboth fall in love instantly, at a party -"
					+ "\na masquerade ball -, unaware of each other's identities."
					+ "\nHe is the son of the Montagues, and she of the Capulets, two of the most powerful "
					+ "\nVerona families, enemies among themselves.");
			loja();
			}
		else if(a ==2) {
			System.out.println("It's Christmas, and Holden Caulfield has managed to get kicked out of yet another school. With some change from the sale of a typewriter and "
					+ "\n wearing his unfailing red hunter's cap, "
					+ "\nthe young man draws up an uncertain plan: take a train to New York and wander for three days around the big city,"
					+ "\npostponing the return to the parents' house until they receive the news of the expulsion by someone from the school."
					+ "\nYour days and nights will be marked by confusing, and occasionally touching, encounters. "
					+ "\nwith strangers, fights with the meanest types, dates with ex-girlfriends, visits with your sister Phoebe -- "
					+ "\nthe only creature in this world that seems to understand him --"
					+ "\nand for doubts that will consume you during your stay,"
					+ "\namong them a recurring question: after all, where do Central Park ducks go in winter? ");
			loja();
		}
		else if(a == 3) {
			System.out.println("On the morning of April 16, 1940, Dr. Bernard Rieux leaves his "
            + "\noffice and trips over a dead mouse."
            + "\nThis is the first sign of a plague epidemic that in"
            + "\nsoon takes over the entire city of Oran in Algeria."
            + "\nSubject to quarantine, it becomes an unbreathable territory and its inhabitants are"
            + "\ndriven to states of suffering, of madness, but also of compassion of immeasurable proportions.");
			loja();
		}
		else if(a == 4) {
			System.out.println("Florentino Ariza never forgot Fermina, his first love."
            + "\nHe waited almost his whole life for her, and she married someone else."
            + "\nNow, 51 years later, her husband dies, and he finally has a chance to win her back.");
			loja();
		}
		else if(a==5) {
			System.out.println("It's Christmas, and Holden Caulfield has gotten himself expelled from yet another school. With a few bucks from selling a typewriter and"
            + "\nnwearing your unfailing red hunter's cap,"
            + "\nThe young man makes an uncertain plan: take a train to New York and wander around the big city for three days, "
            + "\nadelaying the return to the parents' house until they receive the news of the expulsion by someone from the school.");
					loja();
		}
		else if(a == 6) {
			System.out.println("\nDom Casmurro tells the story of Bento Santiago (Bentinho), "
            + "\nanicknamed Dom Casmurro for being quiet and introverted."
            + "\nAs a teenager, he falls in love with Capitu, abandons the seminary and,"
            + "\nwith him, the plans traced by his mother, Dona Glória, for him to become a priest.");
			loja();
		}
		break;
		
		 
		}
	}
	public void deposito(double depTotal) {
		System.out.println("Welcome to the shopping session!");
		System.out.println("Make a deposit: ");
		depTotal = input.nextDouble();
		this.saldo += depTotal;
	}
	
	public void loja() {
		int op =0;
		
		System.out.println("Choose one option: ");
		System.out.println("(1)BUY");
		System.out.println("(2)RENT");
		System.out.println("(3)Back to the main menu");
		op = input.nextInt();
		if(op == 1) {
			int preco = 25;//TESTE DELETAR DEPOIS
			System.out.println("Book's price R$"+preco);
			if(this.saldo - preco <0) {
				System.out.println("insufficient balance!!");
			}else {
				this.saldo -= preco;
				System.out.println("Purchase made successfully!!");
				System.out.println("New Ballance: R$"+this.saldo);
				
			}
		}
		else if(op == 2) {
			int aluguel = 3;
			System.out.println("Book rental costs: "+aluguel);
			System.out.println("Your new balance is : ");
		}
		else {
			menu();
		}	
	}
	public void cadastro() {
		System.out.println("Enter your name: ");
		this.nome = input.nextLine();
		System.out.println("Choose a user name: ");
		this.login = input.nextLine();
		System.out.println("Choose a password: ");
		this.senha = input.nextLine();
		System.out.println("How old are you? ");
		this.idade = input.nextInt();
		System.out.println("Make an initial deposit: ");
		this.saldo += input.nextInt();
		menu();
		
	}
}