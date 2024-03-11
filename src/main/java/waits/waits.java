package waits;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits {
  private static final int TIME_DURATION = 20;

  public static WebElement waitForElementClickable(WebDriver driver, WebElement element){
    return new WebDriverWait(driver, Duration.ofSeconds(TIME_DURATION))
        .until(ExpectedConditions.elementToBeClickable(element));
  }

  public static WebElement waitForElementPresence(WebDriver driver, By by){
    return new WebDriverWait(driver, Duration.ofSeconds(TIME_DURATION))
        .until(ExpectedConditions.presenceOfElementLocated(by));
  }
}
