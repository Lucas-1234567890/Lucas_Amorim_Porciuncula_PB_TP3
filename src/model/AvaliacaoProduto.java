package model;
import java.time.LocalDateTime;

public class AvaliacaoProduto {
    private int idAvaliacao;
    private int produtoId;
    private int clienteId;
    private int nota; // 1-5
    private String comentario;
    private LocalDateTime dataAvaliacao;

    public AvaliacaoProduto(int produtoId, int clienteId, int nota, String comentario) {
        this.produtoId = produtoId;
        this.clienteId = clienteId;
        this.nota = nota;
        this.comentario = comentario;
        this.dataAvaliacao = LocalDateTime.now();
    }

    // getters/setters
}
