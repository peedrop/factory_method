package not;

public class NotificacaoEmail implements INotificacao {
    public String enviar(String mensagem) {
        return "E-mail enviado: " + mensagem;
    }
}
