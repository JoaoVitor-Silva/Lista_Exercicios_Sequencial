import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        System.out.print("KG de peixe: ");
        int peso = in.nextInt();

        int excesso = peso - 50;
        double multa = Math.ceil(excesso) * 4;
        
        System.out.println("KG's peixe: " + peso +"Kg");
        System.out.println("Excesso: " + excesso +"Kg");
        System.out.println("Multa: R$" + multa);
    }
}
