import java.util.Scanner;

/**
 */
public class ExercicioD {

    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {

        int n, m, fatorialm, fatorialn, fatorialmn, c;

        System.out.print("Insira a quantidade de elementos: ");
        m = tec.nextInt();
        System.out.print("Insira a quantidade de elementos que pretende agrupar: ");
        n = tec.nextInt();

        if (m >= n) {
            c = m - n;
            fatorialm = a(m);
            fatorialn = a(n);
            fatorialmn = a(c);
            System.out.println("C(" + m + "," + n + ")=" + ((fatorialm) / (fatorialn * fatorialmn)));
            System.out.println("P(" + m + "," + n + ")=" + (fatorialm / fatorialmn));
        }
    }

    public static int a(int d) {

        int i, fatorial = 1;

        for (i = 2; i <= d; i++) {
            fatorial = fatorial * i;
        }
        return fatorial;
    }
}
