import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

    }

    public void diasVividos () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade em anos, meses e dias:");

        System.out.print("Anos: ");
        int anos = scanner.nextInt();

        System.out.print("Meses: ");
        int meses = scanner.nextInt();

        System.out.print("Dias: ");
        int dias = scanner.nextInt();


        int idadeEmDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("A idade em dias é: " + idadeEmDias);

        scanner.close();
    }
}
