public class LoginService {
    public boolean autenticar(String usuario, String senha) {
        if ("admin".equals(usuario) && "1234".equals(senha)) {
            return true;
        }
        return false;
    }

    public boolean validarEmail(String mail) {
        return false;
    }
}