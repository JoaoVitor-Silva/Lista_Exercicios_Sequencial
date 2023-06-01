import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o valor da base: ");
        double Base = in.nextDouble();
        System.out.print("Informe a altura do quadrada");
        double altura = in.nextDouble();

        double Area = 2 * (Base * altura);

        System.out.print("Dobre da área do quadrado: " + Area);
    }
}
