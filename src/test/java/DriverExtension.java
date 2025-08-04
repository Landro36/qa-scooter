import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static pageobject.MainPage.*;

public class DriverExtension implements BeforeEachCallback, AfterEachCallback {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @Override
    public void afterEach(ExtensionContext context) throws Exception {
        if (driver != null) {
            driver.quit();
        }
    }

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        driver = new ChromeDriver();
        driver.get(MAIN_PAGE_URL);
    }
}