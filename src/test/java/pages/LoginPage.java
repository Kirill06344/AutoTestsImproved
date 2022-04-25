package pages;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import properties.ConfigProvider;

public class LoginPage extends BaseSeleniumPage {
  /* Удобство использования @FindBy заключается в том,
     что инициализация элемента происходит только тогда,
     когда мы к нему обращаемся
   */
  @FindBy(id = "field_email")
  private WebElement emailField;
  @FindBy(id = "field_password")
  private WebElement passwordField;
  @FindBy(xpath = "//input[@type='submit']")
  private WebElement entryButton;
  public LoginPage()
  {
    driver.get(ConfigProvider.URL);
    PageFactory.initElements(driver, this);
  }
  public MainPage login()
  {
    emailField.sendKeys(ConfigProvider.PHONE);
    passwordField.sendKeys(ConfigProvider.PASSWORD);
    entryButton.click();
    return new MainPage();
  }
}
