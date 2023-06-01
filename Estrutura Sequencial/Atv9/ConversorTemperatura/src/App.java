import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe a temperatura em graus Fahrenheit: ");
        double Fahrenheit = in.nextDouble();

        double Celsius = 5 * ((Fahrenheit-32) / 9);

        System.out.print("Temperatutra em graus Celsius: " + Celsius + "°C");

    }
}
