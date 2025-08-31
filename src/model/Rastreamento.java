package model;
import java.time.LocalDateTime;

public class Rastreamento {
    private int idRastreamento;
    private int pedidoId; // refere ao pedido
    private String etapa; // Separação, Embalagem, Envio, Transporte, Entrega
    private LocalDateTime dataAtualizacao;
    private String status; // Concluída, Pendente, Em progresso

    public Rastreamento(int idRastreamento, int pedidoId, String etapa, String status) {
        this.idRastreamento = idRastreamento;
        this.pedidoId = pedidoId;
        this.etapa = etapa;
        this.status = status;
        this.dataAtualizacao = LocalDateTime.now();
    }

    public void atualizarEtapa(String etapa, String status) {
        this.etapa = etapa;
        this.status = status;
        this.dataAtualizacao = LocalDateTime.now();
    }

    // getters/setters
}
