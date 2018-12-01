package lesson17;

public class Authenticate {
    public static void main(String[] args) {
        System.out.println(verify("ashurbeyli7", "killer007", "killer007"));
        System.out.println(verify("ashurbeyli7", "killer007007007007007", "killer007"));
        System.out.println(verify("ashurbeyli7000070000700007700777", "killer007", "killer007"));
    }

    private static boolean verify(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Wrong login!");
            }
            if (password.length() > 20 || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Wrong password!");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            System.out.printf("%s %s %s\n" , login, password, confirmPassword);
        }
        return true;
    }
}
