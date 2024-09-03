import java.util.Scanner;

/**
 */
public class ExercicioL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int N, a = 6, soma, b, c = 0;

        System.out.print("Insira a quantidade números que pretende: ");
        N = tec.nextInt();

        do {
            soma = 0;
            for (b = 1; b <= (a / 2); b++) {
                if (a % b == 0) {
                    soma = soma + b;
                }
            }
            if (soma == a) {
                c++;
                System.out.println(a);
            }
            a++;
        } while (c != N);
    }
}


