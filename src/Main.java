public class Main {
    public static void main(String[] args) {
        String login = "user123";
        String password = "qwerty_1";
        String confirmPassword = "qwerty_1";

        try {
            UserValidation.validateCredentials(login, password, confirmPassword);
            System.out.println("Данные прошли валидацию");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
