package not;

public class NotificacaoSMS implements INotificacao {
    public String enviar(String mensagem) {
        return "SMS enviado: " + mensagem;
    }
}
