import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        int a = 0;
        Scanner input = new Scanner(System.in);
        English c1 = new English("asd","asd","asd",0,0,"asd");


        Biblioteca c2 = new Biblioteca("asd","asd","asd",0,0,0);
        System.out.println("___________________________________________");
		System.out.println("               > CADASTRO <   ");
		System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println("Choose a language|| Escolha um idioma: ");
        System.out.println(" ");
        System.out.println("(1)  English     ||    (2) Portugues");
        a = input.nextInt();
        if(a  == 1){
            c1.cadastro();
        }
        else if(a == 2){
            c2.cadastro();
            

        }

    }
}
