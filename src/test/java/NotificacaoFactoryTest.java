import not.INotificacao;
import not.NotificacaoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoFactoryTest {

    @Test
    void deveRetornarExcecaoParaNotificacaoInexistente() {
        try {
            INotificacao notificacao = NotificacaoFactory.obterNotificacao("Telegram");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de notificação inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaNotificacaoInvalida() {
        try {
            INotificacao notificacao = NotificacaoFactory.obterNotificacao("Invalida");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Classe inválida para notificação", e.getMessage());
        }
    }
}