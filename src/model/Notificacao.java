package model;
import java.time.LocalDateTime;

public class Notificacao {
    private int idNotificacao;
    private int pedidoId;
    private int clienteId;
    private String tipo; // Pedido, Pagamento, Envio, Entrega, Erro
    private LocalDateTime dataEnvio;
    private String mensagem;

    public Notificacao(int pedidoId, int clienteId, String tipo, String mensagem) {
        this.pedidoId = pedidoId;
        this.clienteId = clienteId;
        this.tipo = tipo;
        this.mensagem = mensagem;
        this.dataEnvio = LocalDateTime.now();
    }

   // GETTERS necessários pelo seu serviço
    public int getIdNotificacao() { return idNotificacao; }
    public int getPedidoId() { return pedidoId; }
    public int getClienteId() { return clienteId; }
    public String getTipo() { return tipo; }
    public LocalDateTime getDataEnvio() { return dataEnvio; }
    public String getMensagem() { return mensagem; }

    // SETTERS se precisar
    public void setIdNotificacao(int id) { this.idNotificacao = id; }
    public void setMensagem(String mensagem) { this.mensagem = mensagem; }
}
