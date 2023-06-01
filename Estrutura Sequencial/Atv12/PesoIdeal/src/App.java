//Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte
//fórmula: (72.7*altura) - 58

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        double Altura = in.nextDouble();
        
        double PesoIdeal = (72.2 * Altura) - 58;

        System.out.print("Peso ideal: " + PesoIdeal);
    }
}
