import java.util.Scanner;

/**
 */
public class ExercicioD {

    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {

        int N;

        System.out.print("Insira o número de alunos: ");
        N = tec.nextInt();

        int[] notas = armazenar(N);
        grafico(notas, N);
    }

    //------------------------------------------------------------------------------
    public static int[] armazenar(int N) {

        int nota;
        int[] notas = new int[N];

        for (int a = 0; a <= (N - 1); a++) {
            System.out.print("Insira a nota do aluno: ");
            do {
                nota = tec.nextInt();
                notas[a] = nota;
            } while (nota < 0 || nota > 20);
        }
        return notas;
    }

    //------------------------------------------------------------------------------
    public static void grafico(int[] notas, int N) {

        int[][] grafico = new int[21][2];

        for (int a = 0; a <= 20; a++) {
            grafico[a][0] = a;
            grafico[a][1] = 0;
        }
        for (int b = 0; b <= (N - 1); b++) {
            for (int c = 0; c <= 20; c++) {
                if (grafico[c][0] == notas[b]) {
                    grafico[c][1] = grafico[c][1] + 1;
                }
            }
        }
        for (int d = 0; d <= 20; d++) {
            int e = grafico[d][0];
            int f = grafico[d][1];
            System.out.println("Nota: " + e + " Quantidade: " + f);
        }
    }
}

