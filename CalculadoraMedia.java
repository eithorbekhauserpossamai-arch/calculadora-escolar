
import java.util.Scanner;

public class CalculadoraMedia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do aluno");
        String nome = sc.nextLine();
        System.out.println("Informe a nota da primeira prova");
        int nota1 = sc.nextInt();
        System.out.println("Informe a nota da segunda prova");
        int nota2 = sc.nextInt();
    }
}
