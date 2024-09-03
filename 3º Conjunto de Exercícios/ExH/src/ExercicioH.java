import java.util.Scanner;

/**
 */
public class ExercicioH {

    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {

        int N;

        System.out.print("Insira a quantidade de números da sequencia: ");
        N = tec.nextInt();
        int[] sequencia = armazenar(N);
        System.out.print("Insira a posição \"esquerda\" ou \"direita\": ");
        String s = tec.next();
        while (!(s.equalsIgnoreCase("sair"))) {
            if (s.equalsIgnoreCase("direita")) {
                int c = sequencia[N - 1];
                System.out.print("[" + c + "]");
                for (int a = (N - 2); a >= 0; a--) {
                    sequencia[a + 1] = sequencia[a];
                }
                for (int b = 1; b <= (N - 1); b++) {
                    int d = sequencia[b];
                    System.out.print("[" + d + "]");
                }
                sequencia[0] = c;
                System.out.println();
            } else {
                if (s.equalsIgnoreCase("esquerda")) {
                    int c = sequencia[0];
                    for (int a = 1; a <= N - 1; a++) {
                        sequencia[a - 1] = sequencia[a];
                    }
                    for (int b = 0; b <= N - 2; b++) {
                        int d = sequencia[b];
                        System.out.print("[" + d + "]");
                    }
                    System.out.print("[" + c + "]");
                    sequencia[N - 1] = c;
                    System.out.println();
                }
            }
            System.out.print("Insira a posição \"esquerda\" ou \"direita\": ");
            s = tec.next();
        }
    }

    //------------------------------------------------------------------------------
    public static int[] armazenar(int N) {

        int[] sequencia = new int[N];

        for (int a = 0; a <= (N - 1); a++) {
            System.out.print("Insira um número: ");
            int num = tec.nextInt();
            sequencia[a] = num;
        }
        return sequencia;
    }
}
