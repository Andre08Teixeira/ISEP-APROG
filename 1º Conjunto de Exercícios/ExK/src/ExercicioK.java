import java.util.Scanner;

/**
 */
public class ExercicioK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num, i, a, b;

        System.out.print("Insira um número inteiro positivo: ");
        num = tec.nextInt();
        System.out.println("Números ímpares até ao número inserido:");
        if (num > 0) {
            for (i = 1; i <= num; i++) {
                a = 0;
                for (b = 1; b <= i; b++) {
                    if (i % b == 0) {
                        a++;
                    }
                }
                if (a == 2) {
                    System.out.println(i);
                }
            }
        }
    }
}



