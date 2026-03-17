import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoginServiceTest {
    @Test
    public void deveRetornarVerdadeiroParaLoginValido() {
        LoginService service = new LoginService();
        assertTrue(service.autenticar("admin", "1234"));
    }

    @Test
    public void deveRetornarFalsoParaSenhaIncorreta() {
        LoginService service = new LoginService();
        assertFalse(service.autenticar("admin", "errada"));
    }
    @Test
    void deveRetornarFalsoParaUsuarioVazio() {
        LoginService service = new LoginService();
        assertFalse(service.autenticar("", "1234"));
    }

    @Test
    void deveRetornarFalsoParaSenhaVazia() {
        LoginService service = new LoginService();
        assertFalse(service.autenticar("admin", ""));
    }

    @Test
    void deveAceitarEmailValido() {
        LoginService service = new LoginService();
        assertTrue(service.validarEmail("teste@email.com"));
    }

    @Test
    void deveRejeitarEmailInvalido() {
        LoginService service = new LoginService();
        assertFalse(service.validarEmail("email-sem-arroba.com"));
    }

}