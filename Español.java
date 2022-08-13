import java.util.Random;
import java.util.Scanner;


public class Español {
	private String nome;
	private String login;
	private String senha;
	private int saldo;
	private int idade;
	private String genero;
	Scanner input = new Scanner(System.in);
	
	public Español (String nome, String login, String senha, int saldo, int idade, String genero) {
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
			
			System.out.println(" GÉNEROS: ");
			System.out.println("(1)Romántica");
			System.out.println("(2)Ciencia Ficción");
			System.out.println("(3)Terror");
			System.out.println("(4)Humor");
			System.out.println("(5)Autoayuda");
			System.out.println("(6)Aventura");
			System.out.println("(7)Infantil");
			System.out.println("Elige una opción: ");
			op = input.nextInt();
			int a = 0;
			switch(op) {
			
			case 1: System.out.println(" Elige una opción: ");
			System.out.println("(1)Romeo y Julieta: ");
			System.out.println("(2)El guardian entre el Centeno: ");
			System.out.println("(3)La peste: ");
			System.out.println("(4)El amor en los tiempos del cólera: ");
			System.out.println("(5)Ciudades de papel: ");
			System.out.println("(6)Dom Casmurro: ");
			a=input.nextInt();
			
			if(a == 1) {
				System.out.println("El amor se introduce en la vida de Romeo y Julieta de forma traicionera "
						+ "los dos se enamoran al instante, en una fiesta "
						+ "a baile de máscaras -, sin darse cuenta de las identidades de los demás. "
						+ "Él es hijo de los Montescos, y ella de los Capuletos, dos de los más poderosos "
						+ "Familias Verona, enemigas entre sí. ");
				loja();
				}
			else if(a ==2) {
				System.out.println("Es Navidad y Holden Caulfield ha logrado que lo echen de otra escuela. Con algún cambio de la venta de una máquina de escribir y \"\r\n"
						+ "usando su infalible gorra roja de cazador,"
						+ "el joven elabora un plan incierto: tomar un tren a Nueva York y vagar durante tres días por la gran ciudad."
						+ " Aplazar el regreso a casa de los padres hasta que reciban la noticia de la expulsión por parte de alguien del colegio."
						+ " Tus días y noches estarán marcados por encuentros confusos y, en ocasiones, conmovedores "
						+ "con extraños, peleas con los tipos más malos, citas con ex novias, visitas con tu hermana Phoebe "
						+ "la única criatura en este mundo que parece entenderlo "
						+ "por las dudas que te consumirán durante tu estancia, "
						+ "entre ellos una pregunta recurrente: después de todo, ¿adónde van los patos de Central Park en invierno? ");
				loja();
			}
			else if(a == 3) {
				System.out.println("En la mañana del 16 de abril de 1940, el Dr. Bernard Rieux deja su "
						+ "oficina y tropieza con un ratón muerto. "
						+ "Esta es la primera señal de una epidemia de peste que en "
						+ "pronto se apodera de toda la ciudad de Orán en Argelia."
						+ " Sujeto a cuarentena, se convierte en un territorio irrespirable y sus habitantes son "
						+ "impulsado a estados de sufrimiento, de locura, pero también de compasión de proporciones inconmensurables.");
				loja();
			}
			else if(a == 4) {
				System.out.println("Florentino Ariza nunca olvidó a Fermina, su primer amor. "
						+ "Él esperó casi toda su vida por ella, y ella se casó con otro."
						+ " Ahora, 51 años después, su esposo muere y finalmente tiene la oportunidad de recuperarla. ");
				loja();
			}
			else if(a==5) {
				System.out.println("Es Navidad, y Holden Caulfield se ha hecho expulsar de otra escuela. Con unos cuantos dólares de la venta de una máquina de escribir y "
						+ "llevando tu infalible gorra roja de cazador, "
						+ "El joven hace un plan incierto: tomar un tren a Nueva York y pasear por la gran ciudad durante tres días, "
						+ "aretrasar el regreso a casa de los padres hasta que reciban la noticia de la expulsión por parte de alguien del colegio. ");
						loja();
			}
			else if(a == 6) {
				System.out.println("Dom Casmurro cuenta la historia de Bento Santiago (Bentinho), "
						+ "apodado Dom Casmurro por ser callado e introvertido. "
						+ "Siendo adolescente, se enamora de Capitu, abandona el seminario y,"
						+ "con él, los planes trazados por su madre, doña Glória, para que él fuera sacerdote. ");
				loja();
			}
			break; 
			}
		}
			
			public void deposito(double depTotal) {
				System.out.println("Bienvenido a la sección de compras!");
				System.out.println("Haga un deposito: ");
				depTotal = input.nextDouble();
				this.saldo += depTotal;
			}
			
			public void loja() {
				int op =0;
				
				System.out.println("Elige una opción: ");
				System.out.println("(1)Comprar");
				System.out.println("(2)Alquilar");
				System.out.println("(3)Volver al menú");
				op = input.nextInt();
				if(op == 1) {
					int preco = 25;//TESTE DELETAR DEPOIS
					System.out.println("El precio del libro R$"+preco);
					if(this.saldo - preco <0) {
						System.out.println("Saldo insuficiente!!!");
					}else {
						this.saldo -= preco;
						System.out.println("Compra realizada con éxito!!!");
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void cadastro() {
		System.out.println("Entre con su nombre: ");
		this.nome = input.nextLine();
		System.out.println("Entre con un usuário: ");
		this.login = input.nextLine();
		System.out.println("Entre con una clave: ");
		this.senha = input.nextLine();
		System.out.println("¿Cuántos años tiene?");
		this.idade = input.nextInt();
		System.out.println("Haga un deposito inicial: ");
		this.saldo += input.nextInt();
		menu();
	}
	
}
