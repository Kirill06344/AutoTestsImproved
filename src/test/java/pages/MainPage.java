package pages;

import core.BaseSeleniumPage;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseSeleniumPage {
  TopToolbar toolbar = new TopToolbar();
  public MainPage()
  {
    PageFactory.initElements(driver, toolbar);
  }

  public MessagePage getMessagePage()
  {
   return toolbar.getMessagePage();
  }

}
