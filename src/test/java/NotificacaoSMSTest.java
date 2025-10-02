import not.INotificacao;
import not.NotificacaoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoSMSTest {

    @Test
    void deveEnviarSMS() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("SMS");
        assertEquals("SMS enviado: Código 1234", notificacao.enviar("Código 1234"));
    }
}