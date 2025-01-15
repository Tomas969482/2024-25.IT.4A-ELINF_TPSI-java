public class PasswordBreaker {
    final static int PASSWORD_LENGTH = 4;

    public static void main(String[] args) {
        System.out.println("Inizio PasswordBreaker");
        // viene creato un file protetto da una password segreta ...
        PasswordProtectedFile file = new PasswordProtectedFile(PASSWORD_LENGTH);
        // e un cracker che deve scoprire la password del file
        PasswordCracker cracker = new PasswordCracker(file, PASSWORD_LENGTH, 1);
        PasswordCracker cracker1 = new PasswordCracker(file, PASSWORD_LENGTH, 2);
        PasswordCracker cracker2 = new PasswordCracker(file, PASSWORD_LENGTH, 3);

        System.out.println("Un file password protected e' stato creato. ");
        System.out.println("Stiamo cercando di violare la password... ");
        System.out.println();
        //Cronometro crono = new Cronometro();
        //crono.start();
        cracker.start();
        cracker1.start();
        cracker2.start();
        //crono.stop();
        //System.out.println("La password segreta: " + secret_password);
    
    }
}
