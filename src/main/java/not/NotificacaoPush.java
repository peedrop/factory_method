package not;

public class NotificacaoPush implements INotificacao {
    public String enviar(String mensagem) {
        return "Notificação push enviada: " + mensagem;
    }
}
