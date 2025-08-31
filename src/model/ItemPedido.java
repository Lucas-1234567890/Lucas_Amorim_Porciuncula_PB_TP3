package model;
import java.math.BigDecimal;

public class ItemPedido {
    private Produto produto;
    private int quantidade;
    private Endereco enderecoEntrega;

    public ItemPedido(Produto produto, int quantidade, Endereco enderecoEntrega) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.enderecoEntrega = enderecoEntrega;
    }

    public Produto getProduto() { return produto; }
    public int getQuantidade() { return quantidade; }
    public Endereco getEnderecoEntrega() { return enderecoEntrega; }

   public BigDecimal subtotal() {
    if (produto == null) return BigDecimal.ZERO;
    return produto.getPrecoAsBigDecimal().multiply(BigDecimal.valueOf(quantidade));
}

}
