import java.util.Scanner;

public class Exercico9 {
    public static void main(String[] args) {
        Exercico9 exemplo = new Exercico9();
        exemplo.calcularOsvalores();
    }

    public void calcularOsvalores () {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados do produto
        System.out.print("Digite a descrição do produto: ");
        String descricaoProduto = scanner.nextLine();

        System.out.print("Digite a quantidade adquirida: ");
        int quantidadeAdquirida = scanner.nextInt();

        System.out.print("Digite o preço unitário: ");
        double precoUnitario = scanner.nextDouble();

        // Cálculo do total
        double total = quantidadeAdquirida * precoUnitario;

        // Cálculo do desconto
        double desconto;
        if (quantidadeAdquirida <= 5) {
            desconto = total * 0.02; // 2% de desconto
        } else if (quantidadeAdquirida <= 10) {
            desconto = total * 0.03; // 3% de desconto
        } else {
            desconto = total * 0.05; // 5% de desconto
        }

        // Cálculo do total a pagar
        double totalPagar = total - desconto;

        // Impressão dos resultados
        System.out.println("\nDescrição do Produto: " + descricaoProduto);
        System.out.println("Quantidade Adquirida: " + quantidadeAdquirida);
        System.out.println("Preço Unitário: R$ " + precoUnitario);
        System.out.println("Total: R$ " + total);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Total a Pagar: R$ " + totalPagar);

        scanner.close();
    }
}
