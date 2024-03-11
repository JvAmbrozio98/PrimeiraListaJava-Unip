import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Exercicio6 exemplo = new Exercicio6();
        exemplo.dadosEleitorais();
    }
    public void dadosEleitorais () {
        Scanner scanner = new Scanner(System.in);

        // Read input data
        System.out.println("Digite os dados da eleição:");
        System.out.print("Nome do município: ");
        String municipio = scanner.nextLine();
        System.out.print("Total de eleitores: ");
        int totalEleitores = scanner.nextInt();
        System.out.print("Número de votos em branco: ");
        int votosBranco = scanner.nextInt();
        System.out.print("Número de votos nulos: ");
        int votosNulos = scanner.nextInt();
        System.out.print("Número de votos válidos: ");
        int votosValidos = scanner.nextInt();

        // Calculate percentages
        double percentVotosBranco = (double) votosBranco / totalEleitores * 100;
        double percentVotosNulos = (double) votosNulos / totalEleitores * 100;
        double percentVotosValidos = (double) votosValidos / totalEleitores * 100;

        // Print results
        System.out.println("\nResultados da eleição em " + municipio + ":");
        System.out.println("Totais             Quantidade       Porcentagem");
        System.out.println("Eleitores          " + totalEleitores + "              100%");
        System.out.println("Votos em branco    " + votosBranco + "               " + percentVotosBranco + "%");
        System.out.println("Votos nulos        " + votosNulos + "               " + percentVotosNulos + "%");
        System.out.println("Votos válidos      " + votosValidos + "               " + percentVotosValidos + "%");

        scanner.close();
    }
}
