import java.util.Scanner;

/**
 */
public class ExercicioC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num, qtdImpares = 0, produto = 1, dig;

        System.out.print("Insira um número inteiro positivo: ");
        num = tec.nextInt();

        if (num <= 0) {
            System.out.println("O número que inseriu não é inteiro positivo!");
        } else {
            while (num != 0) {
                dig = num % 10;
                if (dig % 2 != 0) {
                    qtdImpares++;
                    produto = produto * dig;
                }
                num = num / 10;
            }
            if (qtdImpares == 0) {
                System.out.println("Não há algarismos ímpares!");
            } else {
                System.out.println("O produto dos algarismos ímpares é: " + produto);
            }
        }
    }
}






