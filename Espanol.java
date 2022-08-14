import java.util.ArrayList;
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
		String a,b;
		System.out.println("login: ");
		a = input.nextLine();
		System.out.println("contraseña: ");
		b = input.nextLine();
		
		if(a.equals(this.login) && b.equals(this.login)) {
			visualizar();
		    menu();
		}else {
			System.out.println("Login o contraseña incorrectos!");
			System.out.println("Inténtalo de nuevo.");
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
				e.printStackTrace();
			}
			
			System.out.println(" Gï¿½NEROS: ");
			System.out.println("(1)Romï¿½ntica");
			System.out.println("(2)Ciencia Ficciï¿½n");
			System.out.println("(3)Terror");
			System.out.println("(4)Humor");
			System.out.println("(5)Autoayuda");
			System.out.println("(6)Aventura");
			System.out.println("(7)Infantil");
			op = input.nextInt();
			switch(op) {
			case 0: deposito1(0);
			break;
			case 1: System.out.println("Elige una opciï¿½n: ");
			System.out.println("Romática: ");
			System.out.println("(1)Romeo y Julieta: ");
			System.out.println("(2)El guardian entre el Centeno: ");
			System.out.println("(3)La peste: ");
			System.out.println("(4)El amor en los tiempos del cï¿½lera: ");
			System.out.println("(5)Ciudades de papel: ");
			System.out.println("(6)Dom Casmurro: ");
			escolha=input.nextInt();
			
			if(escolha == 1) {
				System.out.println("Sinopsis: ");
				System.out.println("El amor se introduce en la vida de Romeo y Julieta de forma traicionera "
						+ "los dos se enamoran al instante, en una fiesta "
						+ "a baile de mï¿½scaras -, sin darse cuenta de las identidades de los demï¿½s. "
						+ "ï¿½l es hijo de los Montescos, y ella de los Capuletos, dos de los mï¿½s poderosos "
						+ "Familias Verona, enemigas entre sï¿½. ");
				loja();
				}
			else if(escolha ==2) {
				System.out.println("Sinopsis: ");
				System.out.println("Es Navidad y Holden Caulfield ha logrado que lo echen de otra escuela. Con algï¿½n cambio de la venta de una mï¿½quina de escribir y \"\r\n"
						+ "usando su infalible gorra roja de cazador,"
						+ "el joven elabora un plan incierto: tomar un tren a Nueva York y vagar durante tres dï¿½as por la gran ciudad."
						+ " Aplazar el regreso a casa de los padres hasta que reciban la noticia de la expulsiï¿½n por parte de alguien del colegio."
						+ " Tus dï¿½as y noches estarï¿½n marcados por encuentros confusos y, en ocasiones, conmovedores "
						+ "con extraï¿½os, peleas con los tipos mï¿½s malos, citas con ex novias, visitas con tu hermana Phoebe "
						+ "la ï¿½nica criatura en este mundo que parece entenderlo "
						+ "por las dudas que te consumirï¿½n durante tu estancia, "
						+ "entre ellos una pregunta recurrente: despuï¿½s de todo, ï¿½adï¿½nde van los patos de Central Park en invierno? ");
				loja();
			}
			else if(escolha == 3) {
				System.out.println("Sinopsis: ");
				System.out.println("En la maï¿½ana del 16 de abril de 1940, el Dr. Bernard Rieux deja su "
						+ "oficina y tropieza con un ratï¿½n muerto. "
						+ "Esta es la primera seï¿½al de una epidemia de peste que en "
						+ "pronto se apodera de toda la ciudad de Orï¿½n en Argelia."
						+ " Sujeto a cuarentena, se convierte en un territorio irrespirable y sus habitantes son "
						+ "impulsado a estados de sufrimiento, de locura, pero tambiï¿½n de compasiï¿½n de proporciones inconmensurables.");
				loja();
			}
			else if(escolha == 4) {
				System.out.println("Sinopsis: ");
				System.out.println("Florentino Ariza nunca olvidï¿½ a Fermina, su primer amor. "
						+ "ï¿½l esperï¿½ casi toda su vida por ella, y ella se casï¿½ con otro."
						+ " Ahora, 51 aï¿½os despuï¿½s, su esposo muere y finalmente tiene la oportunidad de recuperarla. ");
				loja();
			}
			else if(escolha ==5) {
				System.out.println("Sinopsis: ");
				System.out.println("Es Navidad, y Holden Caulfield se ha hecho expulsar de otra escuela. Con unos cuantos dï¿½lares de la venta de una mï¿½quina de escribir y "
						+ "llevando tu infalible gorra roja de cazador, "
						+ "El joven hace un plan incierto: tomar un tren a Nueva York y pasear por la gran ciudad durante tres dï¿½as, "
						+ "aretrasar el regreso a casa de los padres hasta que reciban la noticia de la expulsiï¿½n por parte de alguien del colegio. ");
						loja();
			}
			else if(escolha == 6) {
				System.out.println("Sinopsis: ");
				System.out.println("Dom Casmurro cuenta la historia de Bento Santiago (Bentinho), "
						+ "apodado Dom Casmurro por ser callado e introvertido. "
						+ "Siendo adolescente, se enamora de Capitu, abandona el seminario y,"
						+ "con ï¿½l, los planes trazados por su madre, doï¿½a Glï¿½ria, para que ï¿½l fuera sacerdote. ");
				loja();
			}
			break; 
			case 2: 
				System.out.println("Elige una opción: ");
				System.out.println("Ciencia Ficción: ");
				System.out.println("(1)Outsider: ");
				System.out.println("(2)DrÃ¡cula - Dark Edition: ");
				System.out.println("(3)O diÃ¡rio perdido de gravity falls: ");
				System.out.println("(4)O livro dos cinco anÃ©is");
				System.out.println("(5)Mitologia NÃ³rdica: ");
				System.out.println("(6)A arte da guerra: ");
				System.out.println("Escolha uma opcao: ");													
				escolha=input.nextInt();
			
		if(escolha == 1) {
			System.out.println("Sinopsis: ");
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
		else if(escolha == 2) {
			System.out.println("Sinopsis: ");
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
		else if(escolha == 3) {
			System.out.println("Sinopsis: ");
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
		else if(escolha == 4) {
			System.out.println("Sinopsis: ");
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
		else if(escolha == 5) {
			System.out.println("Sinopsis: ");
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
		else if (escolha == 6) {
			System.out.println("Sinopsis: ");
			System.out.println("La guerra es un asunto de vital importancia para el estado; el reino de la vida o la muerte; el camino a la "
					+ "supervivencia o la ruina. Es fundamental estudiarlo profundamente \" Sun Tzu");
			loja();
		}
		break;
			case 3: System.out.println(" Elige una opción: ");
			System.out.println("Terror: ");
			System.out.println("(1):Miedo - Edgar Allan Poe: ");
			System.out.println("(2)Carrie - Stepen King: ");
			System.out.println("(3)Frankenstein - Mary Shelley: ");
			System.out.println("(4)It (eso) - Stephen King: ");
			System.out.println("(5)El misterio de la casa del lago - Diego Cassiolato: ");
			System.out.println("(6)Condado maldito: brujas y fantasmas: ");
			escolha=input.nextInt();
			
			if (escolha == 1){
				System.out.println("Sinopsis: ");
				System.out.println("Las alas de un cuervo se mezclan con la oscuridad."
						+ " La vieja casa en ruinas se asoma con ventanas que parecen ojos. "
						+ "Juras escuchar la voz de alguien que ya se fue para el otro lado, "
						+ "así como un gato negro se cruza en tu camino. "
						+ "Todo lo que ahora conocemos como terror empezó a ganar "
						+ "forma en la obra de Edgar Allan Poe.");
				loja();
			}else if (escolha == 2) {
				System.out.println("Sinopsis: ");
				System.out.println("Carrie es una adolescente tímida y solitaria. A los 16 años, está completamente dominada por su madre, "
						+ "una fanática religiosa que reprime todos los deseos y descubrimientos normales de los jóvenes de su edad. "
						+ "Para Carrie, todo es pecado. Vivir es enfrentarse cada día al terrible peso de la culpa.");
				loja();
			}else if (escolha == 3) {
				System.out.println("Sinopsis: ");
				System.out.println("El brillante y poco ortodoxo doctor Victor Frankenstein trabaja en la "
						+ "creación de un monstruo con diferentes partes del cuerpo humano. "
						+ "Tras ser rechazada por el creador, la criatura escapa y comienza a actuar con una violenta sed de venganza.");
				loja();
			}else if (escolha == 4) {
				System.out.println("Sinopsis: ");
				System.out.println("Ese verano, se enfrentaron por primera vez a The Thing, un ser sobrenatural malvado que dejó terribles "
						+ "manchas de sangre en Derry. "
						+ "Casi treinta años después, los amigos se reencuentran. "
						+ "Una nueva ola de terror se ha apoderado del pequeño pueblo, y solo ellos podrán enfrentarse a la Cosa. El tiempo es corto.");
				loja();
			}else if (escolha == 5) {
				System.out.println("Sinopsis: ");
				System.out.println("Jack Campbell, profesor de natación, y su pequeña hija Emily deciden pasar un tiempo juntos en una casa del "
						+ "lago para superar la muerte de Hannah, la ex mujer de Jack y madre de Emily. Pero poco después de llegar a la propiedad, "
						+ "Emily afirma haber visto a una chica misteriosa en el bosque, y en el sótano de la casa, Jack encuentra dibujos "
						+ "antiguos que parecen haber sido hechos por un niño. Los dibujos parecen representar a una pequeña familia feliz que "
						+ "ha sufrido una gran tragedia. ¿Qué pasó con esta familia? ¿La chica del bosque es real? Jack y\r\n"
						+ "¿Emily vinculándose a sí misma con las desapariciones que tuvieron lugar en esa propiedad hace muchos años?\r\n"
						+ "Mientras trata de encontrar respuestas, Jack debe salvar a su hija de un mundo helado y "
						+ "oscuro y de los peligros inimaginables que debe enfrentar.");
				loja();
			}else if (escolha == 6) {
				System.out.println("Sinopsis: ");
				System.out.println("Emmy siempre supo que el bosque alrededor de su casa estaba lleno de fantasmas y monstruos. "
						+ "Sin embargo, en la víspera de su decimoctavo cumpleaños, descubre que está conectada con estas criaturas, "
						+ "y con la tierra misma, de maneras que nunca pensó que fueran posibles. Espera a la sombra del roble retorcido y "
						+ "escucha los balidos de las cabras. Cursed County: Witches & Hauntings es el primero de una serie de ocho volúmenes que "
						+ "DarkSide Books publicará en asociación con Macabra Filmes durante los próximos meses, "
						+ "y llega a los lectores en una edición sorprendente y con un tratamiento especial alucinante. aliento. "
						+ "¿Estás listo para ver a los corderos convertirse en lobos?");
				loja();
			}
			break;
		
			}
		}
			
			public void deposito(double depTotal) {
				int op = 0;
				System.out.println("Bienvenido a la secciï¿½n de compras!");
				System.out.println("¿Desea continuar con el depósito? (1)Sí (2)Volvel al menú");
				op = input.nextInt();
				if (op == 1){
					System.out.println("Haga un depósito: ");
					depTotal = input.nextDouble();
					this.saldo += depTotal;
					loja();
				} else menu();
				
			}
			
			public void loja() {
				int op =0;
				
				System.out.println("Elige una opciï¿½n: ");
				System.out.println("(1)Comprar");
				System.out.println("(2)Alquilar");
				System.out.println("(3)Volver al menï¿½");
				op = input.nextInt();
				if(op == 1) {
					
					System.out.println("Saldo disponible: "+saldo);
					System.out.println("El libro cuesta R$"+precoLivro.get(escolha - 1));
					System.out.println("¿Desea continuar con la compra? (1)Sí (2)No");
					
					int decida = input.nextInt();
					if(decida == 1) {
						if(this.saldo - precoLivro.get(escolha -1)<0) {
							System.out.println("Saldo insuficiente!");
							System.out.println("Ha sido redirigido a nuestra tienda.");
							System.err.println("                                             ");
									deposito(0);
						}else if(this.saldo >= precoLivro.get(escolha-1)) {
							this.saldo -= precoLivro.get(escolha-1);
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							System.out.println("\t********************************************");
							System.out.println("\t*   Compra realizada con éxito!!!");
							System.out.println("\t********************************************");
							
							System.out.println("                                              ");
							System.out.println("   Nuevo saldo: R$"+this.saldo);
							System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
							System.out.println("                             ");
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
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
				System.out.println("¿Estás seguro de continuar con la operación? (1)SÍ (2)NO");
				System.out.println("\nSaldo disponible: "+saldo);
				decida = input.nextInt();
				if(decida==1 ){int aluguel = 5;
					if(saldo - aluguel <0){
						System.out.println("\nSaldo insuficiente!");
						System.out.println("\nHa sido redirigido a nuestra tienda.");
						System.err.println("                                          ");
						deposito(0);
					}
					else if (saldo >= aluguel){
					saldo -=aluguel;
					System.out.println("\nEl alquiler del libro cuesta: "+aluguel);
					System.out.println("\t************************************");
					System.out.println("\t* Operación realizada com éxito!!! *");
					System.out.println("\t************************************");
					System.out.println("\nSu nuevo saldo es: "+saldo+"\n");
					System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
					System.out.println("                             ");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
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
				
				System.out.println("\nIntroduzca su nombre: ");
				this.nome = input.nextLine();
				System.out.println("\nElija un nombre de usuario: ");
				user = input.nextLine();
				System.out.println("\nElina una contraseña: ");
				password = input.nextLine();
				System.out.println("\n¿Cuántos años tiene usted?: ");
				this.idade = input.nextInt();
				System.out.println("\nInforma su género (1) Masculino || (2)Femenino || (3) Otres: ");
				this.genero = input.nextInt();
				System.out.println("\nHaga un depósito inicial: ");
				this.saldo += input.nextInt();
				System.out.println("¡REGISTRO COMPLETADO CON ÉXITO! ¡POR FAVOR INICIE SESIÓN PARA CONTINUAR!");
				login();
				}
				public void visualizar(){

				System.out.println("*************************************************************");
				System.out.println("\t           BIENVENIDO "+nome);
				System.out.println("\n\t          ¡Es un placer tenerlo aquí!");
				System.out.println("\n\t     Usted posue: "+saldo+" de Saldo. ¡Disfrutalo! ");
				System.out.println("*************************************************************");
			}
			
			 public void visualizar2(){
				System.out.println("                           MENÚ                              ");
				System.out.println("                          ¨¨¨¨¨¨                            ");
				System.out.println("  ¡El 30% de nuestras ganancias van a organizaciones benéficas!");
				System.out.println("\t Además de alimentar tus conocimientos, ¡alimenta vidas! \n ");
				System.out.println("                        __________         ");
				System.out.println("                       | CATÁLOGO |        ");
				System.out.println("                        ¨¨¨¨¨¨¨¨¨¨         ");
			}
				public void visualizar3(){


				}
				public void deposito1(double depTotal) {
					System.out.println("¡Bienvenido a la sesión de compras!");
					System.out.println("Haga un depósito: ");
					depTotal = input.nextDouble();
					this.saldo += depTotal;
					System.out.println("Depósito de R$"+saldo+" realizado con éxito!");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					menu();
				}
		}
	
	