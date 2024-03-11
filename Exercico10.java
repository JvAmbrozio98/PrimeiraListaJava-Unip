import java.util.Scanner;

public class Exercico10 {
    public static void main(String[] args) {
        Exercico10 exemplo = new Exercico10();
        exemplo.precoGasolina();
    }

    public void precoGasolina () {
        Scanner scanner = new Scanner(System.in);

        // Preços dos combustíveis
        final double PRECO_GASOLINA = 5.35;
        final double PRECO_ETANOL = 3.79;

        // Leitura dos dados
        System.out.print("Digite o número de litros vendidos: ");
        double litrosVendidos = scanner.nextDouble();

        System.out.print("Digite o tipo de combustível (E - Etanol, G - Gasolina): ");
        char tipoCombustivel = scanner.next().charAt(0);

        // Cálculo do valor a ser pago pelo cliente
        double valorTotal;
        if (tipoCombustivel == 'E' || tipoCombustivel == 'e') {
            if (litrosVendidos <= 20) {
                valorTotal = litrosVendidos * PRECO_ETANOL * 0.97; // Desconto de 3% para até 20 litros
            } else {
                valorTotal = litrosVendidos * PRECO_ETANOL * 0.95; // Desconto de 5% para mais de 20 litros
            }
        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
            if (litrosVendidos <= 20) {
                valorTotal = litrosVendidos * PRECO_GASOLINA * 0.96; // Desconto de 4% para até 20 litros
            } else {
                valorTotal = litrosVendidos * PRECO_GASOLINA * 0.94; // Desconto de 6% para mais de 20 litros
            }
        } else {
            System.out.println("Tipo de combustível inválido.");
            return; // Encerra o programa se o tipo de combustível for inválido
        }

        // Impressão do valor a ser pago pelo cliente
        System.out.println("Valor a ser pago pelo cliente: R$ " + valorTotal);

        scanner.close();
    }
}
