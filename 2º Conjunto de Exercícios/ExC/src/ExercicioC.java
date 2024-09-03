import java.util.Scanner;

/**
 */
public class ExercicioC {

    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b, c;
        double anguloAB, anguloAC, anguloBC;

        System.out.println("Insira os lados do triângulo:");
        System.out.print("a=");
        a = tec.nextInt();
        System.out.print("b=");
        b = tec.nextInt();
        System.out.print("c=");
        c = tec.nextInt();
        if (a < b + c && b < a + c && c < b + a && b > 0 && c > 0 && a > 0) {
            anguloAB = calcAng(a, b, c);
            anguloAC = calcAng(a, c, b);
            anguloBC = calcAng(b, c, a);
            System.out.printf("a=%d%n", a);
            System.out.printf("b=%d%n", b);
            System.out.printf("c=%d%n", c);
            System.out.printf("ang(a,b)=%.0f%n", anguloAB);
            System.out.printf("ang(a,c)=%.0f%n", anguloAC);
            System.out.printf("ang(b,c)=%.0f%n", anguloBC);
        } else {
            System.out.println("Impossível");
        }
    }

    //----------------------------------------------------------------------------------------------------------------------------------------------------------
    public static double calcAng(int a, int b, int c) {

        double angulo;

        angulo = (int) (Math.toDegrees(java.lang.Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b))));

        return angulo;
    }
}
