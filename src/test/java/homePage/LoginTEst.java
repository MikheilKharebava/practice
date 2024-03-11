package homePage;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import properties.userFactory;
import screens.HomeScreen;
import screens.inventoryScreen;
import user.User;

public class LoginTEst extends CommonConditions{

  User testUser;
  HomeScreen homeScreen;
  inventoryScreen invScreen;

  @BeforeMethod
  public void startPage(){
    testUser = userFactory.withStandardUser();
    homeScreen = new HomeScreen(driver);
    homeScreen.openPage();
    homeScreen.login(testUser);
    invScreen = new inventoryScreen(driver);
    invScreen.waitUntilScreenisLoaded();
  }

  @Test
  public void login(){
    assertTrue(invScreen.isScreenLoaded(), "no");
  }
}
