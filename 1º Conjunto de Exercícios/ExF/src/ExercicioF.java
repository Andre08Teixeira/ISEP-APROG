import java.util.Scanner;


/**
 */
public class ExercicioF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num, digito, a, numDeVerificar, numOriginal;

        System.out.print("Insira um número inteiro positivo: ");
        num = tec.nextInt();

        numOriginal = num;
        a = 0;
        numDeVerificar = 0;

        if (num > 0) {
            while (num != 0) {
                digito = num % 10;
                a++;
                numDeVerificar = numDeVerificar * 10 + digito;
                num = num / 10;
            }
            if (a > 1 && numDeVerificar == numOriginal) {
                System.out.println("O número é Capicua!");
            } else {
                System.out.println("O número não é Capicua!");
            }
        }
    }
}



