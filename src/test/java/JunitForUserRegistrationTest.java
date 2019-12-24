import com.bridgelabz.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class JunitForUserRegistrationTest {

    @Test
    public void WhenGivenFirstName_With3Char_ShouldReturnTrue() {

        UserRegistration testUserRegistration = new UserRegistration();
        boolean firstName = testUserRegistration.userFirstName("Sau");
        Assert.assertEquals(true,firstName);
    }

    @Test
    public void WhenGivenFirstName_Above3char_ShouldReturnTrue() {

        UserRegistration testUserRegistration = new UserRegistration();
        boolean firstName = testUserRegistration.userFirstName("Saurabh");
        Assert.assertEquals(true,firstName);
    }

    @Test
    public void WhenGivenFirstName_WithCharAndNumber_ShouldReturnFalse() {

        UserRegistration testUserRegistration = new UserRegistration();
        boolean firstName = testUserRegistration.userFirstName("Sau123");
        Assert.assertEquals(false,firstName);
    }

    @Test
    public void WhenGivenFirstName_WithFirstSmallLatter_ShouldReturnFalse() {

        UserRegistration testUserRegistration = new UserRegistration();
        boolean firstName = testUserRegistration.userFirstName("saurabh");
        Assert.assertEquals(false,firstName);
    }

    @Test
    public void WhenGivenFirstName_WithDot_ShouldReturnFalse() {

        UserRegistration testUserRegistration = new UserRegistration();
        boolean firstName = testUserRegistration.userFirstName("Saurabh.");
        Assert.assertEquals(false,firstName);
    }
}
