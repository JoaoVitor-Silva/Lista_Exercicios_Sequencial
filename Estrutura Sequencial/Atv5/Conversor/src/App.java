import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        double Centimetros;

        System.out.print("Informe um valor em metros: ");
        double metros = in.nextDouble();

        Centimetros = metros * 100;

        System.out.println("Valor convertido " + Centimetros + "cm");
    }
}
