import java.util.Scanner;

/**
 */
public class ExercicioC {

    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {

        int N;

        System.out.print("Insira a quantidade de números da sequência: ");
        N = tec.nextInt();
        int[] sequencia = leitura(N);
        String s = verificacao(sequencia, N);
        System.out.println("Sempre crescente: " + s);
    }

    public static int[] leitura(int N) {

        int[] sequencia = new int[N];

        for (int a = 0; a <= (N - 1); a++) {
            System.out.print("Insira o numero: ");
            int num = tec.nextInt();
            sequencia[a] = num;
        }
        return sequencia;
    }

    public static String verificacao(int[] sequencia, int N) {

        int b = 0;

        int numMenor = sequencia[0];
        for (int a = 1; a <= (N - 1); a++) {
            if (sequencia[a] > numMenor) {
                numMenor = sequencia[a];
                b++;
            }
        }
        if (N == (b + 1)) {
            return "true";
        } else {
            return "false";
        }
    }
}
