import java.util.Scanner;

/**
 */
public class ExercicioB {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int i = 0, num, numMenor, ocorrencias = 0, a, b = 0;
        int[] sequencia = new int[60];

        System.out.print("Insira um número inteiro positivo: ");
        num = tec.nextInt();
        numMenor = num;
        if (num >= 0) {
            while (num >= 0) {
                if (num < numMenor) {
                    numMenor = num;
                }
                sequencia[i] = num;
                i++;
                b++;
                System.out.print("Insira um número inteiro positivo: ");
                num = tec.nextInt();
            }
            for (a = 0; a <= (b - 1); a++) {
                if (sequencia[a] == numMenor) {
                    ocorrencias++;
                }
            }
            System.out.println("Menor: " + numMenor);
            System.out.println("Ocorrências: " + ocorrencias);
        }
    }
}
