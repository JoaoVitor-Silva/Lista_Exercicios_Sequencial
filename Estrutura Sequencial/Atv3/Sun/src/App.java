import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Informe dois numeros: ");
        int First = in.nextInt();
        int Second = in.nextInt();

        int Sun = First + Second;

        System.out.print("A soma dos dois valores sera " + Sun);
    }
}
