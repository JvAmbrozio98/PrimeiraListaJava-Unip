import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Exercicio8 exemplo = new Exercicio8();
        exemplo.aposentadoriaFuncionarios();
    }

    public void aposentadoriaFuncionarios () {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o número do empregado (código): ");
        int codigoEmpregado = scanner.nextInt();

        System.out.print("Digite o ano de nascimento do empregado: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        System.out.print("Digite o sexo Masculino ou Feminino : ");
        String sexo = scanner.next().toLowerCase();

        System.out.print("Digite o tempo de serviço : ");
        int tempoDeServico = Integer.valueOf(scanner.next());


        int idade = anoAtual - anoNascimento;

        // Verifica se o empregado está qualificado para a aposentadoria
        boolean qualificado = false;


        if (idade >= 65 && sexo.equals("masculino") && tempoDeServico >= 30) {
            qualificado = true;
        } else if (idade >= 60 && sexo.equals("feminino") && tempoDeServico >= 25 ) {
            qualificado = true;
        }

        // Imprime o resultado
        if (qualificado) {
            System.out.println("O empregado com código " + codigoEmpregado + " está qualificado para a aposentadoria.");
        } else {
            System.out.println("O empregado com código " + codigoEmpregado + " não está qualificado para a aposentadoria.");
        }

        scanner.close();
    }
    }

