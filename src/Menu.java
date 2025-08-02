import model.Cliente;
import model.Produto;
import model.Pedido;
import service.PedidoCSVService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void exibirMenu() {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Registrar novo pedido");
            System.out.println("2 - Listar pedidos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    Pedido pedido = criarPedido(sc);
                    PedidoCSVService.salvarPedido(pedido);
                    break;
                case 2:
                    System.out.println("\n--- Lista de Pedidos ---");
                    PedidoCSVService.listarPedidos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }

    private static Pedido criarPedido(Scanner sc) {
        System.out.print("ID do pedido: ");
        int idPedido = sc.nextInt();
        sc.nextLine();

        System.out.print("ID do cliente: ");
        int idCliente = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Email do cliente: ");
        String emailCliente = sc.nextLine();

        Cliente cliente = new Cliente(idCliente, nomeCliente, emailCliente);

        List<Produto> listaProdutos = new ArrayList<>();
        System.out.print("Quantos produtos deseja adicionar? ");
        int qtdProdutos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtdProdutos; i++) {
            System.out.println("Produto #" + (i + 1));
            System.out.print("ID do produto: ");
            int idProduto = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome do produto: ");
            String nomeProduto = sc.nextLine();

            System.out.print("Preço do produto: ");
            double precoProduto = sc.nextDouble();
            sc.nextLine();

            listaProdutos.add(new Produto(idProduto, nomeProduto, precoProduto));
        }

        return new Pedido(idPedido, cliente, listaProdutos);
    }
}