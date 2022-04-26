package core;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

//от него наследуются другие тестовые классы
//для настройки и инициализации драйвера
abstract public class BaseSeleniumTest {
    protected WebDriver driver;
    @Before
    public void setUp()
    {
        System.setProperty("webdriver.gecko.driver","/home/dasu/webdriver/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        BaseSeleniumPage.setDriver(driver);
    }
    @After
    public void tearDown()
    {
      driver.close();//закрытие драйвера
      driver.quit();
    }
}
