import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testSuccessfulLogin() {
        assertEquals(
            "Login successful",
            App.login("admin", "1234")
        );
    }

    @Test
    void testFailedLogin() {
        assertEquals(
            "Invalid username or password",
            App.login("admin", "wrong")
        );
    }
}