import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    public WebDriver driver;


    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public HomePage callHomePage(){
        driver.get("https://www.ciceksepeti.com");
        return new HomePage(driver);
    }

    public void setById(String id, String value){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
        element.clear();
        element.sendKeys(value);
    }

    public void setByXpath(String xpath, String value){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        element.clear();
        element.sendKeys(value);
    }

    public void setByClassname(String className, String value){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.className(className)));
        element.clear();
        element.sendKeys(value);
    }

    public  void dropdownSelect(String css,String value)
    {
        Select dropdown = new Select(driver.findElement(By.cssSelector(css)));
        dropdown.selectByVisibleText(value);
    }

    public void clickById(String id){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.id(id)));
        driver.findElement(By.id(id)).click();
    }

    public void clickByXpath(String xpath){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        driver.findElement(By.xpath(xpath)).click();
    }

    public void clictToElement(WebElement element) {
        scrollToElement(element);
        waitBySeconds(1);
        element.click();
    }

    public void clickElementCssSelector(String key) {
        WebElement element = driver.findElement(By.cssSelector(key));
        clictToElement(element);
    }

    public void elementCssSelectorSendKey(String key,String value) {
        WebElement element = driver.findElement(By.cssSelector(key));
        element.clear();
        element.sendKeys(value);
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'center'})", element);
    }

    public void optionClick(String key,Integer number){
        List<WebElement> elements = driver.findElements(By.cssSelector(key));
        clictToElement(elements.get(number));
    }

    //Saniye cinsinden bekleme
    public void waitBySeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Milisaniye cinsinden bekleme
    /*public void waitByMilliSeconds(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/
}
