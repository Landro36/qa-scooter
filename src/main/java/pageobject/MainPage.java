package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    public final static String MAIN_PAGE_URL = "https://qa-scooter.praktikum-services.ru/";

    public WebDriver driver;

    //локатор кнопки «Заказать» вверху страницы
    public static By signInTopButton = By.xpath(".//div[starts-with(@class, 'Header_Nav')]/button[text()='Заказать']");

    //локатор кнопки «сообщения о куках»
    static By appCookieButton = By.id("rcc-confirm-button");

    //локатор «Вопросы о важном»
    static By importantQuestionsItem = By.xpath(".//div[text()='Вопросы о важном']");

    //локатор кнопки «Заказать» внизу страницы
    static By signInBottomButton = By.xpath(".//div[starts-with(@class, 'Home_FinishButton')]/button[text()='Заказать']");

    //локатор логотип «Самоката»
    static By logoScooter = By.xpath(".//img[@alt='Scooter']");

    //локатор логотип «Яндекса»
    static By logoYandex = By.xpath(".//img[@alt='Yandex']");

    //локатор кнопки Статус заказа
    static By orderStatusButton = By.xpath(".//button[text()='Статус заказа']");

    //локатор поля ввода "Введите номер заказа"
    static By orderNumberField = By.xpath(".//input[@placeholder='Введите номер заказа']");

    //локатор кнопки "Go!"
    static By goButton = By.xpath(".//button[text()='Go!']");

    //локатор первого вопроса
    public static String firstQuestion = "//*[@id='accordion__heading-0']";

    //локатор второго вопроса
    public static String secondQuestion = "//*[@id='accordion__heading-1']";

    //локатор третьего вопроса
    public static String thirdQuestion = "//*[@id='accordion__heading-2']";

    //локатор четвертого вопроса
    public static String fourthQuestion = "//*[@id='accordion__heading-3']";

    //локатор пятого вопроса
    public static String fifthQuestion = "//*[@id='accordion__heading-4']";

    //локатор шестого вопроса
    public static String sixthQuestion = "//*[@id='accordion__heading-5']";

    //локатор седьмого вопроса
    public static String seventhQuestion = "//*[@id='accordion__heading-6']";

    //локатор восьмого вопроса
    public static String eighthQuestion = "//*[@id='accordion__heading-7']";

    //локатор первого ответа
    public static String firstAnswer = "//*[@id='accordion__panel-0']";

    //локатор второго ответа
    public static String secondAnswer = "//*[@id='accordion__panel-1']";

    //локатор третьего ответа
    public static String thirdAnswer = "//*[@id='accordion__panel-2']";

    //локатор четвертого ответа
    public static String fourthAnswer = "//*[@id='accordion__panel-3']";

    //локатор пятого ответа
    public static String fifthAnswer = "//*[@id='accordion__panel-4']";

    //локатор шестого ответа
    public static String sixthAnswer = "//*[@id='accordion__panel-5']";

    //локатор седьмого ответа
    public static String seventhAnswer = "//*[@id='accordion__panel-6']";

    //локатор восьмого ответа
    public static String eighthAnswer = "//*[@id='accordion__panel-7']";

    //метод клика по кнопке «Заказать» сверху страницы
    public void clickSignInTopButton() {
        driver.findElement(signInTopButton).click();
    }

    //метод по закрытию сообщения о куках.
    public void clickAppCookieButton() {
        driver.findElement(appCookieButton).click();
    }

    //метод клика по кнопке «Заказать» внизу страницы
    public void clickSignInButtonBottom() {
        driver.findElement(signInBottomButton).click();
    }

    //метод клика по логотип «Самоката»
    public void clickLogoScooter() {
        driver.findElement(logoScooter).click();
    }

    //метод клика по логотип «Yandex»
    public void clickLogoYandex() {
        driver.findElement(logoYandex).click();
    }

    //метод клика по кнопки Статус заказа
    public void clickButtonOrderStatus() {
        driver.findElement(orderStatusButton).click();
    }

    //метод клика по кнопки "Go!"
    public void clickButtonGo() {
        driver.findElement(goButton).click();
    }
}
