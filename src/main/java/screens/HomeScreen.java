package screens;

import static waits.waits.waitForElementClickable;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import user.User;

public class HomeScreen extends AbstractPage{
  private final String URL = "https://www.saucedemo.com/";

  @FindBy(xpath = "//div[@class='login_logo']")
  private WebElement loginLogo;

  @FindBy(xpath = "//div[@class='login_credentials']")
  private WebElement loginCredentials;
  
  @FindBy(xpath = "//div[@class='login_password']")
  private WebElement password;

  @FindBy(xpath = "(//*[@class='input_error form_input'])[1]")
  private WebElement loginField;

  @FindBy(xpath = "(//*[@class='input_error form_input'])[2]")
  private WebElement passwordField;

  @FindBy(xpath = "//*[@class='submit-button btn_action']")
  private WebElement loginButton;

  @Override
  public boolean isScreenLoaded() {
    return loginLogo.isDisplayed();
  }

  public HomeScreen(WebDriver driver){
    super(driver);
    PageFactory.initElements(this.driver, this);
  }

  public HomeScreen openPage() {
    driver.navigate().to(URL);
    return this;
  }

  public boolean isLoginCredentialsDisplayed(){
    return loginCredentials.isDisplayed();
  }

  public boolean isPasswordDisplayed(){
    return password.isDisplayed();
  }

  public HomeScreen login(User user){
    loginField.sendKeys((user.getUserName()));
    passwordField.sendKeys(user.getPassword());
    waitForElementClickable(driver, loginButton).click();
    return this;
  }
}
