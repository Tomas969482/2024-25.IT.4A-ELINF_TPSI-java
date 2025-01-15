import java.util.Random;

// Un oggetto di questa classe rappresenta un generatore di password
// casuali di una determinata lunghezza.
// Le password devono essere composte da soli CARATTERI MAIUSCOLI.
public class PasswordGenerator {

    private String password;
    // metodo che genera una password di lunghezza password_length
    // e la ritorna al chiamante.
    public String generate(int password_length) {
        password = "";
        for (int i = 0; i < password_length; i++) {
            char c = (char) (Math.random() * 26 + 'A');
            password += c;
        }
        return password;
        // TODO: genera una password causale composta da sole
        // lettere maiuscole.
    }
}
