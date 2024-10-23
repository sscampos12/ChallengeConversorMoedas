import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        ConversorMoeda conversor = new ConversorMoeda();

        while (true) {
            menu.exibirMenu();
            int opcao = menu.lerOpcao();

            if (opcao == 0) {
                break;
            }

            if (opcao > 0 && opcao <= 6) {
                double valor = menu.lerValor();

                try {
                    double resultado = 0;
                    switch (opcao) {
                        case 1:
                            resultado = conversor.converter("BRL", "USD", valor);
                            break;
                        case 2:
                            resultado = conversor.converter("USD", "BRL", valor);
                            break;
                        case 3:
                            resultado = conversor.converter("BRL", "EUR", valor);
                            break;
                        case 4:
                            resultado = conversor.converter("EUR", "BRL", valor);
                            break;
                        case 5:
                            resultado = conversor.converter("USD", "EUR", valor);
                            break;
                        case 6:
                            resultado = conversor.converter("EUR", "USD", valor);
                            break;
                    }
                    System.out.println("Valor convertido: " + resultado);
                } catch (IOException | InterruptedException e) {
                    System.err.println("Erro na conversão: " + e.getMessage());
                }
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}