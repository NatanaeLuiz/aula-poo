package projeto2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class App {
    private static ArrayList<Produto> produtos = new ArrayList<>();
    private static int currentId = 1;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = -1; // Inicializando a variável opcao
        do {
            mostrarMenu();
            try {
                opcao = scanner.nextInt();
                scanner.nextLine();  // Consome a nova linha
                switch (opcao) {
                    case 1:
                        cadastrarProduto();
                        break;
                    case 2:
                        editarProduto();
                        break;
                    case 3:
                        deletarProduto();
                        break;
                    case 4:
                        listarProdutos();
                        break;
                    case 0:
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.nextLine(); // Limpa a entrada inválida
            }
        } while (opcao != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\nMenu:");
        System.out.println("0 - Sair do sistema");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Editar produto");
        System.out.println("3 - Deletar produto");
        System.out.println("4 - Visualizar lista de produtos");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarProduto() {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();
        System.out.print("Valor: ");
        double valor = scanner.nextDouble();

        Produto produto = new Produto(currentId++, nome, quantidade, valor);
        produtos.add(produto);

        System.out.println("Produto cadastrado com sucesso: " + produto);
    }

    private static void editarProduto() {
        System.out.print("ID do produto a editar: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consome a nova linha

        Produto produto = buscarProdutoPorId(id);
        if (produto != null) {
            System.out.print("Novo nome (atual: " + produto.getNome() + "): ");
            String nome = scanner.nextLine();
            System.out.print("Nova quantidade (atual: " + produto.getQuantidade() + "): ");
            int quantidade = scanner.nextInt();
            System.out.print("Novo valor (atual: " + produto.getValor() + "): ");
            double valor = scanner.nextDouble();

            produto.setNome(nome);
            produto.setQuantidade(quantidade);
            produto.setValor(valor);

            System.out.println("Produto atualizado com sucesso: " + produto);
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }

    private static void deletarProduto() {
        System.out.print("ID do produto a deletar: ");
        int id = scanner.nextInt();

        Produto produto = buscarProdutoPorId(id);
        if (produto != null) {
            produtos.remove(produto);
            System.out.println("Produto deletado com sucesso.");
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }

    private static void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("\n::::::::Lista de produtos:::::::::");
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }

    private static Produto buscarProdutoPorId(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }
}
