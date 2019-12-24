import com.bridgelabz.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class JunitForUserRegistrationTest {

    //Test Cases For Frist Name Of User
    @Test
    public void whenGivenFirstName_With3Char_ShouldReturnTrue() {

        UserRegistration testUserRegistration = new UserRegistration();
        boolean firstName = testUserRegistration.userFirstName("Sau");
        Assert.assertEquals(true,firstName);
    }

    @Test
    public void whenGivenFirstName_Above3char_ShouldReturnTrue() {

        UserRegistration testUserRegistration = new UserRegistration();
        boolean firstName = testUserRegistration.userFirstName("Saurabh");
        Assert.assertEquals(true,firstName);
    }

    @Test
    public void whenGivenFirstName_WithCharAndNumber_ShouldReturnFalse() {

        UserRegistration testUserRegistration = new UserRegistration();
        boolean firstName = testUserRegistration.userFirstName("Sau123");
        Assert.assertEquals(false,firstName);
    }

    @Test
    public void whenGivenFirstName_WithFirstSmallLatter_ShouldReturnFalse() {

        UserRegistration testUserRegistration = new UserRegistration();
        boolean firstName = testUserRegistration.userFirstName("saurabh");
        Assert.assertEquals(false,firstName);
    }

    @Test
    public void whenGivenFirstName_WithDot_ShouldReturnFalse() {

        UserRegistration testUserRegistration = new UserRegistration();
        boolean firstName = testUserRegistration.userFirstName("Saurabh.");
        Assert.assertEquals(false,firstName);
    }


    //Test Cases For Last Name Of User

    @Test
    public void whenGivenLastName_With3Char_ShouldReturnTrue() {

        UserRegistration testUserRegistration = new UserRegistration();
        boolean lastName = testUserRegistration.userLastName("Gav");
        Assert.assertEquals(true,lastName);
    }

    @Test
    public void whenGivenLastName_Above3char_ShouldReturnTrue() {

        UserRegistration testUserRegistration = new UserRegistration();
        boolean lastName = testUserRegistration.userLastName("Gavali");
        Assert.assertEquals(true,lastName);
    }

    @Test
    public void whenGivenLastName_WithCharAndNumber_ShouldReturnFalse() {

        UserRegistration testUserRegistration = new UserRegistration();
        boolean lastName = testUserRegistration.userLastName("Gavali123");
        Assert.assertEquals(false,lastName);
    }

    @Test
    public void whenGivenLastName_WithFirstSmallLatter_ShouldReturnFalse() {

        UserRegistration testUserRegistration = new UserRegistration();
        boolean lastName = testUserRegistration.userLastName("gavali");
        Assert.assertEquals(false,lastName);
    }

    @Test
    public void whenGivenLastName_WithDot_ShouldReturnFalse() {

        UserRegistration testUserRegistration = new UserRegistration();
        boolean lastName = testUserRegistration.userLastName("Gavali.");
        Assert.assertEquals(false,lastName);
    }


    //Test Cases For Email ID Of User

    @Test
    public void whenGivenEmailID_WithFullID_ShouldReturnTrue() {

        UserRegistration testUserRegistration = new UserRegistration();
        boolean emailId = testUserRegistration.userEmailId("gavalisaurabh02@gmail.com");
        Assert.assertEquals(true,emailId);
    }

    @Test
    public void whenGivenEmailID_WithDoubleDot_ShouldReturnFalse() {

        UserRegistration testUserRegistration = new UserRegistration();
        boolean emailId = testUserRegistration.userEmailId("gavalisaurabh02@gmail..com");
        Assert.assertEquals(false,emailId);
    }
}
