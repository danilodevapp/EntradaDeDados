import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("");

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();
        System.out.println("");

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("");

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println("");

        System.out.println("Nome: " + nome + " " + " - Sobrenome: " + sobrenome + " "
                            + " - Idade: " + idade + " " + " - JoãoAltura: " + altura);

    }
}
