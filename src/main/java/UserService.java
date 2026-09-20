public class UserService {
    public boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

    public boolean isValidPassword(String password) {
        // Password minimal 8 karakter
        return password != null && password.length() >= 8;
    }
}
