import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Exercicio2 exemplo = new Exercicio2();
        exemplo.posterioresEAnteriores();
    }

    public void posterioresEAnteriores () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita o numero ai");
        int entrada = scanner.nextInt();
        for(int i = 1;i <=50;i++) {
            System.out.println("O " + i +"º numero anterior é:"+ (entrada -i) + " e o numerior posterior: "+(entrada + i) );

        }
    }
}
