import java.util.Scanner;

/**
 */
public class ExercicioI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int numUm, numDois, i = 1, i2 = 1, mult1, mult2 = 1;

        System.out.print("Número 1: ");
        numUm = tec.nextInt();
        System.out.print("Número 2: ");
        numDois = tec.nextInt();

        do {
            mult1 = numUm * i;
            if (mult1 % numDois == 0) {
                do {
                    mult2 = numDois * i2;
                    i2++;
                } while (mult1 != mult2);
            }
            i++;
        } while (mult1 != mult2);
        System.out.println("\nMínimo múltiplo comum: "+mult1);
    }
}          
        
        
 