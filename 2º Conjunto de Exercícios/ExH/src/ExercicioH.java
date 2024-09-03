import java.util.Scanner;

/**
 */
public class ExercicioH {

    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {

        int num, a = 0, b;

        do {
            System.out.print("Insira um número: ");
            num = tec.nextInt();
            b = capicua(num);
            a++;
        } while (a != 5 && b != 1);
        if (b == 1) {
            System.out.println("capicua");
        } else {
            System.out.println("tentativas excedidas");

        }
    }

    public static int capicua(int num) {

        int orig, novo = 0, a, dig, b = 0;

        orig = num;
        while (num != 0) {
            dig = num % 10;
            b++;
            novo = (novo * 10) + dig;
            num = num / 10;
        }
        if (orig == novo && b >= 2) {
            a = 1;
        } else {
            a = 0;
        }
        return a;
    }
}
