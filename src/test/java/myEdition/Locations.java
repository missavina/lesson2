package myEdition;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locations {
    private final String HOME_PAGE = "http://rus.delfi.lv"; //если константа, то тип переменных capslock + _
    private final By SEARCH_FIELD = By.name("q");
    private final By SEARCH_BTN = By.xpath(".//a[@class = 'headerSearchInputBtn']");
    private final By CLOSE_COOKIE = By.xpath(".//a[@class = 'close cookie']");


    @Test
    public void delfiTest() {
        System.setProperty("webdriver.gecko.driver", "/Users/user/Desktop/project/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize(); //команда для задачи расхлопавания окна
        driver.get(HOME_PAGE); //здесь указываем тот адрес куда переходим
        driver.findElement(CLOSE_COOKIE).click();
        WebElement element = driver.findElement(SEARCH_FIELD);
        element.sendKeys("Riga");
        driver.findElement(SEARCH_BTN).click();
    }
}

