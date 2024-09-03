import java.util.Scanner;

/**
 */
public class ExercicioE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num, digito, expoente, a, b, decimal;
        //a: funciona como variável de contagem de números diferentes de 8 e 9.
        //b: funciona como variável de contagem dos dígitos do número.

        System.out.print("Insira um número inteiro positivo: ");
        num = tec.nextInt();

        while (num > 0) {
            expoente = 0;
            decimal = 0;
            a = 0;
            b = 0;
            while (num != 0) {
                digito = num % 10;
                b++;
                if (digito < 8) {
                    a++;
                    decimal = (int) (decimal + (digito * Math.pow(8, expoente)));
                    expoente++;
                }
                num = num / 10;
            }
            if (a == b) {
                System.out.println("Número decimal: " + decimal);
            }
            System.out.print("\nInsira outro número inteiro positivo: ");
            num = tec.nextInt();
        }
    }
}            
               
           
      
           
          
              
              
                      
              
              
              
              
              
              
              
           
              
               
                       
      