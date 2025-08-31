package model;

import java.math.BigDecimal;

public class Produto {
    private int idProduto;
    private String nome;
    private double preco;

    public Produto(int idProduto, String nome, double preco) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.preco = preco;
    }

    public int getIdProduto() { return idProduto; }
    public String getNome() { return nome; }
    public double getPreco() { return preco; }

    // Novo método para compatibilidade com BigDecimal
    public BigDecimal getPrecoAsBigDecimal() {
        return BigDecimal.valueOf(preco);
    }
}
