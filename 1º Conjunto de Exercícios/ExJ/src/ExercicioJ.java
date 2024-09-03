import java.util.Scanner;

/**
 */
public class ExercicioJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num, i, sequencia, digito, n, numOriginal;
        double percentagem, percentagemMaior, a;

        System.out.print("Insira a quantidade de números da sequência que pretende: ");
        sequencia = tec.nextInt();

        percentagemMaior = 0;

        if (sequencia >= 0) {
            for (i = 1; i <= sequencia; i++) {
                System.out.print("\nInsira um número inteiro positivo: ");
                num = tec.nextInt();
                numOriginal = num;
                if (num > 0) {
                    a = 0;
                    n = 0;
                    while (num != 0) {
                        digito = num % 10;
                        a++;
                        if (digito != 0 && numOriginal % digito == 0) {
                            n++;
                        }
                        num = num / 10;
                    }
                    percentagem = (n / a) * 100;
                    System.out.printf("Percentagem de dígitos divisores do próprio número: %.2f%%%n", percentagem);
                    if (percentagem > percentagemMaior) {
                        percentagemMaior = percentagem;
                    }
                }
            }
            System.out.printf("%nPercentagem Maior de dígitos divisores do próprio número: %.2f%%", percentagemMaior);
        }
    }
}   

                    