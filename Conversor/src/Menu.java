import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private final Scanner input;

    public Menu() {
        input = new Scanner(System.in);
    }

    public void exibirMenu() {
        System.out.println("\n=== Conversor de Moedas ===");
        System.out.println("1. Real para Dólar");
        System.out.println("2. Dólar para Real");
        System.out.println("3. Real para Euro");
        System.out.println("4. Euro para Real");
        System.out.println("5. Dólar para Euro");
        System.out.println("6. Euro para Dólar");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public int lerOpcao() {
        try {
            return input.nextInt();
        } catch (InputMismatchException e) {
            input.next(); // Limpar o buffer do scanner
            return -1; // Indicar opção inválida
        }
    }

    public double lerValor() {
        System.out.print("Digite o valor a ser convertido: ");
        return input.nextDouble();
    }
}