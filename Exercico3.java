import java.util.Scanner;

public class Exercico3 {
    public static void main(String[] args) {
        Exercico3 exemplo = new Exercico3();
        exemplo.encontrarNumeroMaior();
    }

    public void encontrarNumeroMaior () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três números decimais:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double maior = num1;

        if (num2 > maior) {
            maior = num2;
        }

        if (num3 > maior) {
            maior = num3;
        }

        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
    }

