import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Exercicio4 exemplo = new Exercicio4();
        exemplo.encontrarMenorNumero();
    }
    public  void encontrarMenorNumero () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três números decimais:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double menor = num1;

        if (num2 < menor) {
            menor = num2;
        }

        if (num3 < menor) {
            menor = num3;
        }

        System.out.println("O menor número é: " + menor);

        scanner.close();
    }
    }

