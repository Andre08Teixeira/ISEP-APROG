import java.util.Scanner;

/**
 */
public class ExercicioF {

    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {

        float taxa, depositoInicial, valorFinal = 0;
        float[] taxas = new float[6];

        System.out.print("Insira as taxas dos 6 meses: \n");
        for (int a = 0; a <= 5; a++) {
            System.out.print("Mês " + (a + 1) + ": ");
            taxa = tec.nextFloat();
            taxas[a] = taxa;
        }
        System.out.print("\nInsira o depósito inicial: ");
        depositoInicial = tec.nextFloat();
        for (int b = 0; b <= 5; b++) {
            float c = taxas[b];
            valorFinal = depositoInicial * c + depositoInicial;
            depositoInicial = valorFinal;
        }
        System.out.printf("Valor final: %.2f%n€", valorFinal);
    }
}
