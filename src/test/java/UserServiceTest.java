import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserServiceTest {
    UserService userService = new UserService();

    @Test
    void testValidEmail() {
        // buat assertTrue dari function userService.isValidEmail
        assertTrue(userService.isValidEmail("validemail@gmail.com"));
        // buat assertFalse dari function userService.isValidEmail
        assertFalse(userService.isValidEmail("invalidemailatgmaildotcom"));
    }

    @Test
    void testValidPassword() {
        // buat assertTrue dari function userService.isValidPassword
        assertTrue(userService.isValidPassword("TestValidPassword123"));
        // buat assertFalse dari function userService.isValidPassword
        assertFalse(userService.isValidPassword("12345"));

    }
}