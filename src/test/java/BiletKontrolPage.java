import org.openqa.selenium.WebDriver;

public class BiletKontrolPage extends BasePage{
    public BiletKontrolPage(WebDriver driver) {
        super(driver);
    }

    public BiletKontrolPage biletBak(){
        waitBySeconds(3);
        clickByXpath("//span[text()='KAPAT']");
        clickElementCssSelector("div[class='options passenger']");
        waitBySeconds(1);
        dropdownSelect("select[id='select-list']","Business");
        waitBySeconds(1);
        setById("flight-from","Adana");
        setById("flight-to","Ankara");
        clickByXpath("//li[@class='ui-menu-item ui-state-focus']");

        clickElementCssSelector("div[class='search-form-item calendar departure datepicker-wrapper dtp-wrap-from']");
        optionClick("div[class='ui-datepicker-group ui-datepicker-group-last'] a[class='ui-state-default']",14);
        clickElementCssSelector("div[class='return-date ']");//Dönüş tarihi için takvimi aç
        optionClick("div[class='ui-datepicker-group ui-datepicker-group-last'] a[class='ui-state-default']",14);
        clickElementCssSelector("div[id='btnSearch']");

        return new BiletKontrolPage(driver);
    }
}
