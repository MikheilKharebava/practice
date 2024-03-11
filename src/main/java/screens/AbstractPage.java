package screens;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
  protected WebDriver driver;
  protected AbstractPage(){}

  protected AbstractPage(WebDriver driver){
    this.driver=driver;
  }

  public abstract boolean isScreenLoaded();
}
