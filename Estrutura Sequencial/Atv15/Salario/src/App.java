import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        //A) Salario Bruto

        System.out.print("Salario bruto: ");
        double Salario = in.nextDouble();

        System.out.println("Salrio bruto: R$" + Salario);
        //B) IR (11%) - Imposto de renda

        double Ir = (Salario * 11) / 100; 
        System.out.println("IR (11%): R$" + Ir);
        //C) INSS ( 8% )

        double INSS = (Salario * 8) / 100;
        System.out.println("INSS (8%): R$" + INSS);

        //D) Sindicato ( 5% )

        double Sindicato = (Salario * 5) / 100;
        System.out.println("Sindicato (5%): R$" + Sindicato);

        //E) Salario Liquido

        double SalarioLiquido = Salario - Ir - INSS - Sindicato;
        System.out.println("Salario liquido: R$" + SalarioLiquido);

    }
}
