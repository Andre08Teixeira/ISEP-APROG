import java.util.Scanner;

/**
 */
public class ExercicioN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num, digito, a, b, digitoAnterior, numAnterior, numOriginal;

        System.out.print("Insira um número: ");
        num = tec.nextInt();

        numAnterior = num;

        while (num >= 0) {
            digitoAnterior = 10;
            a = 0;
            b = 0;
            numOriginal = num;
            while (num != 0) {
                digito = num % 10;
                a++;
                if (digito < digitoAnterior) {
                    digitoAnterior = digito;
                    b++;
                }
                num = num / 10;
            }
            if (a == b && numOriginal > numAnterior) {
                System.out.println(numOriginal);
            }
            numAnterior = numOriginal;
            System.out.print("Insira um número: ");
            num = tec.nextInt();
        }
    }
}


