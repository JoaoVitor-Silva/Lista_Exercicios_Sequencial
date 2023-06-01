import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o valor do raio: ");
        double raio = in.nextDouble();

        double Area = Math.PI * Math.pow(raio, 2);

        System.out.print("Área do circulo: " + Area);
    }
}
