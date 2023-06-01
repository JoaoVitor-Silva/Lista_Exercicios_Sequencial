import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe as suas 4 notas abaixo: ");
        System.out.print("Nota 1: ");
        double Nota1 = in.nextDouble();
        System.out.print("Nota 2: ");
        double Nota2 = in.nextDouble();
        System.out.print("Nota 3: ");
        double Nota3 = in.nextDouble();
        System.out.print("Nota 4: ");
        double Nota4 = in.nextDouble();

        double Media = (Nota1 + Nota2 + Nota3 + Nota4) / 4;
        double Soma = Nota1 + Nota2 + Nota3 + Nota4;

        System.out.println("Media aritmetica: " + Media);
        System.out.println("Somatorio de todas as notas: " + Soma);
    }
}
