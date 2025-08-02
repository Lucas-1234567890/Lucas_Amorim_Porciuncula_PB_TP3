package service;

import model.Pedido;

import java.io.*;

public class PedidoCSVService {

    private static final String PEDIDO_CSV = "data/pedidos.csv";

    public static void salvarPedido(Pedido pedido) {
        // Garante que o diretório existe
        File dir = new File("data");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(PEDIDO_CSV, true))) {
            StringBuilder sb = new StringBuilder();
            sb.append(pedido.getIdPedido()).append(",");
            sb.append(pedido.getCliente().getIdCliente()).append(",");
            sb.append(pedido.getCliente().getNome()).append(",");
            sb.append(pedido.getCliente().getEmail()).append(",");
            sb.append(pedido.getProdutos().size()).append(",");
            sb.append(pedido.getValorTotal()).append(",");

            // IDs dos produtos separados por -
            for (int i = 0; i < pedido.getProdutos().size(); i++) {
                sb.append(pedido.getProdutos().get(i).getIdProduto());
                if (i < pedido.getProdutos().size() - 1) sb.append("-");
            }

            writer.write(sb.toString());
            writer.newLine();
            System.out.println("Pedido salvo com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void listarPedidos() {
        try (BufferedReader reader = new BufferedReader(new FileReader(PEDIDO_CSV))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
                } catch (IOException e) {
                    System.out.println("Não foi possível ler o arquivo de pedidos.");
                }
            }
        }