package model;

import java.util.List;

public class Pedido {
    private int idPedido;
    private Cliente cliente;
    private List<Produto> produtos;
    private double valorTotal;

    public Pedido(int idPedido, Cliente cliente, List<Produto> produtos) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.produtos = produtos;
        this.valorTotal = calcularValorTotal();
    }

    private double calcularValorTotal() {
        return produtos.stream().mapToDouble(Produto::getPreco).sum();
    }

    public int getIdPedido() { return idPedido; }
    public Cliente getCliente() { return cliente; }
    public List<Produto> getProdutos() { return produtos; }
    public double getValorTotal() { return valorTotal; }
}
