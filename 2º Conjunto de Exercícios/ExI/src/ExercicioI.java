import java.util.Scanner;

/**
 */
public class ExercicioI {

    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {

        int num, a;

        System.out.print("Insira um número: ");
        num = tec.nextInt();
        a = Fibonacci(num);
        if (a == 1) {
            System.out.println("É de Fibonacci");
        } else {
            System.out.println("Não é de Fibonacci");
        }
    }

    public static int Fibonacci(int num) {

        int a = 0, b = 1, soma, soma2, soma3;

        if (num >= 0) {
            soma = a + b;

            if (num == soma || num == a) {
                a++;
            }
            soma2 = b + soma;
            if (num == soma2) {
                a++;
            }
            do {
                soma3 = soma + soma2;
                if (soma3 == num) {
                    a++;
                }
                soma = soma2;
                soma2 = soma3;
            } while (soma <= num);
        }
        return a;
    }
}
