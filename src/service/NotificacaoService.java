package service;
import model.Notificacao;

public class NotificacaoService {
    // temporário: simula envio de email escrevendo no console/log
    public boolean enviarNotificacao(Notificacao n) {
        if (n == null) return false;
        System.out.println("=== Enviando NOTIFICAÇÃO ===");
        System.out.println("Para clienteId: " + n.getClienteId());
        System.out.println("Tipo: " + n.getTipo());
        System.out.println("Mensagem: " + n.getMensagem());
        System.out.println("Data: " + n.getDataEnvio());
        System.out.println("=============================");
        return true;
    }
}
