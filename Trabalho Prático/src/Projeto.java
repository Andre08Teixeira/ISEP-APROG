import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Projeto {

    static int MaxEquipas = 32;
    static int Finalistas = (MaxEquipas/2);

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException { // método para criação do menu principal( 14 opções mais uma se o utilizador pretender abandonar o programa a meio)
        int op, equipas = 0, nrop = 1, opcao2 = 0;
        String[][] stats;
        stats = new String[MaxEquipas][11];
        do { // após cada ação realizada o menu aparece novamente até o utilizador decidir sair do programa
            System.out.println("===========================================MENU===========================================\n");
            System.out.println("Este campeonato mundial terá 32 equipas a disputá-lo, de modo a que hajam 8 grupos com 4\nequipas cada e que a fase de eliminatória esteja corretamente organizada!\n");
            System.out.println("1-Ler estatísticas diretamente do ficheiro\n2-Digitar as estatísticas manualmente\n3-Calculo dos pontos de cada equipa");
            System.out.println("4-Calcular a classificação das equipas por grupo\n5-Listar a classificação das equipas por grupo\n6-Listar equipas cujo nº de golos marcados é igual ao nº de golos máximo");
            System.out.println("7-Procurar equipas pelo nº de golos sofridos\n8-Listar alfabeticamente as equipas com nº golos sofridos maior que o nº de golos marcados");
            System.out.println("9-Listar primeiros classificados de cada grupo\n10-Procurar pelas estatíticas de uma certa equipa\n11-Criar um ficheiro de texto com as estatísticas dos jogos");
            System.out.println("12-Remover equipas não qualificadas\n13-Criar ficheiro com as equipas qualificadas e respetivas estatísticas\n14-Criar um ficheiro com os jogos da fase final");
            System.out.println("0-Encerrar programa");
            System.out.println("Atenção! Terá que escolher as primeiras 5 opções antes de poder optar por outra qualquer\nTambém não poderá escolher nenhuma das 2 primeiras opções a seguir a ter todas as equipas");
            op = sc.nextInt();
            System.out.println("\n\n\n");
            if ((op>=0)&&(op<15)&&(((nrop == 1) && (op < 3)) || ((nrop == 2) && (op == 2) && (opcao2 == 0)) || ((nrop == 3) && (op == 3)) || ((nrop == 4) && (op < 5) && (op > 2)) || ((nrop == 5) && (op < 6) && (op > 2)) || ((nrop > 5) && (op > 2)))) {
               //if utilizado para veficar ate à opcao 5 se e tudo realizado corretamente
                switch (op) { // case para cada opção do menu
                    case 1://ficheiro de equipas
                        stats = op1stats(stats);
                        equipas = op1equipas();
                        if (equipas == -1) {
                            equipas = 0;
                        }
                        System.out.println("Informação das equipas armazenado com sucesso!\n\n");
                        break;
                    case 2://equipas manualmente
                        stats = op2(stats, equipas);
                        System.out.println("Informação das equipas armazenado com sucesso!\n\n");
                        opcao2++;
                        break;
                    case 3:
                        stats = op3(stats);
                        System.out.println("Informação das pontuações das equipas armazenado com sucesso!\n\n");
                        break;
                    case 4:
                        stats = op4(stats);
                        System.out.println("Informação das classificações das equipas armazenado com sucesso!\n\n");
                        break;
                    case 5:
                        stats = op5(stats);
                        break;
                    case 6:
                        op6(stats);
                        break;
                    case 7:
                        op7(stats);
                        break;
                    case 8:
                        op8(stats);
                        break;
                    case 9:
                        op9(stats);
                        break;
                    case 10:
                        op10(stats);
                        break;
                    case 11:
                        op11(stats);
                        System.out.println("Ficheiro com as estatísticas criado com sucesso!\n\n"); // pequena anotação para o utilizador ter noção se realizou ou não a tarefa que pretendia
                        break;
                    case 12:
                        stats = op12(stats);
                        System.out.println("Equipas eliminadas da competição com sucesso!\n\n"); // pequena anotação para o utilizador ter noção se realizou ou não a tarefa que pretendia
                        break;
                    case 13:
                        op13(stats);
                        System.out.println("Ficheiro com as equipas que vão disputar a fase final criado com sucesso!\n\n"); // pequena anotação para o utilizador ter noção se realizou ou não a tarefa que pretendia
                        break;
                    case 14:
                        op14(stats);
                        System.out.println("Ficheiro com os jogos da fase final criado com sucesso!\n\n"); // pequena anotação para o utilizador ter noção se realizou ou não a tarefa que pretendia
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("A opção " + op + " é inexistente, tente novamente\n\n"); // Caso o utilizador escolha uma opção diferente das disponiblizadas (Números negativos e números superiores a 14)
                        break;
                }
                nrop++;
            }
            else if ((nrop==2)&&(op<3)&&(op>0)&&(opcao2>0)) { //verificar o que fazer caso o utilizador ja tenha todas as equipas
                System.out.println("As equipas já foram todas colocadas. Comece a utilizar as outras funcionalidades!");
                nrop++;//para poder utilizar as outras funcionalidades!
            }
                else if((op<15)&&(op>0)){//para nao fugir à ordem estabelecida
                System.out.println("Deixou passos por fazer, por favor tente novamente\n\n"); // Para a realização do programa, o utilizador deve começar por realizar as primeiras quatro opções, caso não aconteça não conseguirá avançar
            }
                else if (op !=0) { //para nao fugir aos parametros estabelecidos
                    System.out.println("Opção inexistente, por favor tente novamente\n\n");
            }
        } while (op != 0);
    }

    //=============================================================================================================
    public static String[][] op1stats(String[][] info) throws FileNotFoundException { // método para ler o conteúdo do ficheiro
        int nrlinhas = 0;
        String linha;
        String[] linhas;
        Scanner in = new Scanner(new File("C:\\Users\\andre\\Downloads\\PracticalWork.csv"));
        in.nextLine();
        while (in.hasNextLine()) { // Enquanto houver linhas...
            linha = in.nextLine();// vai ler a informação que está em todas as linhas
            linhas = linha.split(",");
            System.arraycopy(linhas, 0, info[nrlinhas], 0, linhas.length);
            nrlinhas++;
        }
        return info;
    }

    //==============================================================================================================
    public static int op1equipas() throws FileNotFoundException { // método para contar o número de equipas existentes na opção 1, e ao passar para a opção 2 o utilizador adicionará as restantes equipas
        int nrlinhas = -1; //por causa da linha so com indicações
        String linha;
        Scanner in = new Scanner(new File("C:\\Users\\andre\\Downloads\\PracticalWork.csv"));
        while (in.hasNextLine()) { // Enquanto houver linhas...
            linha = in.nextLine();// Vai ler a informação que está em todas as linhas
            nrlinhas++; // conta o número de linhas
        }

        return nrlinhas;
    }

    //=======================================================================================================================
    public static String[][] op2(String[][] classificacao, int equipas) { //método para inserir manualmente as restantes equipas e ordenar a tabela
        sc.nextLine();
        System.out.println("Faltam ser digitadas " + (MaxEquipas - equipas) + " equipas");
        String linha;
        String[] linhas = new String[11];
        for (int i = equipas; i < MaxEquipas; i++) {
            do {
                System.out.println("Digite as estatísticas da equipa (Grupo,Equipa,Jogos,Vitórias,Empates,Derrotas,Golos Marcados, Golos Sofridos)");
                linha = sc.nextLine().toUpperCase();
                linhas = linha.split(",");
                if ((ValidarGrupo(classificacao, linhas, i)) & (ValidarEquipas(classificacao, linhas, i)) & (Negativos(linhas)) & (Jogos(linhas)) & (DiferençaGolos(linhas))) {
                    System.arraycopy(linhas, 0, classificacao[i], 0, linhas.length);
                } else {
                    System.out.println("Tente novamente!\n\n");

                }
            } while ((ValidarGrupo(classificacao, linhas, equipas) == false) || (ValidarEquipas(classificacao, linhas, equipas) == false) || (Negativos(linhas) == false) || (Jogos(linhas) == false) || (DiferençaGolos(linhas) == false));
        }

        return classificacao;
    }

    //======================================================================================================================
    public static boolean ValidarGrupo(String[][] tabela, String[] linha, int equipas) {
        int validade = 10, ga = 0, gb = 0, gc = 0, gd = 0, ge = 0, gf = 0, gg = 0, gh = 0;
        for (int i = 0; i < equipas; i++) {
            switch (tabela[i][0]) {
                case "A":
                    ga++;
                    break;
                case "B":
                    gb++;
                    break;
                case "C":
                    gc++;
                    break;
                case "D":
                    gd++;
                    break;
                case "E":
                    ge++;
                    break;
                case "F":
                    gf++;
                    break;
                case "G":
                    gg++;
                    break;
                case "H":
                    gh++;
                    break;
            }
        }
        switch (linha[0]) {
            case "A":
                ga++;
                validade = ga;
                break;
            case "B":
                gb++;
                validade = gb;
                break;
            case "C":
                gc++;
                validade = gc;
                break;
            case "D":
                gd++;
                validade = gd;
                break;
            case "E":
                ge++;
                validade = ge;
                break;
            case "F":
                gf++;
                validade = gf;
                break;
            case "G":
                gg++;
                validade = gg;
                break;
            case "H":
                gh++;
                validade = gh;
                break;
        }
        if (validade > 4) {
            System.out.println("O número de equipas por grupo é 4\n\n");
        }

        return (validade < 5);
    }

    //========================================================================================================================================
    public static boolean ValidarEquipas(String[][] tabela, String[] linha, int equipas) { // boolean para não haver equipas com o mesmo nome
        boolean validade = true;
        for (int i = 0; i < equipas; i++) {
            if (linha[1].equalsIgnoreCase(tabela[i][1])) {
                validade = false;
            }
        }
        if (validade == false) {
            System.out.println("Esta equipa já foi submetida com as respetivas estatisticas\n\n");
        }
        return validade;
    }

    //===================================================================================================================================
    public static boolean Negativos(String[] linha) { // boolean para não inserir números negativos(Ex: Grupo G; Equipa:Paraguai; Jogos:-3)
        boolean validade = true;
        if ((Integer.parseInt(linha[3]) < 0) || (Integer.parseInt(linha[4]) < 0) || (Integer.parseInt(linha[5]) < 0) || (Integer.parseInt(linha[6]) < 0) || (Integer.parseInt(linha[7]) < 0)) {
            validade = false;
        }
        if (validade == false) {
            System.out.println("Estatísticas com valor negativo não são válidas\n\n");
        }
        return validade;
    }

    //======================================================================================================================================
    public static boolean Jogos(String[] linha) { // boolean para o número de jogos ser igual à soma de vitórias, empates e derrotas
        boolean validade = true;
        if ((Integer.parseInt(linha[2]) != (Integer.parseInt(linha[3]) + Integer.parseInt(linha[4]) + Integer.parseInt(linha[5]))) || (Integer.parseInt(linha[2]) != 3)) {
            validade = false;
        }
        if (validade == false) {
            System.out.println("O número de jogos tem que ser igual à soma das vitórias, empates e derrotas\n\n");
        }
        return validade;
    }

    //======================================================================================================================================
    public static boolean DiferençaGolos(String[] linha) { // boolean para verificar se a diferença de golos é possível tendo em conta o número de vitórias, empates e derrotas
        boolean validade = true;
        int difgolos, vit, emp, derr;
        vit = Integer.parseInt(linha[3]);
        emp = Integer.parseInt(linha[4]);
        derr = Integer.parseInt(linha[5]);
        difgolos = (Integer.parseInt(linha[6]) - Integer.parseInt(linha[7]));

        if (((vit == 3) && (difgolos < 3)) || ((vit == 2) && (emp == 1) && (difgolos < 2)) || ((vit == 1) && (emp == 2) && (difgolos < 1)) || ((emp == 2) && (derr == 1) && (difgolos > -1)) || ((emp == 1) && (derr == 2) && (difgolos > -2)) || ((emp == 3) && (difgolos != 0)) || ((derr == 3) && (difgolos > -3))) {
            validade = false;
            System.out.println("Os valores apresentados para as vitórias, empates e derrotas não combinam com os valores de golos marcados e sofridos\n\n");
        }
         return validade;
    }

    //======================================================================================================================================
    public static String[][] op3(String[][] classificacao) { // método para calcular o número de pontos de cada equipa
        for (int j = 0; j < 32; j++) { // ordenar de modo a ficar igual ao exemplo da tabela
            classificacao[j][9] = classificacao[j][7];
            classificacao[j][8] = classificacao[j][6];
            classificacao[j][7] = classificacao[j][5];
            classificacao[j][6] = classificacao[j][4];
            classificacao[j][5] = classificacao[j][3];
            classificacao[j][4] = classificacao[j][2];
            classificacao[j][2] = classificacao[j][1];
            classificacao[j][10] = Integer.toString((Integer.parseInt(classificacao[j][8])) - (Integer.parseInt(classificacao[j][9])));
        }
        for (int i = 0; i < MaxEquipas; i++) { // calcula o número de pontos
            classificacao[i][3] = Integer.toString((3 * Integer.parseInt(classificacao[i][5])) + (Integer.parseInt(classificacao[i][6])));
        }

        return classificacao;
    }

    //=========================================================================================================================================
    public static String[][] op4(String[][] classificacao) { // método para calcular a classificação de cada grupo
        String[] aux;
        for (int i = 0; i < (MaxEquipas - 1); i++) {
            for (int j = (i + 1); j < MaxEquipas; j++) {
                if (((classificacao[i][0]).compareToIgnoreCase(classificacao[j][0])) > 0) {
                    aux = classificacao[j];
                    classificacao[j] = classificacao[i];
                    classificacao[i] = aux;
                } else if ((((classificacao[i][0]).compareTo(classificacao[j][0])) == 0) && (Integer.parseInt(classificacao[i][3]) < Integer.parseInt(classificacao[j][3]))) {
                    aux = classificacao[j];
                    classificacao[j] = classificacao[i];
                    classificacao[i] = aux;
                } else if ((((classificacao[i][0]).compareToIgnoreCase(classificacao[j][0])) == 0) && (Integer.parseInt(classificacao[i][3]) == Integer.parseInt(classificacao[j][3])) && ((Integer.parseInt(classificacao[i][8]) < Integer.parseInt(classificacao[j][8])))) {
                    aux = classificacao[j];
                    classificacao[j] = classificacao[i];
                    classificacao[i] = aux;
                } else if ((((classificacao[i][0]).compareToIgnoreCase(classificacao[j][0])) == 0) && (Integer.parseInt(classificacao[i][3]) == Integer.parseInt(classificacao[j][3])) && ((Integer.parseInt(classificacao[i][8]) == Integer.parseInt(classificacao[j][8]))) && ((Integer.parseInt(classificacao[i][9]) < Integer.parseInt(classificacao[j][9])))) {
                    aux = classificacao[j];
                    classificacao[j] = classificacao[i];
                    classificacao[i] = aux;
                } else if ((((classificacao[i][0]).compareToIgnoreCase(classificacao[j][0])) == 0) && (Integer.parseInt(classificacao[i][3]) == Integer.parseInt(classificacao[j][3])) && ((Integer.parseInt(classificacao[i][8]) == Integer.parseInt(classificacao[j][8]))) && ((Integer.parseInt(classificacao[i][9]) == Integer.parseInt(classificacao[j][9]))) && (((classificacao[i][2]).compareToIgnoreCase(classificacao[j][2])) > 0)) {
                    aux = classificacao[j];
                    classificacao[j] = classificacao[i];
                    classificacao[i] = aux;
                }
            }
        }
        return classificacao;
    }

    /////////////////////////////////
    public static String[][] op5(String[][] classificacao) { //método para listar a classificação de equipas por grupo
        int posicao = 1;
        for (int i = 0; i < MaxEquipas; i++) {
            classificacao[i][1] = Integer.toString(posicao);
            if (posicao == 4) {
                posicao = 1;
            } else {
                posicao++;
            }
        }
        System.out.println("| Grp | Pos | Equipa          | Pts| J  | V  | E  | D  | GM | GS | GD |\n|=====|=====|=================|====|====|====|====|====|====|====|====|");
        for (int i = 0; i < MaxEquipas; i++) {
            System.out.println("|=====|=====|=================|====|====|====|====|====|====|====|====|");
            System.out.printf("|%-5s|%5s|%-17s|%4s|%4s|%4s|%4s|%4s|%4s|%4s|%4s|", classificacao[i][0], classificacao[i][1], classificacao[i][2], classificacao[i][3], classificacao[i][4], classificacao[i][5], classificacao[i][6], classificacao[i][7], classificacao[i][8], classificacao[i][9], classificacao[i][10]);
            System.out.println("");
        }

        return classificacao;
    }

    //====================================================================================================================================
    public static void op6(String[][] classificacao) { // método para listar as equipas cujos golos marcados é igual ao máximo de golos marcados 
        int maxgolos = -1; // criação de uma nova variável de forma a que sempre que uma equipa tenha golos marcados superior a -1, esse passará a ser o maxgolos.(Ex: Alemanha tem 4 golos marcados, então maxgolos=4; Se Portugal tem 6 golos marcados então maxgolos=6)
        for (int i = 0; i < MaxEquipas; i++) {
            if (Integer.parseInt(classificacao[i][8]) > maxgolos) {
                maxgolos = Integer.parseInt(classificacao[i][8]);
            }
        }
        System.out.println("| Equipa          | GM |");
        for (int j = 0; j < 32; j++) { //verificar se alguma equipa tem o mesmo número de golos que o número de golos máximo já definido
            if (Integer.parseInt(classificacao[j][8]) == maxgolos) {
                System.out.printf("|%-17s|%4s|", classificacao[j][2], classificacao[j][8]);
                System.out.println("");
            }
        }
    }

    //=======================================================================================================================================
    public static void op7(String[][] classificacao) { // método para listar as equipas com número de golos sofridos(definidos pelo utilizador)
        boolean existe = false;
        System.out.println("Digite o número de golos sofridos da equipa que deseja procurar");
        int golos = sc.nextInt();
        System.out.println("| Equipa          | GS |");
        for (int i = 0; i < MaxEquipas; i++) {
            if (golos == (Integer.parseInt(classificacao[i][9]))) {
                System.out.printf("|%-17s|%4s|", classificacao[i][2], classificacao[i][9]);
                System.out.println("");
                existe = true;
            }
        }
        if (!existe) { // Se não exitir nenhuma equipa com o número de golos sofridos.....
            System.out.println("Não existem equipas com esse número de golos sofridos\n\n"); // aparece esta notação para informar o utilizador
        }
    }
    //===========================================================================================================================================

    public static void op8(String[][] classificacao) { // método para listar as equipas que têm mais golos sofridos do que marcados alfabeticamente
        System.out.println("As equipas que têm mais golos sofridos do que golos marcados(ordenadas por ordem alfabética) são: ");
        String aux;
        for (int i = 0; i < MaxEquipas; i++) {
            for (int j = (i + 1); j < 32; j++) {
                if ((Integer.parseInt(classificacao[i][9]) > Integer.parseInt(classificacao[i][8])) && (Integer.parseInt(classificacao[j][9]) > Integer.parseInt(classificacao[j][8])) && (((classificacao[i][2]).compareToIgnoreCase(classificacao[j][2])) > 0)) {
                    aux = classificacao[i][2];
                    classificacao[i][2] = classificacao[j][2];
                    classificacao[j][2] = aux;
                }
            }
        }
        System.out.println("| Equipa          | GM | GS |");
        for (int x = 0; x < MaxEquipas; x++) {
            if (Integer.parseInt(classificacao[x][9]) > Integer.parseInt(classificacao[x][8])) {
                System.out.printf("|%-17s|%4s|%4s|", classificacao[x][2], classificacao[x][8], classificacao[x][9]);
                System.out.println("");
            }
        }
    }

    //==================================================================================================================================
    public static void op9(String[][] classificacao) { // método para listar o primeiro classificado de cada grupo
        System.out.println("| Grp | Pos | Equipa          |");
        for (int i = 0; i < MaxEquipas; i++) {
            if (Integer.parseInt(classificacao[i][1]) == 1) {
                System.out.println("|=====|=====|==================|");
                System.out.printf("|%-5s|%5s|%-17s|", classificacao[i][0], classificacao[i][1], classificacao[i][2]);
                System.out.println("");
            }
        }
    }

    //===================================================================================================================================
    public static void op10(String[][] classificacao) { //método para o utilizador pesquisar uma informação completa sobre uma equipa 
        boolean existe = false;
        sc.nextLine();
        System.out.println("Digite o nome da equipa que pretende procurar");
        String equipa = sc.nextLine();
        System.out.println("| Grp | Pos | Equipa          | Pts| J  | V  | E  | D  | GM | GS | GD |");
        for (int i = 0; i < MaxEquipas; i++) {
            if ((classificacao[i][2]).equalsIgnoreCase(equipa)) {
                existe = true;
                System.out.printf("|=====|=====|=================|====|====|====|====|====|====|====|====|\n|%-5s|%5s|%-17s|%4s|%4s|%4s|%4s|%4s|%4s|%4s|%4s|", classificacao[i][0], classificacao[i][1], classificacao[i][2], classificacao[i][3], classificacao[i][4], classificacao[i][5], classificacao[i][6], classificacao[i][7], classificacao[i][8], classificacao[i][9], classificacao[i][10]);
                System.out.println("");
                System.out.println("");
            }
        }
        if (!existe) {
            System.out.println("Não existe nenhuma equipa com o nome indicado");
            System.out.println("");
        }
    }

    //=======================================================================================================================================
    public static void op11(String[][] classificacao) throws FileNotFoundException {// método para criar um ficheiro de texto com as estatisticas dos jogos 
        try (PrintWriter pw = new PrintWriter(new File("C:\\Users\\andre\\Desktop\\Statistics.txt"))) {
            pw.println("Total de jogos= " + contador_de_stats(classificacao, 4) + "\nTotal de vitórias= " + contador_de_stats(classificacao, 5) + "\nTotal de empates= " + contador_de_stats(classificacao, 6) + "\nTotal de derrotas= " + contador_de_stats(classificacao, 7));
            pw.println("Total de golos marcados= " + contador_de_stats(classificacao, 8) + "\nTotal de golos sofridos= " + contador_de_stats(classificacao, 9));
            double golos_m_media = ((contador_de_stats(classificacao, 8)) / (contador_de_stats(classificacao, 4)));
            double golos_s_media = ((contador_de_stats(classificacao, 9)) / (contador_de_stats(classificacao, 4)));
            pw.printf("Média de golos marcados por jogo= %2.1f \nMédia de golos sofridos por jogo= %2.1f", golos_m_media, golos_s_media);
        }
    }

    //==========================================================================================
    public static int contador_de_stats(String[][] classificacao, int a) {
        int soma = 0;
        for (int i = 0; i < MaxEquipas; i++) {
            soma += Integer.parseInt(classificacao[i][a]);
        }
        return soma;
    }

    //============================================================================================
    public static String[][] op12(String[][] classificacao) { // método para remover da memória os 3ºs e 4ºs
        String[][] new_classificacao = new String[Finalistas][11];
        int y = 0;
        for (int i = 0; i < MaxEquipas; i++) {
            if (Integer.parseInt(classificacao[i][1]) < 3) {
                System.arraycopy(classificacao[i], 0, new_classificacao[y], 0, 11);
                y++;
            }
        }
        return new_classificacao;
    }

    //===============================================================================================================================
    public static void op13(String[][] classificacao) throws FileNotFoundException { // método para criar um ficheiro com as equipas que vão disputar a fase seguinte
        try (PrintWriter pw = new PrintWriter(new File("C:\\Users\\andre\\Desktop\\FinalStageGames.txt"))) {
            for (int i = 0; i < Finalistas; i++) {
                pw.println(classificacao[i][0] + "," + classificacao[i][1] + "," + classificacao[i][2] + "," + classificacao[i][3]);
            }
        }
    }

    //////////////////////
    public static void op14(String[][] classificacao) throws FileNotFoundException { // método para criar um ficheiro de texto com a fase final 
        int equipa1 = 0, equipa2 = 3, equipa3 = 1, equipa4 = 2;
        try (PrintWriter pw = new PrintWriter(new File("C:\\Users\\andre\\Desktop\\FinalStageGames.txt"))) {
            for (int i = 0; i < (Finalistas / 4); i++) {//dividir por 4 porque no for fazemos logo 2 equipas para nos facilitar o raciocinio
                pw.println(classificacao[equipa1][0] + "," + classificacao[equipa1][1] + "," + classificacao[equipa1][2] + "-" + classificacao[equipa2][0] + "," + classificacao[equipa2][1] + "," + classificacao[equipa2][2]);
                pw.println(classificacao[equipa3][0] + "," + classificacao[equipa3][1] + "," + classificacao[equipa3][2] + "-" + classificacao[equipa4][0] + "," + classificacao[equipa4][1] + "," + classificacao[equipa4][2]);
                equipa1 += 4;
                equipa2 += 4;
                equipa3 += 4;
                equipa4 += 4;
            }
        }
    }
}
