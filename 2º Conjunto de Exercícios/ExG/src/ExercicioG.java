import java.util.Scanner;

/**
 */
public class ExercicioG {

    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {

        int N, i, a;

        System.out.print("Insira até que número pretende: ");
        N = tec.nextInt();
        if (N >= 0) {
            System.out.println("0");
            for (i = 1; i <= N; i++) {
                a = armstrong(i);
                if (a == 1) {
                    System.out.println(i);
                }
            }
        }
    }

    //------------------------------------------------------------------------------
    public static int armstrong(int i) {

        int dig, a = 0, orig, b = 0, orig2;
        double num = 0;

        orig = i;
        orig2 = i;
        while (i != 0) {
            i = i / 10;
            a++;
        }
        while (orig != 0) {
            dig = orig % 10;
            num = num + (Math.pow(dig, a));
            orig = orig / 10;
        }
        if (orig2 == num) {
            b++;
        }
        return b;
    }
}