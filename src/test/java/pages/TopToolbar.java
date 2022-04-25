package pages;

import core.BaseSeleniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.MessagePage;

import java.util.List;

public class TopToolbar extends BaseSeleniumPage {
  @FindBy(xpath = "//ul[@class='toolbar_nav']")
  private WebElement toolbar;

  private final List< WebElement > buttons;

  public TopToolbar()
  {
    PageFactory.initElements(driver, this);
    buttons = toolbar.findElements(By.className("toolbar_nav_i"));
  }

  public MessagePage getMessagePage()
  {
    buttons.get(0).click();
    return new MessagePage();
  }

}
