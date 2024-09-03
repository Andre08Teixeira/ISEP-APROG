import java.util.Scanner;

/**
 */
public class ExercicioA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int i = 0, vef = 0;
        String palavra, verificar;

        while (vef == 0) {
            System.out.print("Insira a palavra que pretende: ");
            palavra = tec.next();
            verificar = palindromo(palavra);
            if (verificar.equals("Palíndromo")) {
                vef = 1;
            } else {
                i++;
            }
        }
        System.out.println("Quantidade de palavras antes do Palíndromo: " + i);
    }

    public static String palindromo(String original) {
        String resultado = "";
        String comparar;
        String soma = "";

        comparar = original;
        while (original.length() != 0) {
            soma = original.charAt(0) + soma;
            original = original.substring(1);
        }
        if (comparar.compareTo(soma) == 0) {
            resultado = "Palíndromo";
        }
        return resultado;
    }
}

