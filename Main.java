import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        int a = 0;
        Scanner input = new Scanner(System.in);
        English c1 = new English("asd","asd","asd",0,0,0);

<<<<<<< HEAD
        Biblioteca c2 = new Biblioteca("asd","asd","asd",0,0,0);
=======
        Biblioteca c2 = new Biblioteca("asd","asd","asd",20,0,0);
>>>>>>> Vinicius


        Espanol c3 = new Espanol("asd","asd","asd",0,0,1);
       
<<<<<<< HEAD

        System.out.println("_________________________________________________________");
<<<<<<< HEAD
		System.out.println("                      > CADASTRO <   ");
		System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");

        System.out.println("Choose a language|| Escolha um idioma: ");
=======
<<<<<<< HEAD
        System.out.println("Choose a language || Escolha um idioma || Elige un idioma: ");
>>>>>>> Luca
        System.out.println(" ");
        System.out.println("(1)  English     ||   (2) Portugues	||	(3) Espanol		");
=======
		System.out.println("                      > CADASTRO <   "                    );
		System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");

        System.out.println("Choose a language || Escolha um idioma || Elige un idioma: ");
>>>>>>> Vinicius
        System.out.println(" ");
        System.out.println("(1)  English     ||   (2) Portugues	||	(3) Espanhol		");
>>>>>>> 2889a843e1243a3615bf2346d89ffe806a8de50b

        a = input.nextInt();
        if(a  == 1){
            c1.cadastro();
        }
        else if(a == 2){
            c2.login();
        }
        else if(a == 3) {
        	c3.cadastro();
        }

    }
}
