import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import page.object.OrderPage;
import java.util.stream.Stream;

import static page.object.MainPage.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static page.object.OrderPage.orderIsProcessed;

public class EntryPointsPositiveOrderFirefoxTest {
    private WebDriver driver;
    @BeforeEach
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get(MAIN_PAGE_URL);
    }
    @ParameterizedTest
    @MethodSource("orderParam")
    void firstEntryPointPositiveOrder(String username, String surname, String address, String metro, String telephone, String date, String comment) {
        OrderPage orderPage = new OrderPage(driver);
        orderPage.clickSignInTopButton();
        orderPage.setUsername(username);
        orderPage.setSurname(surname);
        orderPage.setAddress(address);
        orderPage.setMetroStation();
        orderPage.setMetroStationAction(metro);
        orderPage.secondClickMetroStation();
        orderPage.setTelephone(telephone);
        orderPage.clickNextButton();
        orderPage.setDate(date);
        orderPage.setLeaseTerm();
        orderPage.setLeaseTermClick();
        orderPage.clickButtonBlackColor();
        orderPage.setComment(comment);
        orderPage.clickOrderButton();
        orderPage.clickYesButton();
        String getRent = driver.findElement(orderIsProcessed).getText();
        assertEquals("Заказ оформлен\n" +
                "Номер заказа: .  Запишите его:\n" +
                "пригодится, чтобы отслеживать статус", getRent);
    }
    static Stream<Arguments> orderParam() {
        return Stream.of(
                Arguments.of("Владимир", "Денисенко", "Москва, Кутузовский проспект, д.1", "Черкизовская", "89998887766", "05.10.2021", "Тест"),
                Arguments.of("Пес", "Собака", "Будка, д.1", "Черкизовская", "89876543210", "01.02.2023", "Гав")
        );
    }
    @ParameterizedTest
    @MethodSource("orderParam")
    void secondEntryPointPositiveOrder(String username, String surname, String address, String metro, String telephone, String date, String comment) {
        OrderPage orderPage = new OrderPage(driver);
        orderPage.clickAppCookieButton();
        orderPage.clickSignInButtonBottom();
        orderPage.setUsername(username);
        orderPage.setSurname(surname);
        orderPage.setAddress(address);
        orderPage.setMetroStation();
        orderPage.setMetroStationAction(metro);
        orderPage.secondClickMetroStation();
        orderPage.setTelephone(telephone);
        orderPage.clickNextButton();
        orderPage.setDate(date);
        orderPage.setLeaseTerm();
        orderPage.setLeaseTermClick();
        orderPage.clickButtonBlackColor();
        orderPage.setComment(comment);
        orderPage.clickOrderButton();
        orderPage.clickYesButton();
        String getRent = driver.findElement(orderIsProcessed).getText();
        assertEquals("Заказ оформлен\n" +
                "Номер заказа: .  Запишите его:\n" +
                "пригодится, чтобы отслеживать статус", getRent);
    }
    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Закрытие браузера
        }
    }
}