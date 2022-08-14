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
			case 2: 
				System.out.println("Ciencia Ficción: ");
				System.out.println("(1)Outsider: ");
				System.out.println("(2)DrÃ¡cula - Dark Edition: ");
				System.out.println("(3)O diÃ¡rio perdido de gravity falls: ");
				System.out.println("(4)O livro dos cinco anÃ©is");
				System.out.println("(5)Mitologia NÃ³rdica: ");
				System.out.println("(6)A arte da guerra: ");
				System.out.println("Escolha uma opcao: ");													
				a=input.nextInt();
			
		if(a == 1) {
			System.out.println("Un crimen indescriptible. Una investigación inexplicable. Una de las historias de Stephen King más "
					+ "inquietantes de los últimos tiempos. "
					+ "El cuerpo de un niño de once años se encuentra abandonado en Flint City Park, brutalmente asesinado. "
					+ "Los testigos y las huellas dactilares señalan al delincuente como una de las figuras más conocidas de "
					+ "la ciudad: Terry Maitland, entrenador de béisbol de las ligas menores, profesor de inglés, casado y padre de dos hijos. "
					+ "El detective Ralph Anderson no duda en ordenar un arresto rápido y muy público, dejando que todo el "
					+ "pueblo sepa en poco tiempo que el Entrenador T es el principal sospechoso del crimen. Maitland tiene una coartada, "
					+ "pero Anderson y el fiscal de distrito pronto tienen muestras de ADN para respaldar el cargo. El caso parece resuelto. "
					+ "Pero a medida que avanza la investigación, la historia se convierte en una montaña rusa, llena de tensión y suspenso. "
					+ "Terry Maitland parece una buena persona, pero ¿eso es solo una máscara? la respuesta aterradora es "
					+ "lo que hace de esta una de las historias más inquietantes de Stephen King.\r\n"
					+ "");
					loja();
		}
		else if(a == 2) {
			System.out.println("Drácula, un clásico que aún corre caliente en las venas de innumerables generaciones"
					+ " de lectores en todo el mundo y la narrativa vampírica más célebre, continúa trascendiendo "
					+ "las fronteras del tiempo, el espacio, la historia y la memoria.La novela epistolar "
					+ "moviliza a lectores y estudiosos, confirmando el vigor perenne. de un árbol cuyas sólidas raíces dan cuenta "
					+ "de la vitalidad de sus ramificaciones."
					+ " Aunque el famoso conde no fue el primer vampiro literario, sin duda es el más popular, aspirado y adaptado a "
					+ "infinidad de universos: "
					+ "teatro, cine, historietas, series y juguetes, el semblante es reconocido incluso por quienes nunca han leído la novela. "
					+ "Está en todas partes. "
					+ "La obra atemporal de Bram Stoker narra, a través de fragmentos de cartas, diarios y reportajes periodísticos, "
					+ "la historia de humanos "
					+ "que luchan por sobrevivir a las embestidas del vampiro Drácula. El grupo formado por Jonathan Harker, "
					+ "Mina Harker, Dr. Van Helsing y el Dr. Seward "
					+ "intenta evitar que la vil criatura se alimente de sangre humana en el Londres victoriano, a finales del siglo 19. "
					+ "Un clásico absoluto del terror,"
					+ " Bram Stoker define en Drácula la forma en que entendemos y pensamos sobre los vampiros en la actualidad."
					+ " Más que eso, lleva a este monstruo "
					+ "al centro del escenario de la cultura pop de nuestro siglo e inmortaliza al villano de maneras refinadas y comportamiento "
					+ "sanguinario. "
					+ "DOS EDICIONES PARA UN ROMANCE ÚNICO No es ahora que los lectores claman por una edición de Dracula by the DarkSide. ® "
					+ "Libros para honrar"
					+ " el legado del Maestro Bram Stoker. Una obra tan grande como esta se publicará en dos versiones, para que ningún vampiro pueda"
					+ " criticarla: PRIMERA EDICIÓN, con la icónica tapa amarilla de la primera publicación, en 1897, una edición inédita en el"
					+ " mercado brasileño que inmortaliza el brillo y encanto del sol, algo inalcanzable frente a todo el dolor de la eternidad;"
					+ " y la EDICIÓN OSCURA, dedicada a lectores de corazón oscuro, de corazón oscuro. En su interior llevan "
					+ "el mismo contenido sanguinolento; por fuera demuestran la vida y la belleza de un clásico inmortal Para hacer temblar a los "
					+ "lectores, "
					+ "Marcia Heloisa firma la traducción y la introducción de Drácula. Y como la sangre tiene poder, el descendiente directo del autor, "
					+ "Dacre Stoker, escribe la preciosa presentación de esta edición Carlos Primati y Marcia Heloisa dan sus aportes a la criatura perpetua. "
					+ "El lector encontrará textos de apoyo que relatan la relación entre la Transilvania real y la inmortalizada en el libro, "
					+ "así como la influencia de los vampiros en la cultura pop mundial. Y como DarkSide® Books sabe lo que hace latir más rápido "
					+ "el corazón de los lectores vivos de la editorial, también presenta el cuento “Dracula's Guest”, que formaba parte del texto de Stoker, "
					+ "pero fue eliminado de la primera publicación, diseñado especialmente para darksiders que"
					+ " sepa que hay una razón para que las cosas sean como son, está adornada con las bellas y poderosas imágenes de Samuel Casal, "
					+ "el galardonado dibujante e ilustrador brasileño, que ha realizado una impresionante reinterpretación de personajes inmortales. "
					+ "consolida con cada maestro que entra en su casa, rindiendo homenaje a "
					+ "los grandes nombres de la literatura que han provocado indecibles pesadillas a los lectores, década tras década. "
					+ "Para perpetuar la experiencia, siempre trae ilustradores y traductores invitados que respiran y conocen profundamente las obras originales. "
					+ "De hincha a hincha. Hasta el final DÉJALO ENTRAR EN TU COLECCIÓN Y CONOCE LA PRIMERA EDICIÓN");	
					loja();		
		}
		else if(a == 3) {
			System.out.println("Tienes en tus manos el codiciado diario del autor de la serie Gravity Falls, "
					+ "un tesoro sin dueño de 288 páginas a todo color de secretos, "
					+ "monstruos y misterios nunca antes revelados de la tranquila ciudad del abuelo Stan.\r\n"
					+ "\r\n"
					+ "Con él conocerás la trágica historia de Ford, el paradero de Blendin, qué es Dimension 52 y "
					+ "cómo atraer a un \"ornitorrinco de ajedrez\"."
					+ "\r\n"
					+ "Pero cuidado: este es un libro deseado por muchas fuerzas oscuras, "
					+ "así que estate alerta si alguien quiere quitártelo (especialmente si tiene ojos amarillos brillantes). "
					+ "Y lo más importante diviértanse."
					+ " Después de todo, no existe un lugar como Gravity Falls. ¿O existe?");
					loja();
		}
		else if(a == 4) {
			System.out.println("El Libro de los Cinco Anillos es hoy un manual para personas exitosas que supieron utilizar las lecciones de "
					+ "Miyamoto Musashi (1584-1645) en las batallas cotidianas. Espadachín "
					+ "imbatible desde los 13 años, el autor resumió en esta obra clásica la experiencia de quienes representaron "
					+ "el apogeo del Bushido, o “camino del guerrero”, el código de conducta y modo de vida de los samuráis que incluye el equilibrio,"
					+ " la sabiduría y honor En los cinco capítulos o tomos del libro Tierra, Agua, Fuego, Viento y Vacío, Musashi trata sobre "
					+ "el liderazgo y los principios vinculados a los conflictos de la existencia humana para convertir al lector en un vencedor."
					+ " Esta edición de Jardim dos Livros cuenta con una exquisita traducción, directa del japonés, del profesor Dr. Wataru Kikuchi, "
					+ "director del Centro de Estudios Japoneses de la USP. Un libro de fotos, pinturas del autor y mapas de batallas del antiguo "
					+ "Japón hacen del libro, además de todo, una obra de arte exquisita, también incluye páginas para apuntes del lector.");
					loja();
		}
		else if(a == 5) {
			System.out.println("Un viaje desde el origen del universo hasta el fin del mundo.\r\n"
					+ "\r\n"
					+ "¿Quién, además de Neil Gaiman, podría convertirse en cómplice de los dioses y usar su habilidad con las palabras para volver a "
					+ "contar las historias de los mitos nórdicos? Los fanáticos y lectores saben que la mitología nórdica siempre ha tenido una gran "
					+ "influencia en el trabajo del autor. Tras servir de inspiración a clásicos como American Gods y Sandman, Gaiman se adentra ahora "
					+ "en el universo de los mitos nórdicos. En la Mitología nórdica acude al origen de los mitos para crear su propia versión, con el "
					+ "inconfundible estilo sagaz e inteligente que impregna toda su obra.\r\n"
					+ "\r\n"
					+ "Fascinado por esta mitología desde niño, el autor compuso una colección de quince cuentos que comienza con "
					+ "la narración del origen del mundo y muestra la conflictiva relación entre dioses, gigantes y enanos, llegando al Ragnarök, "
					+ "el aterrador escenario del apocalipsis que tomará en el fin del mundo. A veces intensas y oscuras, a veces divertidas y heroicas, "
					+ "las historias describen tiempos lejanos en los que las hazañas de los dioses se contaban alrededor de la fogata en noches frías y "
					+ "estrelladas.\r\n"
					+ "\r\n"
					+ "Mitología nórdica es el libro perfecto para cualquiera que quiera descubrir más sobre la mitología escandinava y "
					+ "también para aquellos que quieran descubrir nuevas facetas de estas historias.\r\n"
					+ "\r\n"
					+ "La mitología nórdica es una obra histórica, un valioso registro nuevo de mitos escandinavos poco conocidos.\r\n"
					+ "Los mitos nórdicos se encuentran en obras que se han vuelto bastante populares, como los libros de J.R.R. Tolkien, "
					+ "la serie de televisión Game of Thrones, en los cómics y películas de Marvel. "
					+ "Y, en abril, se estrena la adaptación de American Gods para televisión.");
					loja();
		}
		else if (a == 6) {
			System.out.println("La guerra es un asunto de vital importancia para el estado; el reino de la vida o la muerte; el camino a la "
					+ "supervivencia o la ruina. Es fundamental estudiarlo profundamente \" Sun Tzu");
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
