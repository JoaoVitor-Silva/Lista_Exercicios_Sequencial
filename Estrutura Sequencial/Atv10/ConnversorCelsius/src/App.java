import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Informe a temperatura em Celsius");
        double Celsius = in.nextDouble();

        double Fahrenheit = (Celsius * 1.8) + 32;

        System.out.print("Gruas Fahrenheit: " + Fahrenheit + "°F");
    }
}
