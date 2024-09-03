import java.util.Scanner;

/**
 */
public class ExercicioK {

    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {

        String a, b, c, d;


        System.out.print("Insira a frase: ");
        a = tec.nextLine();
        System.out.print("Insira o carácter que pretende substituir: ");
        b = tec.next();
        System.out.print("Insira o carácter que quer inserir: ");
        c = tec.next();
        d = Substituicao(a, b, c);
        System.out.println("Nova frase: " + d);
    }

    //------------------------------------------------------------------------------
    public static String Substituicao(String a, String b, String c) {

        String d = "", e;

        for (int i = 0; i <= (a.length() - 1); i++) {
            e = "";
            e = e + a.charAt(i);
            if (e.equalsIgnoreCase(b)) {
                e = c;
            }
            d = d + e;
        }
        return d;
    }
}
