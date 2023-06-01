import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite o Tamanho do arquivo:");
        double Archive = in.nextDouble();

        System.out.print("Digite a velocidade de download em Mbps: ");
        double Mbps = in.nextDouble();

        double SpeedDownload = Archive / (Mbps / 8);

        System.out.print("O download sera concluido em " + SpeedDownload + "s");
    }
}
