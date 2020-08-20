import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class UcusSecPage extends  BasePage{
    public UcusSecPage(WebDriver driver) {
        super(driver);
    }

    public UcusSecPage ucusSec(){

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,450)");
        /*clickByXpath("//label[text()='Anadolu Jet']");
        clickByXpath("//label[text()='Pegasus']");
        clickByXpath("//label[text()='Birden Fazla Havayolu']");*/
        optionClick("input[class='from-in-button']", 1);

        waitBySeconds(1);

        /*clickByXpath("//label[text()='Anadolu Jet']");
        clickByXpath("//label[text()='Pegasus']");
        clickByXpath("//label[text()='Birden Fazla Havayolu']");*/
        optionClick("input[class='to-in-button']",1);

        waitBySeconds(2);

        clickElementCssSelector("button[class='bt-choose']");
        return new UcusSecPage(driver);
    }
}
