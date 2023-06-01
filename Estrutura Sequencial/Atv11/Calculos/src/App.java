import java.util.Scanner;

//Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
//a. o produto do dobro do primeiro com metade do segundo .
//b. a soma do triplo do primeiro com o terceiro.
//c. o terceiro elevado ao cubo.

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Insira dois numeros inteiros: ");
        int FirstInt = in.nextInt();
        double SecondInt = in.nextInt();
        System.out.print("Insira um numero real: ");
        double Third = in.nextDouble();

        double A = (FirstInt * 2) * (SecondInt / 2);
        double B = ((FirstInt * 3) + Third);
        double C = Math.pow(Third, 3);

        System.out.println("A) " + A);
        System.out.println("A) " + B);
        System.out.println("A) " + C);
    }
}
