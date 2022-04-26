package pages;

import core.BaseSeleniumPage;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseSeleniumPage {
  TopToolbar toolbar;
  public MainPage()
  {
    toolbar = new TopToolbar();
    PageFactory.initElements(driver, this);
  }

  public MessagePage getMessagePage()
  {
   return toolbar.getMessagePage();
  }

}
