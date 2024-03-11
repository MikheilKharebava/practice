package homePage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import properties.userFactory;
import screens.HomeScreen;
import screens.inventoryScreen;
import user.User;

import static org.testng.Assert.assertTrue;

public class HomePageTest extends CommonConditions{

  User testUser;
  HomeScreen homeScreen;
  SoftAssert softAssert;

  @Test()
  public void verifyElementsOnHomePage(){
    softAssert = new SoftAssert();
    homeScreen = new HomeScreen(driver);
    homeScreen.openPage();
    softAssert.assertTrue(homeScreen.isScreenLoaded(), "it is not displayed");
    softAssert.assertTrue(homeScreen.isLoginCredentialsDisplayed(), "it is not displayed");
    softAssert.assertTrue(homeScreen.isPasswordDisplayed(), "password is ont displayed");
    softAssert.assertAll();
  }

}
