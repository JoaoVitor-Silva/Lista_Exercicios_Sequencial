import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        double QuantLatas, QuantGaloes, Mistura;
        double PriceLatas, PriceGaloes;

        Scanner in = new Scanner(System.in);

        System.out.print("Informe em m² o tamanho da parede: ");
        double Metros = in.nextDouble();

        QuantLatas = Math.ceil(Metros / 108);
        QuantGaloes = Math.ceil(Metros / 21.6);

        double mistura_lata = (int)(Metros / 108) * 0.1;
        double mistura_galao = (int)((Metros - (mistura_lata * 108)) / 21.6) * 0.1;

        mistura_galao += (Metros - (mistura_lata * 18) % 3.6 != 0) ? 1 : 0;

        PriceLatas = QuantLatas * 80;
        PriceGaloes = QuantGaloes * 25;
        Mistura = ((mistura_lata * 80) + (mistura_galao * 25));

        System.out.println("Quantidade total de latas: " + QuantLatas);
        System.out.print("Latas: R$" + PriceLatas
                        +"\nGalões: R$" + PriceGaloes
                        +"\nMistura: R$" + Mistura);
    }
}
