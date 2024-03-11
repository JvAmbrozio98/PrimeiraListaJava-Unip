import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Exercicio7 exemplo = new Exercicio7();
        exemplo.mediaCarros();
    }
    public void mediaCarros () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();

        System.out.print("Digite o valor total das vendas: ");
        double valorTotalVendas = scanner.nextDouble();

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor recebido por carro vendido: ");
        double valorPorCarroVendido = scanner.nextDouble();

        // Calculate the final salary
        double salarioFinal = salarioFixo + (carrosVendidos * valorPorCarroVendido) + (0.05 * valorTotalVendas);

        System.out.println("O salário final do vendedor é: R$ " + salarioFinal);

        scanner.close();
    }
}
