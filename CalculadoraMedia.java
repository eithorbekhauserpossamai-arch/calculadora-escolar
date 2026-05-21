import java.util.Scanner;

public class CalculadoraMedia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Informe a nota da primeira prova: ");
        float nota1 = sc.nextFloat();

        System.out.print("Informe a nota da segunda prova: ");
        float nota2 = sc.nextFloat();

        double media = (nota1 + nota2) / 2.0;

        if (media >= 7) {
            System.out.println("Aluno " + nome + " foi aprovado com média " + media);
        } else {
            System.out.println("Aluno " + nome + " foi reprovado com média " + media);
        }
    }
}