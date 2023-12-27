import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LocadoraFilmes {
    public static void main(String[] args) {
        List<Filme> filmes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        filmes.add(new Comedia("As Branquelas", 2004, 2.5));
        filmes.add(new Suspense("Silêncio dos Inocentes", 1991, 3.0));
        filmes.add(new Terror("O Exorcista", 1973, 2.0));

        int opcao;
        do {
            System.out.println("\n===== Bem-vinde a locadora de filmes MEGA FILMES HD =====");
            System.out.println("");
            System.out.println("1. Mostrar todos os filmes disponíveis;");
            System.out.println("2. Alugar filme;");
            System.out.println("3. Sair;");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    mostrarFilmes(filmes);
                    break;
                case 2:
                    alugarFilme(filmes, scanner);
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("Saindo....");
                    System.out.println("Atendimento encerrado. Volte sempre <3");               
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }

    private static void mostrarFilmes(List<Filme> filmes) {
        System.out.println("\n=== Filmes disponíveis ===");
        for (int i = 0; i < filmes.size(); i++) {
            System.out.println(i + ". " + filmes.get(i));
        }
    }

    private static void alugarFilme(List<Filme> filmes, Scanner scanner) {
        System.out.println("\n=== Alugar Filme ===");
        System.out.print("Digite o número do filme que deseja alugar: ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < filmes.size()) {
            Filme filmeSelecionado = filmes.get(indice);
            System.out.print("Digite a quantidade de dias de locação: ");
            int dias = scanner.nextInt();

            double valorTotal = filmeSelecionado.calcularValorAluguel(dias);
            System.out.println("");
            System.out.println("Valor total do aluguel: R$" + valorTotal);
        } else {
            System.out.println("Índice inválido! Tente novamente.");
        }
    }
}