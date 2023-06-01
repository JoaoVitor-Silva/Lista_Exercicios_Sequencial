import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        int number = sc.nextInt();
        System.out.println("O numero informado foi " + number);
    }
}
