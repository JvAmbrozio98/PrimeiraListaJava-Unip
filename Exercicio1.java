import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Exercicio1 exemplo = new Exercicio1();
        exemplo.tabuada();

    }

    public void tabuada () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para gerar a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
    }

