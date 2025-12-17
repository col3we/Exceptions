public class UserValidation {

    public static void validateCredentials(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (password.length() < 6 || password.length() > 20 || !password.matches("[a-zA-Z0-9_]+")) {
            throw new WrongPasswordException("Пароль должен содержать только латинские буквы, цифры и знак подчеркивания и быть длиной от 6 до 20 символов.");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Введены разные пароли");
        }
    }
}