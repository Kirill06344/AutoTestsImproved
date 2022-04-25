package core;

import org.openqa.selenium.WebDriver;

//класс для передачи драйвера со страницы на страницу
abstract public class BaseSeleniumPage {
    protected static WebDriver driver;

    public static void setDriver(WebDriver webDriver)
    {
        driver = webDriver;
    }
}
