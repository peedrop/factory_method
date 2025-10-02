import not.INotificacao;
import not.NotificacaoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoInvalidaTest {

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