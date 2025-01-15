// Un oggetto di questa classe rappresenta un hacker che cerca di violare
// la password segreta per aprire il file protetto che viene ricevuto nel
// costruttore.
public class PasswordCracker extends Thread {
    private PasswordGenerator passwordGenerator;
    private PasswordProtectedFile fileToCrack;
    private int password_length;
    private int num;

    public PasswordCracker(PasswordProtectedFile file, int password_length, int num) {
        this.password_length = password_length;
        this.passwordGenerator = new PasswordGenerator();
        this.fileToCrack = file;
        this.num = num;
    }

    private String crack_it() {
        String password = "";
        do {
            password = passwordGenerator.generate(password_length);
            
        }
        while (!fileToCrack.open(password));
        return password;
        }
        // TODO: continua a generaqre password tramite un generatore
        // fino a quando non ottiene la corrispondenza con la password
        // del file. A questo punto ritorna la password al chiamante.

    public void run() {
        Cronometro crono = new Cronometro();
        crono.start();
        String secret_password = crack_it();
        crono.stop();
        System.out.println("Il cracker " + num + " ha violato la password in: " + crono.elapsed() + " millisecondi");
        System.out.println("La password segreta: " + secret_password);

    }



    }



