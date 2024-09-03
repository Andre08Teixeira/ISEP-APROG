import java.util.Scanner;

/**
 */
public class ExercicioY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num, a, b = 0;

        System.out.print("Insira um número inteiro positivo: ");
        num = tec.nextInt();

        if (num > 0) {
            for (a = 1; a <= (num / 2); a++) {
                if (num % a == 0) {
                    if (a % 3 == 0) {
                        b++;
                        System.out.println(a);
                    }
                }
            }
            if (b == 0) {
                System.out.println("Sem divisores múltiplos de 3!");
            }
        }
    }
}        
        
 