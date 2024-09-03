import java.util.Scanner;

/**
 */
public class ExercicioB { //calcular a soma dos números pares de cada número inteiro positivo inserido e termina quando é inserido um número que nao seja inteiro positivo.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num, dig, soma, a = 0;
        //a: funciona como variável de contagem de números pares

        System.out.print("Escreva um número inteiro positivo: ");
        num = tec.nextInt();

        if (num <= 0) {
            System.out.println("O número que inseriu não é inteiro positivo!");
        } else {
            while (num > 0) {
                soma = 0;
                while (num != 0) {
                    dig = num % 10;
                    if (dig % 2 == 0) {
                        soma = soma + dig;
                        a++;
                    }
                    num = (num / 10);
                }
                if (a == 0) {
                    System.out.println("O número que inseriu não tem números pares logo a soma é 0");
                } else {
                    System.out.println("A soma dos números pares do número inserido é " + soma);
                }
                System.out.print("\nEscreva outro número inteiro positivo: ");
                num = tec.nextInt();
            }
        }
    }
}






