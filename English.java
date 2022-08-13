
import java.util.Random;
import java.util.Scanner;


public class English {
	private String nome;
	private String login;
	private String senha;
	private int saldo;
	private int idade;
	private int genero;
	Scanner input = new Scanner(System.in);



	
	public English(String nome, String login, String senha, int saldo, int idade, int genero) {

		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.saldo = saldo;
		this.idade = idade;
		this.genero = genero;
	}

	String user;
	String password;
	

	Random random = new Random();
	double[] livro = new double[42];
	
	public void gerarPreco() {
		for(int i=0;i<42;i++) {
			livro[i] = random.nextInt(30,60);
			System.out.println(livro[i]);
		}
	}

	
	public void login() {
		System.out.println("user: ");
		this.login = input.next();
		System.out.println("password: ");
		this.senha =input.next();
		
		if(user.equals(this.login)&& password.equals(this.senha)) {
		menu();
		}else {
			System.out.println("incorrect login or password");
			login();
		}
	}
	public void menu() {
		int op =0;
		visualizar();
		visualizar2();
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
		case 2: 
		System.out.println("Choose an option: ");													
		System.out.println("FICTION: ");
		System.out.println("(1)Outsider: ");
		System.out.println("(2)Drácula - Dark Edition: ");
		System.out.println("(3)The Lost Journal of Gravity Falls ");
		System.out.println("(4)The Book of Five Rings");
		System.out.println("(5)Norse mythology: ");
		System.out.println("(6)The art of war: ");
		a=input.nextInt();
	
if(a == 1) {
	System.out.println("The body of an eleven-year-old boy is found abandoned in Flint City Park, brutally murdered. Witnesses and fingerprints point to the criminal as one of the city's most recognizable figures ― Terry Maitland, Little League baseball coach, English teacher, married and father of two.\r\n"
	+ "Detective Ralph Anderson doesn't hesitate to order a quick and very public arrest, letting the entire town soon know that Coach T is the prime suspect in the crime. Maitland has an alibi, but Anderson and the district attorney soon have DNA samples to support the charge. The case appears to be resolved.\r\n"
	+ "But as the investigation unfolds, the story turns into a roller coaster, full of tension and suspense. Terry Maitland seems like a good person, but is that just a mask? The terrifying response is what makes this one of Stephen King's most disturbing stories.");
			loja();
}
else if(a == 2) {
	System.out.println("Dracula, a classic that still runs hot in the veins of countless generations of readers around the world and the most celebrated vampire narrative, continues to transcend boundaries of time, space, history and memory. epistolary novel mobilizes readers and scholars,\r\n"
	+ " confirming the perennial vigor of a tree whose solid roots account for the vitality of its ramifications. Although the famous count was not the first literary vampire, he is certainly the most popular, sucked and adapted to countless universes: theater, cinema, comics, series and toys, the face is recognized \r\n"
	+ " even by those who have never read the novel. It is everywhere. Bram Stoker's timeless work narrates, through fragments of letters, diaries and newspaper reports, the story of humans struggling to survive the onslaughts of vampire Dracula. The group formed by Jonathan Harker, Mina Harker, Dr. Van Helsing \r\n"
	+ " and Dr. Seward tries to stop the vile creature from feeding on human blood in late 19th century Victorian London. An absolute horror classic, Bram Stoker defines in Dracula the way we understand and think about vampires today. . More than that, he brings this monster to the center stage of pop culture \r\n"
	+ " of our century and immortalizes the villain of refined manners and bloodthirsty behavior.TWO EDITIONS FOR A UNIQUE ROMANCE It's not now that readers clamor for an edition of Dracula made by DarkSide® Books to honor the legacy of the master Bram Stoker. as great as this one will be published in two versions, \r\n"
	+ " for no vampire to fault: FIRST EDITION, with the iconic yellow cover of the first publication, in 1897, an unprecedented edition in the Brazilian market that eternalizes the brightness and charm of the sun, something unattainable in the face of all the pain of eternity; and the DARK EDITION, dedicated to dark-hearted readers. \r\n ");	
			loja();		
}
else if(a == 3) {
	System.out.println("You hold in your hands the coveted journal of the author of the Gravity Falls series, a 288-page, full-color, unowned treasure trove of never-before-revealed secrets, monsters, and mysteries of Grandpa Stan's sleepy town.\r\n"
	+ "\r\n"
	+ "With him, you will learn the tragic story of Ford, the whereabouts of Blendin, what Dimension 52 is and how to attract a “platypus chess”.\r\n"
	+ "\r\n"
	+ "But beware: this is a book desired by many dark forces, so stay alert if anyone wants to take it away from you (especially if they have bright yellow eyes). And most importantly, have fun. there's no such place as Gravity Falls, or is there?");
			loja();
}
else if(a == 4) {
	System.out.println("The Book of Five Rings is today a manual for successful people who knew how to take advantage of the lessons of Miyamoto Musashi (1584-1645) in everyday battles. Unbeatable swordsman since he was 13 years old, the author summarized in this classic work the experience of who represented the heyday of Bushido, or “way of the warrior”, \r\n "
	+ "the code of conduct and way of life for samurai that includes balance, wisdom and honor. In the five chapters or volumes of the book, Earth, Water, Fire, Wind and Vacuum, Musashi deals with leadership and principles related to the conflicts of the human existence to make the reader a winner. This edition of Jardim \r\n"
	+ " dos Livros has an exquisite translation, direct from Japanese, by professor Dr. Wataru Kikuchi, director of the Center for Japanese Studies at USP. exquisite work of art, it even includes pages for the reader's notes.");
			loja();
}
else if(a == 5) {
	System.out.println("A journey from the origin of the universe to the end of the world.\r\n"
	+ "\r\n"
	+ "Who, besides Neil Gaiman, could become an accomplice of the gods and use his skill with words to retell the stories of Norse myths? Fans and readers know that Norse mythology has always had a great influence on the author's work. serve as inspiration for classics such as American Gods and \r\n"
	+ " Sandman, Gaiman now investigates the universe of Norse myths. In Norse Mythology, he goes to the source of the myths to create his own version, with the unmistakable shrewd and intelligent style that permeates all his work.\r\n"
	+ "\r\n"
	+ "Fascinated by this mythology since childhood, the author composed a collection of fifteen tales that begins with the narration of the origin of the world and shows the troubled relationship between gods, giants and dwarves, going to Ragnarök, the terrifying scenario of the apocalypse that will lead to the end of the world. Sometimes intense and dark,\r\n"
	+ "Other times fun and heroic, the tales depict distant times when the deeds of the gods were told around the campfire on cold and starry nights.\r\n"
	+ "\r\n"
	+ "Norse Mythology is the perfect book for anyone who wants to discover more about Scandinavian Mythology and also for those who want to unveil new facets of these stories.\r\n"
	+ "\r\n"
	+ "Norse Mythology is a reference work, a precious new record of little-known Scandinavian myths.\r\n"
	+ "\r\n"
	+ "Nordic myths are in works that have become quite popular, such as J.R.R. Tolkien's books, the TV series Game of Thrones, in Marvel comics and films. And, in April, the adaptation of American Gods for TV premieres .");
			loja();
}
else if (a == 6) {
	System.out.println("War is a matter of vital importance to the State; the realm of life or death; the path to survival or ruin. It is indispensable to study it deeply.\" Sun Tzu");
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
		user = input.nextLine();
		System.out.println("Choose a password: ");
		password = input.nextLine();
		System.out.println("How old are you? ");
		this.idade = input.nextInt();
		System.out.println("Please enter your gender (1) Male || (2)Female || (3) Others: ");
		this.genero = input.nextInt();
		System.out.println("Make an initial deposit: ");
		this.saldo += input.nextInt();
		login();
		
	}
	public void visualizar2(){
		
		System.out.println("                                                          ");
		System.out.println("\t In addition to feeding your knowledge, feed lives! \n ");
		System.out.println("\t\t             CATALOG");
		}
	public void visualizar(){

			System.out.println("*************************************************************");
			System.out.println("\t           WELCOME!! "+nome);
			System.out.println("\n\t          It's a pleasure have you here!");
			System.out.println("\n\t    Your balance is: "+saldo+" Enjoy! ");
			System.out.println("*************************************************************");
		}
}