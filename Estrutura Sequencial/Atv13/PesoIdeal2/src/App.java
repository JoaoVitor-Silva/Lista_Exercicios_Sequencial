import java.util.Scanner;

//Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as
//seguintes fórmulas:
//a. Para homens: (72.7*h) - 58
//b. Para mulheres: (62.1*h) - 44.7

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        double Altura = in.nextDouble();
        
        double PesoIdealM = (72.2 * Altura) - 58;
        double PesoIdealF = (62.2 * Altura) - 44.7;

        System.out.println("Peso ideal: " + PesoIdealM);
        System.out.println("Peso ideal: " + PesoIdealF);
    }
}
