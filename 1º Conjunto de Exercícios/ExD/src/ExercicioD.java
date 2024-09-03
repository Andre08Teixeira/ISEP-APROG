import java.util.Scanner;

/**
 */
public class ExercicioD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num, digito, quantidadeImpares, produto;

        System.out.print("Insira um número inteiro positivo: ");
        num = tec.nextInt();

        while (num > 0) {
            quantidadeImpares = 0;
            produto = 1;
            while (num != 0) {
                digito = num % 10;
                if (digito % 2 != 0) {
                    quantidadeImpares++;
                    produto = produto * digito;
                }
                num = num / 10;
            }
            if (quantidadeImpares == 0) {
                System.out.println("Não há algarismos ímpares!");
            } else {
                System.out.println("O produto dos algarismo ímpares é: " + produto);
            }
            System.out.print("\nInsira outro número inteiro positivo: ");
            num = tec.nextInt();
        }
    }
}

