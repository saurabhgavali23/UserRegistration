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


    //Test Cases For Mobile Number Of User

    @Test
    public void whenGivenMobileNumber_WithoutCountryCode_ShouldReturnFalse() {

        UserRegistration testUserRegistration = new UserRegistration();
        boolean mobileNo = testUserRegistration.userMobileNumber("9665234018");
        Assert.assertEquals(false,mobileNo);
    }

    @Test
    public void whenGivenMobileNumber_WithCountryCode_ShouldReturnTrue() {

        UserRegistration testUserRegistration = new UserRegistration();
        boolean mobileNo = testUserRegistration.userMobileNumber("91 9665234018");
        Assert.assertEquals(true,mobileNo);
    }

    @Test
    public void whenGivenMobileNumber_WithoutSpace_ShouldReturnFalse() {

        UserRegistration testUserRegistration = new UserRegistration();
        boolean mobileNo = testUserRegistration.userMobileNumber("919665234018");
        Assert.assertEquals(false,mobileNo);
    }

    @Test
    public void whenGivenMobileNumber_UnderTenDigit_ShouldReturnFalse() {

        UserRegistration testUserRegistration = new UserRegistration();
        boolean mobileNo = testUserRegistration.userMobileNumber("91 966523");
        Assert.assertEquals(false,mobileNo);
    }

    @Test
    public void whenGivenMobileNumber_WithFrontSpace_ShouldReturnFalse() {

        UserRegistration testUserRegistration = new UserRegistration();
        boolean mobileNo = testUserRegistration.userMobileNumber(" 9665234018");
        Assert.assertEquals(false,mobileNo);
    }


    //Test Cases For User's Password Test At Least 8 Character

    @Test
    public void WhenGivenPassword_WithEightCharOrMore_ShouldReturnTrue() {

        UserRegistration testUserRegistration = new UserRegistration();
        boolean password = testUserRegistration.userPassword("User@1234");
        Assert.assertEquals(true,password);
    }

    @Test
    public void WhenGivenPassword_UnderEightChar_ShouldReturnFalse() {

        UserRegistration testUserRegistration = new UserRegistration();
        boolean password = testUserRegistration.userPassword("User@1");
        Assert.assertEquals(false,password);
    }

    //Test Cases For User's Password Test At Least 1 Upper Case

    @Test
    public void WhenGivenPassword_AtLeastOneUpperCase_ShouldReturnTrue() {

        UserRegistration testUserRegistration = new UserRegistration();
        boolean password = testUserRegistration.userPassword("useR@1123");
        Assert.assertEquals(true,password);
    }
}
