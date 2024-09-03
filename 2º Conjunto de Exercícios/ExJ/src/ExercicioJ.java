import java.util.Scanner;

public class ExercicioJ {

    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {

        int jogador1, jogador2, a = 0;
        String s = "";

        System.out.print("Jogador1 escolha um número entre 1 e 100: ");
        jogador1 = tec.nextInt();
        for (int i = 1; i <= 30; i++) {
            System.out.println("");
        }
        if (jogador1 >= 1 && jogador1 <= 100) {
            while (!(s.equalsIgnoreCase("Acertou!!"))) {
                System.out.print("Jogador2 tente adivinhar o número do Jogador1: ");
                jogador2 = tec.nextInt();
                s = Verificacao(jogador1, jogador2);
                a++;
            }
            System.out.println("Acertou!!");
            System.out.println("Precisou de " + a + " tentativas!");
        }
    }

    public static String Verificacao(int jogador1, int jogador2) {

        if (jogador1 < jogador2) {
            System.out.println("Tente menor!");
            return "Tente menor!";
        } else {
            if (jogador2 < jogador1) {
                System.out.println("Tente maior!");
                return "Tente maior!";
            } else {
                return "Acertou!!";
            }
        }
    }
}
