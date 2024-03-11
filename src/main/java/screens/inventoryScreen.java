package screens;

import static waits.waits.waitForElementPresence;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class inventoryScreen extends AbstractPage{

  @FindBy(xpath = "//div[@class='inventory_item']")
  private WebElement inventoryItem;


  @Override
  public boolean isScreenLoaded() {
    return inventoryItem.isDisplayed();
  }

  public inventoryScreen(WebDriver driver) {
    super(driver);
    PageFactory.initElements(this.driver, this);
  }

  public inventoryScreen waitUntilScreenisLoaded(){
    waitForElementPresence(driver, By.xpath("//div[@class='inventory_item']"));
    return this;
  }

}
