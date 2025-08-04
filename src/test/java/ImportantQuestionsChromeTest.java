import org.junit.jupiter.api.extension.RegisterExtension;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import pageobject.MainPage;
import pageobject.OrderPage;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImportantQuestionsChromeTest {
    @RegisterExtension
    private DriverExtension extension = new DriverExtension();

    @ParameterizedTest
    @MethodSource("accordionParam")
    void importantQuestionsParam(String question, String answer, String xpathQuestion, String xpathAnswer) {
        OrderPage orderPage = new OrderPage(extension.getDriver());
        orderPage.clickImportantQuestionsItem();
        orderPage.clickAppCookieButton();
        extension.getDriver().findElement(By.xpath(xpathQuestion)).click();
        String getQuestion = extension.getDriver().findElement(By.xpath(xpathQuestion)).getText();
        String getAnswer = extension.getDriver().findElement(By.xpath(xpathAnswer)).getText();
        assertEquals(question, getQuestion);
        assertEquals(answer, getAnswer);
    }

    static Stream<Arguments> accordionParam() {
        return Stream.of(
                Arguments.of("Сколько это стоит? И как оплатить?", //ОР первого вопроса
                        "Сутки — 400 рублей. Оплата курьеру — наличными или картой.", //ОР первого ответа
                        MainPage.firstQuestion,
                        MainPage.firstAnswer),
                Arguments.of("Хочу сразу несколько самокатов! Так можно?",
                        "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.",
                        MainPage.secondQuestion,
                        MainPage.secondAnswer),
                Arguments.of("Как рассчитывается время аренды?",
                        "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",
                        MainPage.thirdQuestion,
                        MainPage.thirdAnswer),
                Arguments.of("Можно ли заказать самокат прямо на сегодня?",
                        "Только начиная с завтрашнего дня. Но скоро станем расторопнее.",
                        MainPage.fourthQuestion,
                        MainPage.fourthAnswer),
                Arguments.of("Можно ли продлить заказ или вернуть самокат раньше?",
                        "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",
                        MainPage.fifthQuestion,
                        MainPage.fifthAnswer),
                Arguments.of("Вы привозите зарядку вместе с самокатом?",
                        "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",
                        MainPage.sixthQuestion,
                        MainPage.sixthAnswer),
                Arguments.of("Можно ли отменить заказ?",
                        "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",
                        MainPage.seventhQuestion,
                        MainPage.seventhAnswer),
                Arguments.of("Я живу за МКАДом, привезёте?",
                        "Да, обязательно. Всем самокатов! И Москве, и Московской области.",
                        MainPage.eighthQuestion,
                        MainPage.eighthAnswer)
        );
    }
}