import java.util.Scanner;

public class EntradadeDados {
    public static void main (String[] args) {

    Scanner leitor = new Scanner(System.in);
    system.out.print("Digite uma frase: ");
    String frase = leitor.nextline();

    System.out.println("Digite se nome:");
    String nome = leitor.nextline();

    System.out.print("Digite sua idade: ");
    int idade = leitor.nextInt();
    System.out.print("Frase do dia: "+ frase+" -"+nome+"  idade: "+idade);

    leitor.close();
    }
}