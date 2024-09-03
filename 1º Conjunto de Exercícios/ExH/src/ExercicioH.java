import java.util.Scanner;

/**
 */
public class ExercicioH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num, i, a;

        System.out.print("Insira um número inteiro positivo: ");
        num = tec.nextInt();

        a = 1;
        if (num > 0) {
            for (i = 1; i <= (num / 2); i++) {
                if (num % i == 0) {
                    a++;
                }
            }
            if (a == 2) {
                System.out.println("O número é primo!");
            } else {
                System.out.println("O número não é primo!");
            }
        }
    }
}

