package pages;

import core.BaseSeleniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MessagePage extends BaseSeleniumPage {
  @FindBy(xpath = "//msg-chats-list-item")
  private WebElement messageList;

  @FindBy(xpath = "//msg-input[@name='input']")
  private WebElement messageField;

  @FindBy(xpath = "//msg-button[@title='Отправить']")
  private WebElement submitButton;

  public MessagePage(){
    PageFactory.initElements(driver, this);
  }

  public MessagePage printMessage() {
    messageList.click();
    messageField.sendKeys("Hello!");
    submitButton.click();
    return this;
  }
}
