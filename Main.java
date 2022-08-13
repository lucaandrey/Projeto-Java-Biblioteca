import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        int a = 0;
        Scanner input = new Scanner(System.in);
        English c1 = new English("asd","asd","asd",0,0,"asd");
        Español c3 = new Español("asd","asd","asd",0,0,"asd");
        Biblioteca c2 = new Biblioteca("asd","asd","asd",0,0,"asd");
        System.out.println("Choose a language|| Escolha um idioma: ");
        System.out.println(" ");
        System.out.println("(1)  English     ||   1(2) Portugues	||	(3) Español		");
        a = input.nextInt();
        if(a  == 1){
            c1.cadastro();
        }
        else if(a == 2){
            c2.cadastro();
        }
        else if(a == 3) {
        	c3.cadastro();
        }

    }
}
