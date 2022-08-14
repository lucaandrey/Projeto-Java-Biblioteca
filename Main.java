import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        int a = 0;
        Scanner input = new Scanner(System.in);
        English c1 = new English("asd","asd","asd",0,0,0);


        Biblioteca c2 = new Biblioteca("asd","asd","asd",0,0,0);

        Biblioteca c2 = new Biblioteca("asd","asd","asd",20,0,0);



        Espanol c3 = new Espanol("asd","asd","asd",0,0,1);
       

        System.out.println("_________________________________________________________");

		System.out.println("                      > CADASTRO <   ");
		System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");

        System.out.println("Choose a language|| Escolha um idioma: ");

		System.out.println("                      > CADASTRO <   "                    );
		System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");

        System.out.println("Choose a language || Escolha um idioma || Elige un idioma: ");

        System.out.println(" ");
        System.out.println("(1)  English     ||   (2) Portugues	||	(3) Espanhol		");

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
