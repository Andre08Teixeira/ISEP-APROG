import java.util.Scanner;


public class ExercicioI {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] nomes = new String[4][3];
        int piso, entrada;
        for (entrada = 0, piso = 0; piso < 4; piso++) {
            System.out.print("Insira o nome: ");
            nomes[piso][entrada] = sc.nextLine();
        }
        for (entrada = 1, piso = 0; piso < 4; piso++) {
            System.out.print("Insira o nome: ");
            nomes[piso][entrada] = sc.nextLine();
        }
        for (entrada = 2, piso = 0; piso < 4; piso++) {
            System.out.print("Insira o nome: ");
            nomes[piso][entrada] = sc.nextLine();
        }

        metodo(nomes);
    }

    public static void metodo(String[][] nomes) {
        System.out.print("\nInsira o nome do Morador que quer saber os dados: ");
        String nome = sc.nextLine();
        int piso, entrada, cont = 0;
        for (piso = 0, entrada = 0; piso < 4; piso++) {
            if (nomes[piso][entrada].equals(nome)) {
                System.out.println("Nome: " + nome);
                System.out.println("Entrada: " + entrada);
                System.out.println("Piso: " + piso);
                cont++;
            }
        }
        for (piso = 0, entrada = 1; piso < 4; piso++) {
            if (nomes[piso][entrada].equals(nome)) {
                System.out.println("Nome: " + nome);
                System.out.println("Entrada: " + entrada);
                System.out.println("Piso: " + piso);
                cont++;
            }
        }
        for (piso = 0, entrada = 2; piso < 4; piso++) {
            if (nomes[piso][entrada].equals(nome)) {
                System.out.println("Nome: " + nome);
                System.out.println("Entrada: " + entrada);
                System.out.println("Piso: " + piso);
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("Nao mora no prédio!");
        }
    }
}