import java.util.Scanner;

/**
 */
public class ExercicioM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int N, a, b, soma, c, soma2, soma3;

        System.out.print("Insira a quantidade de números que pretende: ");
        N = tec.nextInt();

        b = 0;
        c = 1;
        if (N > 0) {
            switch (N) {
                case 1:
                    System.out.println(b);
                    break;
                case 2:
                    System.out.println(b);
                    System.out.println(c);
                    break;
                case 3:
                    System.out.println(b);
                    System.out.println(c);
                    soma = b + c;
                    System.out.println(soma);
                    break;
                case 4:
                    System.out.println(b);
                    System.out.println(c);
                    soma = b + c;
                    System.out.println(soma);
                    soma2 = c + soma;
                    System.out.println(soma2);
                    break;
                default:
                    System.out.println(b);
                    System.out.println(c);
                    soma = b + c;
                    System.out.println(soma);
                    soma2 = c + soma;
                    System.out.println(soma2);
                    for (a = 1; a <= (N - 4); a++) {
                        soma3 = soma2 + soma;
                        System.out.println(soma3);
                        soma = soma2;
                        soma2 = soma3;
                    }
                    break;
            }
        }
    }
}           
        
        
        
            
       
           
        
           
 