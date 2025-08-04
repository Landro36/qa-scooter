package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage extends MainPage{

    public WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    //локатор поля ввода Имя
    static By nameField = By.xpath(".//input[@placeholder='* Имя']");

    //локатор поля ввода Фамилия
    static By surnameField = By.xpath(".//input[@placeholder='* Фамилия']");

    //локатор поля ввода Адрес, куда привезти заказ
    static By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");

    //локатор поля Станция метро
    static By metroStationField = By.xpath(".//input[@placeholder='* Станция метро']");

    //локатор прокерки Станция метро
    static By secondClickMetroStationField = By.xpath(".//div[text()='Черкизовская']");

    //локатор поля ввода Телефон
    static By telephoneField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");

    //локатор кнопки Далее
    static By nextButton = By.xpath(".//button[text()='Далее']");

    //локатор поля ввода Даты
    static By dateField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");

    //локатор поля Срок аренды
    static By leaseTerm = By.className("Dropdown-arrow");

    //локатор выбора Срок аренды
    static By leaseTermAction = By.xpath(".//div[@class='Dropdown-menu']/div[text()='трое суток']");

    //локатор поля Цвет самоката чёрный жемчуг
    static By blackColor = By.id("black");

    //локатор поля Цвет самоката серая безысходность
    static By greyColor = By.id("grey");

    //локатор поля ввода Комментарий
    static By commentField = By.xpath(".//input[@placeholder='Комментарий для курьера']");

    //локатор кнопки "Заказать" в конце формы Про аренду
    static By orderButton = By.xpath(".//div[starts-with(@class, 'Order_Buttons')]/button[text()='Заказать']");

    //локатор кнопки "Да" окна "Подтверждения"
    static By yesButton = By.xpath(".//button[text()='Да']");

    //локатор "Заказ оформлен"
    public static By orderIsProcessed = By.xpath(".//div[starts-with(@class, 'Order_ModalHeader')]");

    //метод клика по кнопке «Заказать» сверху страницы
    public void clickSignInTopButton() {
        driver.findElement(signInTopButton).click();
    }

    //метод клика по кнопке «Заказать» внизу страницы
    public void clickSignInButtonBottom() {
        driver.findElement(signInBottomButton).click();
    }

    //метод по закрытию сообщения о куках.
    public void clickAppCookieButton() {
        driver.findElement(appCookieButton).click();
    }

    //метод заполнения поля ввода Имя
    public void setUsername(String username) {
        driver.findElement(nameField).sendKeys(username);
    }

    //метод заполнения поля ввода Фамилия
    public void setSurname(String surname) {
        driver.findElement(surnameField).sendKeys(surname);
    }

    //метод заполнения поля ввода Адрес
    public void setAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    //метод клика по поля Станция метро
    public void setMetroStation() {
        driver.findElement(metroStationField).click();
    }

    //метод подтверждение выбора Станции метро
    public void secondClickMetroStation() {
        driver.findElement(secondClickMetroStationField).click();
    }

    //метод заполнения поля Станция метро
    public void setMetroStationAction(String metro) {
        driver.findElement(metroStationField).sendKeys(metro);
    }

    //метод заполнения поля ввода Телефон
    public void setTelephone(String telephone) {
        driver.findElement(telephoneField).sendKeys(telephone);
    }

    //метод клика по кнопке «Далее»
    public void clickNextButton() {
        driver.findElement(nextButton).click();
    }

    //метод заполнения поля ввода Даты
    public void setDate(String date) {
        driver.findElement(dateField).sendKeys(date);
    }

    //метод клика по поля Срок аренды
    public void setLeaseTerm() {
        driver.findElement(leaseTerm).click();
    }

    //метод выбора поля Срок аренды
    public void setLeaseTermClick() {
        driver.findElement(leaseTermAction).click();
    }

    //метод клика по "чёрный жемчуг"
    public void clickButtonBlackColor() {
        driver.findElement(blackColor).click();
    }

    //метод клика по "серая безысходность"
    public void clickButtonGreyColor() {
        driver.findElement(greyColor).click();
    }

    //метод заполнения поля ввода Комментарий
    public void setComment(String comment) {
        driver.findElement(commentField).sendKeys(comment);
    }

    //метод клика по кнопке «Заказать»
    public void clickOrderButton() {
        driver.findElement(orderButton).click();
    }

    //метод клика по кнопке "Да" окна "Подтверждения"
    public void clickYesButton() {
        driver.findElement(yesButton).click();
    }

    //Проверить, что заказ создался
    public void checkOrderOpenAndHasOrderNumber() {
        driver.findElement(orderIsProcessed);
    }

    //метод клика по аккордиону
    public void clickImportantQuestionsItem() {
        driver.findElement(importantQuestionsItem).click();
    }
}
