public class LoginService {
    public boolean autenticar(String usuario, String senha) {
        if ("admin".equals(usuario) && "1234".equals(senha)) {
            return true;
        }
        return false;
    }

    public boolean validarEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        return email.contains("@") && email.contains(".");
    }
}