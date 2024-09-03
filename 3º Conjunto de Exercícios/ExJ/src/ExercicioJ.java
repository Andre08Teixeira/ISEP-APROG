import java.util.Scanner;

public class ExercicioJ {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nomes = new String[1000];
        int[] salarios = new int[1000];
        int[] salMelhor = new int[3];
        String[] nomeMelhor = new String[3];

        int i, cont, ordem = 1;

        cont = criarArray(nomes, salarios);

        descobrirMasiBemPagos(nomes, salarios, nomeMelhor, salMelhor, cont);

        System.out.println("RANK:");
        for (i = 0; i < 3; i++) {
            if (salMelhor[i] > 0) {
                System.out.println("#" + ordem + ":" + nomeMelhor[i] + ":" + salMelhor[i]);
                ordem++;
            }
        }
    }

    public static int criarArray(String[] nomes, int[] salarios) {
        int cont = 0, i = 0;
        String nome;

        System.out.print("Insira o nome: ");
        nome = ler.nextLine();

        while (!("FIM".equals(nome))) {
            nomes[i] = nome;
            System.out.print("Insira o salário: ");
            salarios[i] = ler.nextInt();
            cont++;
            i++;
            ler.nextLine();
            System.out.print("Insira o nome: ");
            nome = ler.nextLine();
        }
        return (cont);
    }

    public static void descobrirMasiBemPagos(String[] nomes, int[] salarios, String[] nome, int[] salario, int cont) {
        int i;

        String first = "";
        String second = "";
        String third = "";

        int numero3 = -1;
        int numero2 = -1;
        int numero1 = -1;

        for (i = 0; i < cont; i++) {
            if ((salarios[i] > numero1) || ((nomes[i].compareTo(first) < 0) && salarios[i] == numero1)) {
                third = second;
                second = first;
                first = nomes[i];
                numero3 = numero2;
                numero2 = numero1;
                numero1 = salarios[i];
            } else if ((salarios[i] > numero2) || ((nomes[i].compareTo(second) < 0) && salarios[i] == numero2)) {
                third = second;
                second = nomes[i];
                numero3 = numero2;
                numero2 = salarios[i];
            } else if ((salarios[i] > numero3) || ((nomes[i].compareTo(third) < 0) && salarios[i] == numero3)) {
                third = nomes[i];
                numero3 = salarios[i];
            }
        }
        nome[0] = first;
        nome[1] = second;
        nome[2] = third;
        salario[0] = numero1;
        salario[1] = numero2;
        salario[2] = numero3;
    }
}