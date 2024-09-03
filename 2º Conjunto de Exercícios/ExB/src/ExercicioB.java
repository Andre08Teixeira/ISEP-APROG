import java.util.Scanner;

/**
 */
public class ExercicioB {

    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {


        int numAlunos, numDisciplinas, a = 0;
        String disciplina;

        System.out.print("Insira o número de alunos: ");
        numAlunos = tec.nextInt();

        System.out.print("Insira o número de disciplinas: ");
        numDisciplinas = tec.nextInt();

        while (a != numDisciplinas) {
            System.out.print("\nInsira o nome da disciplina: ");
            disciplina = tec.next();
            grafico(numAlunos, disciplina);
            a++;
        }
    }

    //------------------------------------------------------------------------------
    public static void grafico(int numAlunos, String disciplina) {

        int numNegativas, numPositivas, i;
        String asterisco = "*";
        String fimPositivas = "";
        String fimNegativas = "";

        System.out.print("Insira o número de positivas: ");
        numPositivas = tec.nextInt();

        numNegativas = numAlunos - numPositivas;

        for (i = 1; i <= numPositivas; i++) {
            fimPositivas = fimPositivas + asterisco;
        }

        for (i = 1; i <= numNegativas; i++) {
            fimNegativas = fimNegativas + asterisco;
        }

        System.out.println("\nDisciplina: " + disciplina);
        System.out.println("-Positivas: " + fimPositivas);
        System.out.println("-Negativas: " + fimNegativas);

    }
}