import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe quanto você recebe por hora: ");
        double ValuePerHour = in.nextDouble();
        System.out.print("Informe quantas horas você trabalhou: ");
        double HoursWork = in.nextDouble();

        double Salary = ValuePerHour * HoursWork;

        System.out.print("Você ira receber R$" + Salary);
    }
}
