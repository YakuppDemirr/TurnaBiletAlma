import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class YolcuBilgileri extends BasePage {
    public YolcuBilgileri(WebDriver driver) {
        super(driver);
    }

    public YolcuBilgileri bilgileriGir()
    {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,1150)");
        waitBySeconds(1);
        clickById("lb-male");
        waitBySeconds(2);
        elementCssSelectorSendKey("input[data-autocomplete-type='FirstName']","YAKUP");
        setByXpath("//input[@placeholder='Soyad' and @maxlength='20']","DEMİR");
        dropdownSelect("select[class='datepicker-select day-select day-of-birth']","21");
        dropdownSelect("select[class='datepicker-select month-select month-of-birth']","01");
        dropdownSelect("select[class='datepicker-select year-select year-of-birth']","1993");
        elementCssSelectorSendKey("input[class='citizenno ']","12345678901");
        elementCssSelectorSendKey("input[class='hesCode']","Y1D2012345");
        setById("txtPhone","5555555");
        setById("txtEmail","y@y.com.tr");

        return new YolcuBilgileri(driver);
    }
}
