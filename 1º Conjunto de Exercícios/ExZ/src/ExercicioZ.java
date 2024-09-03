import java.util.Scanner;

/**
 */
public class ExercicioZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num, digito, a, imparMaior = 0;
        double b, percentagem;

        System.out.print("Insira um número inteiro positivo: ");
        num = tec.nextInt();
        a = 0;
        b = 0;

        if (num > 0) {
            while (num != 0) {
                digito = num % 10;
                a++;
                if (digito % 2 == 0) {
                    b++;
                } else {
                    if (digito > imparMaior) {
                        imparMaior = digito;
                    }
                }
                num = num / 10;
            }
            percentagem = (b / a) * 100;
            System.out.printf("Percentagem de algarismo pares: %.2f%%%n", percentagem);
            if (imparMaior != 0) {
                System.out.println("\nÍmpar Maior: " + imparMaior);
            } else {
                System.out.println("Não há algarismos ímpares");
            }
        }
    }
}

