import java.util.Random;
import java.util.Scanner;


public class Espanol {
	private String nome;
	private String login;
	private String senha;
	private int saldo;
	private int idade;
	private int genero;
	Scanner input = new Scanner(System.in);
	
	public Espanol (String nome, String login, String senha, int saldo, int idade, int genero) {
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
		System.out.println("clave: ");
		b = input.nextLine();
		
		if(a.equals(this.login) && b.equals(this.login)) {
		    menu();
		}else {
			System.out.println("Login o Clave incorrectos!");
		}
	}
	
		public void menu() {
			int op =0;
			
			System.out.println(" G�NEROS: ");
			System.out.println("(1)Rom�ntica");
			System.out.println("(2)Ciencia Ficci�n");
			System.out.println("(3)Terror");
			System.out.println("(4)Humor");
			System.out.println("(5)Autoayuda");
			System.out.println("(6)Aventura");
			System.out.println("(7)Infantil");
			System.out.println("Elige una opci�n: ");
			op = input.nextInt();
			int a = 0;
			switch(op) {
			
			case 1: System.out.println(" Elige una opci�n: ");
			System.out.println("(1)Romeo y Julieta: ");
			System.out.println("(2)El guardian entre el Centeno: ");
			System.out.println("(3)La peste: ");
			System.out.println("(4)El amor en los tiempos del c�lera: ");
			System.out.println("(5)Ciudades de papel: ");
			System.out.println("(6)Dom Casmurro: ");
			a=input.nextInt();
			
			if(a == 1) {
				System.out.println("El amor se introduce en la vida de Romeo y Julieta de forma traicionera "
						+ "los dos se enamoran al instante, en una fiesta "
						+ "a baile de m�scaras -, sin darse cuenta de las identidades de los dem�s. "
						+ "�l es hijo de los Montescos, y ella de los Capuletos, dos de los m�s poderosos "
						+ "Familias Verona, enemigas entre s�. ");
				loja();
				}
			else if(a ==2) {
				System.out.println("Es Navidad y Holden Caulfield ha logrado que lo echen de otra escuela. Con alg�n cambio de la venta de una m�quina de escribir y \"\r\n"
						+ "usando su infalible gorra roja de cazador,"
						+ "el joven elabora un plan incierto: tomar un tren a Nueva York y vagar durante tres d�as por la gran ciudad."
						+ " Aplazar el regreso a casa de los padres hasta que reciban la noticia de la expulsi�n por parte de alguien del colegio."
						+ " Tus d�as y noches estar�n marcados por encuentros confusos y, en ocasiones, conmovedores "
						+ "con extra�os, peleas con los tipos m�s malos, citas con ex novias, visitas con tu hermana Phoebe "
						+ "la �nica criatura en este mundo que parece entenderlo "
						+ "por las dudas que te consumir�n durante tu estancia, "
						+ "entre ellos una pregunta recurrente: despu�s de todo, �ad�nde van los patos de Central Park en invierno? ");
				loja();
			}
			else if(a == 3) {
				System.out.println("En la ma�ana del 16 de abril de 1940, el Dr. Bernard Rieux deja su "
						+ "oficina y tropieza con un rat�n muerto. "
						+ "Esta es la primera se�al de una epidemia de peste que en "
						+ "pronto se apodera de toda la ciudad de Or�n en Argelia."
						+ " Sujeto a cuarentena, se convierte en un territorio irrespirable y sus habitantes son "
						+ "impulsado a estados de sufrimiento, de locura, pero tambi�n de compasi�n de proporciones inconmensurables.");
				loja();
			}
			else if(a == 4) {
				System.out.println("Florentino Ariza nunca olvid� a Fermina, su primer amor. "
						+ "�l esper� casi toda su vida por ella, y ella se cas� con otro."
						+ " Ahora, 51 a�os despu�s, su esposo muere y finalmente tiene la oportunidad de recuperarla. ");
				loja();
			}
			else if(a==5) {
				System.out.println("Es Navidad, y Holden Caulfield se ha hecho expulsar de otra escuela. Con unos cuantos d�lares de la venta de una m�quina de escribir y "
						+ "llevando tu infalible gorra roja de cazador, "
						+ "El joven hace un plan incierto: tomar un tren a Nueva York y pasear por la gran ciudad durante tres d�as, "
						+ "aretrasar el regreso a casa de los padres hasta que reciban la noticia de la expulsi�n por parte de alguien del colegio. ");
						loja();
			}
			else if(a == 6) {
				System.out.println("Dom Casmurro cuenta la historia de Bento Santiago (Bentinho), "
						+ "apodado Dom Casmurro por ser callado e introvertido. "
						+ "Siendo adolescente, se enamora de Capitu, abandona el seminario y,"
						+ "con �l, los planes trazados por su madre, do�a Gl�ria, para que �l fuera sacerdote. ");
				loja();
			}
			break; 
			}
		}
			
			public void deposito(double depTotal) {
				System.out.println("Bienvenido a la secci�n de compras!");
				System.out.println("Haga un deposito: ");
				depTotal = input.nextDouble();
				this.saldo += depTotal;
			}
			
			public void loja() {
				int op =0;
				
				System.out.println("Elige una opci�n: ");
				System.out.println("(1)Comprar");
				System.out.println("(2)Alquilar");
				System.out.println("(3)Volver al men�");
				op = input.nextInt();
				if(op == 1) {
					int preco = 25;//TESTE DELETAR DEPOIS
					System.out.println("El precio del libro R$"+preco);
					if(this.saldo - preco <0) {
						System.out.println("Saldo insuficiente!!!");
					}else {
						this.saldo -= preco;
						System.out.println("Compra realizada con �xito!!!");
						System.out.println("Nuevo saldo: R$"+this.saldo);
						
					} 
					}else if(op == 2) {
						int aluguel = 3;
						System.out.println("Book rental costs: "+aluguel);
						System.out.println("Your new balance is : ");
					}
					else {
						menu();
					}	
				}
	
	public void cadastro() {
		System.out.println("Entre con su nombre: ");
		this.nome = input.nextLine();
		System.out.println("Entre con un usu�rio: ");
		this.login = input.nextLine();
		System.out.println("Entre con una clave: ");
		this.senha = input.nextLine();
		System.out.println("�Cu�ntos a�os tiene?");
		this.idade = input.nextInt();
		System.out.println("Haga un deposito inicial: ");
		this.saldo += input.nextInt();
		menu();
	}
	
}
