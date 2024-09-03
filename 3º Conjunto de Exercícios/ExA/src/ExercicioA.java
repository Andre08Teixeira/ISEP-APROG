import java.util.Scanner;

/**
 */
public class ExercicioA {

    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {

        int numAlunos, i, a = 0;
        double notasTotal = 0;

        System.out.print("Insira o número de aluno: ");
        numAlunos = tec.nextInt();
        int[] notas = new int[numAlunos];
        for (i = 0; i <= (numAlunos - 1); i++) {
            System.out.print("Insira a nota do aluno: ");
            notas[i] = tec.nextInt();
            notasTotal = notasTotal + notas[i];
            if (notas[i] < 10) {
                a++;
            }
        }
        System.out.printf("Média: %.1f%n", (notasTotal / numAlunos));
        System.out.println("Reprovações: " + a);
    }
}
