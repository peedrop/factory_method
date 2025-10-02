import not.INotificacao;
import not.NotificacaoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoEmailTest {

    @Test
    void deveEnviarEmail() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("Email");
        assertEquals("E-mail enviado: Olá usuário!", notificacao.enviar("Olá usuário!"));
    }
}