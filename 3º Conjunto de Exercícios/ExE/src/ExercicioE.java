import java.util.Scanner;

/**
 */
public class ExercicioE {

    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {

        int b;
        float media;
        String[] nomes = new String[20];
        float[] v = new float[20];

        b = a(nomes, v);
        media = fazerMedia(v, b);
        grafico(nomes, v, media, b);

    }

    //------------------------------------------------------------------------------
    public static int a(String[] nomes, float[] v) {

        String nome;
        float vencimento;
        int a = 0, b = 0, c = 0;

        System.out.print("Insira o nome do trabalhador: ");
        nome = tec.next();
        while (!(nome.equalsIgnoreCase("fim"))) {
            nomes[a] = nome;
            a++;
            System.out.print("Insira o vencimento desse trabalhador: ");
            vencimento = tec.nextFloat();
            v[b] = vencimento;
            b++;
            System.out.print("Insira o nome do trabalhador: ");
            nome = tec.next();
            c++;
        }
        return c;
    }

    //------------------------------------------------------------------------------
    public static float fazerMedia(float[] v, int b) {

        float total = 0, media;

        for (int a = 0; a <= (b - 1); a++) {
            total = total + v[a];
        }
        media = (total / b);
        return media;
    }

    //------------------------------------------------------------------------------
    public static void grafico(String[] nomes, float[] v, float media, int b) {

        System.out.printf("Média: %.1f%n", media);
        for (int a = 0; a <= (b - 1); a++) {
            float vencimento = v[a];
            if (vencimento < media) {
                String c = nomes[a];
                System.out.println(c);
            }
        }
    }
}

