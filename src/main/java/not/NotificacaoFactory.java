package not;

public class NotificacaoFactory {
    public static INotificacao obterNotificacao(String tipo) {
        try {
            Class<?> classe = Class.forName("not.Notificacao" + tipo);
            Object objeto = classe.getDeclaredConstructor().newInstance();

            if (!(objeto instanceof INotificacao)) {
                throw new IllegalArgumentException("Classe inválida para notificação");
            }

            return (INotificacao) objeto;
        } catch (Exception ex) {
            throw new IllegalArgumentException("Tipo de notificação inexistente", ex);
        }
    }
}
