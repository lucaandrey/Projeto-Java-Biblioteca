import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Espanol {
	private String nome;
	private String login;
	private String senha;
	private double saldo;
	private int idade;
	private int genero;
	Scanner input = new Scanner(System.in);
	
	public Espanol (String nome, String login, String senha, double saldo, int idade, int genero) {
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
		System.out.println("login: ");
		this.login = input.next();
		System.out.println("contrase�a: ");
		this.senha = input.nextLine();
		
		if(user.equals(this.login) && user.equals(this.login)) {
			visualizar();
		    menu();
		}else {
			System.out.println("Login o contrase�a incorrectos!");
			System.out.println("Int�ntalo de nuevo.");
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
			
			System.out.println(" G�NEROS: ");
			System.out.println("(1)Rom�ntica");
			System.out.println("(2)Ciencia Ficci�n");
			System.out.println("(3)Terror");
			System.out.println("(4)Humor");
			System.out.println("(5)Autoayuda");
			System.out.println("(6)Aventura");
			System.out.println("(7)Infantil");
			op = input.nextInt();
			switch(op) {
			case 0: deposito1(0);
			break;
			case 1: System.out.println("Elige una opci�n: ");
			System.out.println("Rom�tica: ");
			System.out.println("(1)Romeo y Julieta: ");
			System.out.println("(2)El guardian entre el Centeno: ");
			System.out.println("(3)La peste: ");
			System.out.println("(4)El amor en los tiempos del c�lera: ");
			System.out.println("(5)Ciudades de papel: ");
			System.out.println("(6)Dom Casmurro: ");
			escolha=input.nextInt();
			
			if(escolha == 1) {
				System.out.println("Sinopsis: ");
				System.out.println("El amor se introduce en la vida de Romeo y Julieta de forma traicionera "
						+ "los dos se enamoran al instante, en una fiesta "
						+ "a baile de m�scaras -, sin darse cuenta de las identidades de los dem�s. "
						+ "�l es hijo de los Montescos, y ella de los Capuletos, dos de los m�s poderosos "
						+ "Familias Verona, enemigas entre s�. ");
				loja();
				}
			else if(escolha ==2) {
				System.out.println("Sinopsis: ");
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
			else if(escolha == 3) {
				System.out.println("Sinopsis: ");
				System.out.println("En la ma�ana del 16 de abril de 1940, el Dr. Bernard Rieux deja su "
						+ "oficina y tropieza con un rat�n muerto. "
						+ "Esta es la primera se�al de una epidemia de peste que en "
						+ "pronto se apodera de toda la ciudad de Or�n en Argelia."
						+ " Sujeto a cuarentena, se convierte en un territorio irrespirable y sus habitantes son "
						+ "impulsado a estados de sufrimiento, de locura, pero tambi�n de compasi�n de proporciones inconmensurables.");
				loja();
			}
			else if(escolha == 4) {
				System.out.println("Sinopsis: ");
				System.out.println("Florentino Ariza nunca olvid� a Fermina, su primer amor. "
						+ "�l esper� casi toda su vida por ella, y ella se cas� con otro."
						+ " Ahora, 51 a�os despu�s, su esposo muere y finalmente tiene la oportunidad de recuperarla. ");
				loja();
			}
			else if(escolha ==5) {
				System.out.println("Sinopsis: ");
				System.out.println("Es Navidad, y Holden Caulfield se ha hecho expulsar de otra escuela. Con unos cuantos d�lares de la venta de una m�quina de escribir y "
						+ "llevando tu infalible gorra roja de cazador, "
						+ "El joven hace un plan incierto: tomar un tren a Nueva York y pasear por la gran ciudad durante tres d�as, "
						+ "aretrasar el regreso a casa de los padres hasta que reciban la noticia de la expulsi�n por parte de alguien del colegio. ");
						loja();
			}
			else if(escolha == 6) {
				System.out.println("Sinopsis: ");
				System.out.println("Dom Casmurro cuenta la historia de Bento Santiago (Bentinho), "
						+ "apodado Dom Casmurro por ser callado e introvertido. "
						+ "Siendo adolescente, se enamora de Capitu, abandona el seminario y,"
						+ "con �l, los planes trazados por su madre, do�a Gl�ria, para que �l fuera sacerdote. ");
				loja();
			}
			break; 
			case 2: 
				System.out.println("Elige una opci�n: ");
				System.out.println("Ciencia Ficci�n: ");
				System.out.println("(1)Outsider: ");
				System.out.println("(2)Drácula - Dark Edition: ");
				System.out.println("(3)O diário perdido de gravity falls: ");
				System.out.println("(4)O livro dos cinco anéis");
				System.out.println("(5)Mitologia Nórdica: ");
				System.out.println("(6)A arte da guerra: ");
				System.out.println("Escolha uma opcao: ");													
				escolha=input.nextInt();
			
		if(escolha == 1) {
			System.out.println("Sinopsis: ");
			System.out.println("Un crimen indescriptible. Una investigaci�n inexplicable. Una de las historias de Stephen King m�s "
					+ "inquietantes de los �ltimos tiempos. "
					+ "El cuerpo de un ni�o de once a�os se encuentra abandonado en Flint City Park, brutalmente asesinado. "
					+ "Los testigos y las huellas dactilares se�alan al delincuente como una de las figuras m�s conocidas de "
					+ "la ciudad: Terry Maitland, entrenador de b�isbol de las ligas menores, profesor de ingl�s, casado y padre de dos hijos. "
					+ "El detective Ralph Anderson no duda en ordenar un arresto r�pido y muy p�blico, dejando que todo el "
					+ "pueblo sepa en poco tiempo que el Entrenador T es el principal sospechoso del crimen. Maitland tiene una coartada, "
					+ "pero Anderson y el fiscal de distrito pronto tienen muestras de ADN para respaldar el cargo. El caso parece resuelto. "
					+ "Pero a medida que avanza la investigaci�n, la historia se convierte en una monta�a rusa, llena de tensi�n y suspenso. "
					+ "Terry Maitland parece una buena persona, pero �eso es solo una m�scara? la respuesta aterradora es "
					+ "lo que hace de esta una de las historias m�s inquietantes de Stephen King.\r\n"
					+ "");
					loja();
		}
		else if(escolha == 2) {
			System.out.println("Sinopsis: ");
			System.out.println("Dr�cula, un cl�sico que a�n corre caliente en las venas de innumerables generaciones"
					+ " de lectores en todo el mundo y la narrativa vamp�rica m�s c�lebre, contin�a trascendiendo "
					+ "las fronteras del tiempo, el espacio, la historia y la memoria.La novela epistolar "
					+ "moviliza a lectores y estudiosos, confirmando el vigor perenne. de un �rbol cuyas s�lidas ra�ces dan cuenta "
					+ "de la vitalidad de sus ramificaciones."
					+ " Aunque el famoso conde no fue el primer vampiro literario, sin duda es el m�s popular, aspirado y adaptado a "
					+ "infinidad de universos: "
					+ "teatro, cine, historietas, series y juguetes, el semblante es reconocido incluso por quienes nunca han le�do la novela. "
					+ "Est� en todas partes. "
					+ "La obra atemporal de Bram Stoker narra, a trav�s de fragmentos de cartas, diarios y reportajes period�sticos, "
					+ "la historia de humanos "
					+ "que luchan por sobrevivir a las embestidas del vampiro Dr�cula. El grupo formado por Jonathan Harker, "
					+ "Mina Harker, Dr. Van Helsing y el Dr. Seward "
					+ "intenta evitar que la vil criatura se alimente de sangre humana en el Londres victoriano, a finales del siglo 19. "
					+ "Un cl�sico absoluto del terror,"
					+ " Bram Stoker define en Dr�cula la forma en que entendemos y pensamos sobre los vampiros en la actualidad."
					+ " M�s que eso, lleva a este monstruo "
					+ "al centro del escenario de la cultura pop de nuestro siglo e inmortaliza al villano de maneras refinadas y comportamiento "
					+ "sanguinario. "
					+ "DOS EDICIONES PARA UN ROMANCE �NICO No es ahora que los lectores claman por una edici�n de Dracula by the DarkSide. � "
					+ "Libros para honrar"
					+ " el legado del Maestro Bram Stoker. Una obra tan grande como esta se publicar� en dos versiones, para que ning�n vampiro pueda"
					+ " criticarla: PRIMERA EDICI�N, con la ic�nica tapa amarilla de la primera publicaci�n, en 1897, una edici�n in�dita en el"
					+ " mercado brasile�o que inmortaliza el brillo y encanto del sol, algo inalcanzable frente a todo el dolor de la eternidad;"
					+ " y la EDICI�N OSCURA, dedicada a lectores de coraz�n oscuro, de coraz�n oscuro. En su interior llevan "
					+ "el mismo contenido sanguinolento; por fuera demuestran la vida y la belleza de un cl�sico inmortal Para hacer temblar a los "
					+ "lectores, "
					+ "Marcia Heloisa firma la traducci�n y la introducci�n de Dr�cula. Y como la sangre tiene poder, el descendiente directo del autor, "
					+ "Dacre Stoker, escribe la preciosa presentaci�n de esta edici�n Carlos Primati y Marcia Heloisa dan sus aportes a la criatura perpetua. "
					+ "El lector encontrar� textos de apoyo que relatan la relaci�n entre la Transilvania real y la inmortalizada en el libro, "
					+ "as� como la influencia de los vampiros en la cultura pop mundial. Y como DarkSide� Books sabe lo que hace latir m�s r�pido "
					+ "el coraz�n de los lectores vivos de la editorial, tambi�n presenta el cuento �Dracula's Guest�, que formaba parte del texto de Stoker, "
					+ "pero fue eliminado de la primera publicaci�n, dise�ado especialmente para darksiders que"
					+ " sepa que hay una raz�n para que las cosas sean como son, est� adornada con las bellas y poderosas im�genes de Samuel Casal, "
					+ "el galardonado dibujante e ilustrador brasile�o, que ha realizado una impresionante reinterpretaci�n de personajes inmortales. "
					+ "consolida con cada maestro que entra en su casa, rindiendo homenaje a "
					+ "los grandes nombres de la literatura que han provocado indecibles pesadillas a los lectores, d�cada tras d�cada. "
					+ "Para perpetuar la experiencia, siempre trae ilustradores y traductores invitados que respiran y conocen profundamente las obras originales. "
					+ "De hincha a hincha. Hasta el final D�JALO ENTRAR EN TU COLECCI�N Y CONOCE LA PRIMERA EDICI�N");	
					loja();		
		}
		else if(escolha == 3) {
			System.out.println("Sinopsis: ");
			System.out.println("Tienes en tus manos el codiciado diario del autor de la serie Gravity Falls, "
					+ "un tesoro sin due�o de 288 p�ginas a todo color de secretos, "
					+ "monstruos y misterios nunca antes revelados de la tranquila ciudad del abuelo Stan.\r\n"
					+ "\r\n"
					+ "Con �l conocer�s la tr�gica historia de Ford, el paradero de Blendin, qu� es Dimension 52 y "
					+ "c�mo atraer a un \"ornitorrinco de ajedrez\"."
					+ "\r\n"
					+ "Pero cuidado: este es un libro deseado por muchas fuerzas oscuras, "
					+ "as� que estate alerta si alguien quiere quit�rtelo (especialmente si tiene ojos amarillos brillantes). "
					+ "Y lo m�s importante divi�rtanse."
					+ " Despu�s de todo, no existe un lugar como Gravity Falls. �O existe?");
					loja();
		}
		else if(escolha == 4) {
			System.out.println("Sinopsis: ");
			System.out.println("El Libro de los Cinco Anillos es hoy un manual para personas exitosas que supieron utilizar las lecciones de "
					+ "Miyamoto Musashi (1584-1645) en las batallas cotidianas. Espadach�n "
					+ "imbatible desde los 13 a�os, el autor resumi� en esta obra cl�sica la experiencia de quienes representaron "
					+ "el apogeo del Bushido, o �camino del guerrero�, el c�digo de conducta y modo de vida de los samur�is que incluye el equilibrio,"
					+ " la sabidur�a y honor En los cinco cap�tulos o tomos del libro Tierra, Agua, Fuego, Viento y Vac�o, Musashi trata sobre "
					+ "el liderazgo y los principios vinculados a los conflictos de la existencia humana para convertir al lector en un vencedor."
					+ " Esta edici�n de Jardim dos Livros cuenta con una exquisita traducci�n, directa del japon�s, del profesor Dr. Wataru Kikuchi, "
					+ "director del Centro de Estudios Japoneses de la USP. Un libro de fotos, pinturas del autor y mapas de batallas del antiguo "
					+ "Jap�n hacen del libro, adem�s de todo, una obra de arte exquisita, tambi�n incluye p�ginas para apuntes del lector.");
					loja();
		}
		else if(escolha == 5) {
			System.out.println("Sinopsis: ");
			System.out.println("Un viaje desde el origen del universo hasta el fin del mundo.\r\n"
					+ "\r\n"
					+ "�Qui�n, adem�s de Neil Gaiman, podr�a convertirse en c�mplice de los dioses y usar su habilidad con las palabras para volver a "
					+ "contar las historias de los mitos n�rdicos? Los fan�ticos y lectores saben que la mitolog�a n�rdica siempre ha tenido una gran "
					+ "influencia en el trabajo del autor. Tras servir de inspiraci�n a cl�sicos como American Gods y Sandman, Gaiman se adentra ahora "
					+ "en el universo de los mitos n�rdicos. En la Mitolog�a n�rdica acude al origen de los mitos para crear su propia versi�n, con el "
					+ "inconfundible estilo sagaz e inteligente que impregna toda su obra.\r\n"
					+ "\r\n"
					+ "Fascinado por esta mitolog�a desde ni�o, el autor compuso una colecci�n de quince cuentos que comienza con "
					+ "la narraci�n del origen del mundo y muestra la conflictiva relaci�n entre dioses, gigantes y enanos, llegando al Ragnar�k, "
					+ "el aterrador escenario del apocalipsis que tomar� en el fin del mundo. A veces intensas y oscuras, a veces divertidas y heroicas, "
					+ "las historias describen tiempos lejanos en los que las haza�as de los dioses se contaban alrededor de la fogata en noches fr�as y "
					+ "estrelladas.\r\n"
					+ "\r\n"
					+ "Mitolog�a n�rdica es el libro perfecto para cualquiera que quiera descubrir m�s sobre la mitolog�a escandinava y "
					+ "tambi�n para aquellos que quieran descubrir nuevas facetas de estas historias.\r\n"
					+ "\r\n"
					+ "La mitolog�a n�rdica es una obra hist�rica, un valioso registro nuevo de mitos escandinavos poco conocidos.\r\n"
					+ "Los mitos n�rdicos se encuentran en obras que se han vuelto bastante populares, como los libros de J.R.R. Tolkien, "
					+ "la serie de televisi�n Game of Thrones, en los c�mics y pel�culas de Marvel. "
					+ "Y, en abril, se estrena la adaptaci�n de American Gods para televisi�n.");
					loja();
		}
		else if (escolha == 6) {
			System.out.println("Sinopsis: ");
			System.out.println("La guerra es un asunto de vital importancia para el estado; el reino de la vida o la muerte; el camino a la "
					+ "supervivencia o la ruina. Es fundamental estudiarlo profundamente \" Sun Tzu");
			loja();
		}
		break;
			case 3: System.out.println(" Elige una opci�n: ");
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
						+ "as� como un gato negro se cruza en tu camino. "
						+ "Todo lo que ahora conocemos como terror empez� a ganar "
						+ "forma en la obra de Edgar Allan Poe.");
				loja();
			}else if (escolha == 2) {
				System.out.println("Sinopsis: ");
				System.out.println("Carrie es una adolescente t�mida y solitaria. A los 16 a�os, est� completamente dominada por su madre, "
						+ "una fan�tica religiosa que reprime todos los deseos y descubrimientos normales de los j�venes de su edad. "
						+ "Para Carrie, todo es pecado. Vivir es enfrentarse cada d�a al terrible peso de la culpa.");
				loja();
			}else if (escolha == 3) {
				System.out.println("Sinopsis: ");
				System.out.println("El brillante y poco ortodoxo doctor Victor Frankenstein trabaja en la "
						+ "creaci�n de un monstruo con diferentes partes del cuerpo humano. "
						+ "Tras ser rechazada por el creador, la criatura escapa y comienza a actuar con una violenta sed de venganza.");
				loja();
			}else if (escolha == 4) {
				System.out.println("Sinopsis: ");
				System.out.println("Ese verano, se enfrentaron por primera vez a The Thing, un ser sobrenatural malvado que dej� terribles "
						+ "manchas de sangre en Derry. "
						+ "Casi treinta a�os despu�s, los amigos se reencuentran. "
						+ "Una nueva ola de terror se ha apoderado del peque�o pueblo, y solo ellos podr�n enfrentarse a la Cosa. El tiempo es corto.");
				loja();
			}else if (escolha == 5) {
				System.out.println("Sinopsis: ");
				System.out.println("Jack Campbell, profesor de nataci�n, y su peque�a hija Emily deciden pasar un tiempo juntos en una casa del "
						+ "lago para superar la muerte de Hannah, la ex mujer de Jack y madre de Emily. Pero poco despu�s de llegar a la propiedad, "
						+ "Emily afirma haber visto a una chica misteriosa en el bosque, y en el s�tano de la casa, Jack encuentra dibujos "
						+ "antiguos que parecen haber sido hechos por un ni�o. Los dibujos parecen representar a una peque�a familia feliz que "
						+ "ha sufrido una gran tragedia. �Qu� pas� con esta familia? �La chica del bosque es real? Jack y\r\n"
						+ "�Emily vincul�ndose a s� misma con las desapariciones que tuvieron lugar en esa propiedad hace muchos a�os?\r\n"
						+ "Mientras trata de encontrar respuestas, Jack debe salvar a su hija de un mundo helado y "
						+ "oscuro y de los peligros inimaginables que debe enfrentar.");
				loja();
			}else if (escolha == 6) {
				System.out.println("Sinopsis: ");
				System.out.println("Emmy siempre supo que el bosque alrededor de su casa estaba lleno de fantasmas y monstruos. "
						+ "Sin embargo, en la v�spera de su decimoctavo cumplea�os, descubre que est� conectada con estas criaturas, "
						+ "y con la tierra misma, de maneras que nunca pens� que fueran posibles. Espera a la sombra del roble retorcido y "
						+ "escucha los balidos de las cabras. Cursed County: Witches & Hauntings es el primero de una serie de ocho vol�menes que "
						+ "DarkSide Books publicar� en asociaci�n con Macabra Filmes durante los pr�ximos meses, "
						+ "y llega a los lectores en una edici�n sorprendente y con un tratamiento especial alucinante. aliento. "
						+ "�Est�s listo para ver a los corderos convertirse en lobos?");
				loja();
			}
			break;
		
			}
		}
			
			public void deposito(double depTotal) {
				int op = 0;
				System.out.println("Bienvenido a la secci�n de compras!");
				System.out.println("�Desea continuar con el dep�sito? (1)S� (2)Volvel al men�");
				op = input.nextInt();
				if (op == 1){
					System.out.println("Haga un dep�sito: ");
					depTotal = input.nextDouble();
					this.saldo += depTotal;
					loja();
				} else menu();
				
			}
			
			public void loja() {
				int op =0;
				
				System.out.println("Elige una opci�n: ");
				System.out.println("(1)Comprar");
				System.out.println("(2)Alquilar");
				System.out.println("(3)Volver al men�");
				op = input.nextInt();
				if(op == 1) {
					
					System.out.println("Saldo disponible: "+saldo);
					System.out.println("El libro cuesta R$"+precoLivro.get(escolha - 1));
					System.out.println("�Desea continuar con la compra? (1)S� (2)No");
					
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
							System.out.println("\t*   Compra realizada con �xito!!!");
							System.out.println("\t********************************************");
							
							System.out.println("                                              ");
							System.out.println("   Nuevo saldo: R$"+this.saldo);
							System.out.println("����������������������������������������������������������������������");
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
				System.out.println("�Est�s seguro de continuar con la operaci�n? (1)S� (2)NO");
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
					System.out.println("\t* Operaci�n realizada com �xito!!! *");
					System.out.println("\t************************************");
					System.out.println("\nSu nuevo saldo es: "+saldo+"\n");
					System.out.println("����������������������������������������������������������������������");
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
				System.out.println("\nElina una contrase�a: ");
				password = input.nextLine();
				System.out.println("\n�Cu�ntos a�os tiene usted?: ");
				this.idade = input.nextInt();
				System.out.println("\nInforma su g�nero (1) Masculino || (2)Femenino || (3) Otres: ");
				this.genero = input.nextInt();
				System.out.println("\nHaga un dep�sito inicial: ");
				this.saldo += input.nextInt();
				System.out.println("�REGISTRO COMPLETADO CON �XITO! �POR FAVOR INICIE SESI�N PARA CONTINUAR!");
				login();
				}
				public void visualizar(){

				System.out.println("*************************************************************");
				System.out.println("\t           BIENVENIDO "+nome);
				System.out.println("\n\t          �Es un placer tenerlo aqu�!");
				System.out.println("\n\t     Usted posue: "+saldo+" de Saldo. �Disfrutalo! ");
				System.out.println("*************************************************************");
			}
			
			 public void visualizar2(){
				System.out.println("                           MEN�                              ");
				System.out.println("                          ������                            ");
				System.out.println("  �El 30% de nuestras ganancias van a organizaciones ben�ficas!");
				System.out.println("\t Adem�s de alimentar tus conocimientos, �alimenta vidas! \n ");
				System.out.println("                        __________         ");
				System.out.println("                       | CAT�LOGO |        ");
				System.out.println("                        ����������         ");
			}
				public void visualizar3(){


				}
				public void deposito1(double depTotal) {
					System.out.println("�Bienvenido a la sesi�n de compras!");
					System.out.println("Haga un dep�sito: ");
					depTotal = input.nextDouble();
					this.saldo += depTotal;
					System.out.println("Dep�sito de R$"+saldo+" realizado con �xito!");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					menu();
				}
		}
	
	