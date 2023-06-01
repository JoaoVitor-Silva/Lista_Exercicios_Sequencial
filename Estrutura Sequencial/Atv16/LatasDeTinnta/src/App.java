import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int QuantLatas;
        double FinalValue;

        Scanner in = new Scanner(System.in);

        System.out.print("Informe em m² o tamanho da parede: ");
        double Metros = in.nextDouble();

        if(Metros % 54 == 0){
            QuantLatas = (int)Metros / 54;
        }
        else{
            QuantLatas = (int)(Metros / 54) + 1;
        }

        FinalValue = QuantLatas * 80;

        System.out.println("Quantidade total de latas: " + QuantLatas);
        System.out.print("Valor total da compra: R$" + FinalValue);
    }
}
