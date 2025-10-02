import not.INotificacao;
import not.NotificacaoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoPushTest {

    @Test
    void deveEnviarPush() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("Push");
        assertEquals("Notificação push enviada: Você tem uma nova mensagem", notificacao.enviar("Você tem uma nova mensagem"));
    }
}