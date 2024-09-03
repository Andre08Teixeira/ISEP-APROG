import java.util.Scanner;

/**
 */
public class ExercicioG {

    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {

        int N;

        System.out.print("Insira a quantidade de elementos: ");
        N = tec.nextInt();
        int[] sequencia = armazenar(N);
        inverter(sequencia, N);
    }

    //------------------------------------------------------------------------------    
    public static int[] armazenar(int N) {

        int num;
        int[] sequencia = new int[N];

        for (int a = 0; a <= (N - 1); a++) {
            System.out.print("Insira um número: ");
            num = tec.nextInt();
            sequencia[a] = num;
        }
        return sequencia;
    }

    //------------------------------------------------------------------------------    
    public static void inverter(int[] sequencia, int N) {

        System.out.println("Números de ordem inversa:");
        for (int a = (N - 1); a >= 0; a--) {
            int num = sequencia[a];
            System.out.println(num);
        }
    }
}