import java.util.Scanner;

/**
 */
public class ExercicioF {

    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {

        String solido;
        double raio, altura;

        System.out.print("Insira o sólido: ");
        solido = tec.nextLine();
        while (!(solido.equalsIgnoreCase("fim"))) {
            if (solido.equalsIgnoreCase("esfera")) {
                System.out.print("Insira o raio: ");
                raio = tec.nextDouble();
                volumeEsfera(raio);
            } else {
                if (solido.equalsIgnoreCase("cilindro")) {
                    System.out.print("Insira o raio: ");
                    raio = tec.nextDouble();
                    System.out.print("Insira a altura: ");
                    altura = tec.nextDouble();
                    volumeCilindro(raio, altura);
                } else {
                    if (solido.equalsIgnoreCase("cone")) {
                        System.out.print("Insira o raio: ");
                        raio = tec.nextDouble();
                        System.out.print("Insira a altura:");
                        altura = tec.nextDouble();
                        volumeCone(raio, altura);
                    }
                }
            }
            System.out.print("Insira o sólido: ");
            solido = tec.nextLine();
        }
    }

    //------------------------------------------------------------------------------
    public static void volumeEsfera(double raio) {

        double volumeEsfera;

        volumeEsfera = ((4 * Math.PI) / 3) * (Math.pow(raio, 3));
        System.out.printf("Volume=%.2f%n", volumeEsfera);
    }

    //------------------------------------------------------------------------------
    public static void volumeCilindro(double raio, double altura) {

        double volumeCilindro;

        volumeCilindro = (Math.PI) * (Math.pow(raio, 2)) * (altura);
        System.out.printf("Volume=%.2f%n", volumeCilindro);
    }

    //------------------------------------------------------------------------------
    public static void volumeCone(double raio, double altura) {

        double volumeCone;

        volumeCone = (Math.PI) * (Math.pow(raio, 2)) * (altura / 3);
        System.out.printf("Volume=%.2f%n", volumeCone);
    }
}            
            
            
   