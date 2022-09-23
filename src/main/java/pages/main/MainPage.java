package pages.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MainPage extends BasePage {

    public MainPage (WebDriver driver) {super(driver);}

    private final By getStartedNowButton = By.xpath("//a[@class='Hfn1KW-mPSs4 Ddcv5y5jQfZ blOwJx words chars splitting']");

    public MainPage getStartedNowButtonClick () {
        driver.findElement(getStartedNowButton).click();
        return this;
    }

    public MainPage readMoreButtonClick (int numButton) {
        By readMoreButton = By.xpath("(//a[@class='PhrkB8V words chars splitting'])[" + numButton + "]");
        driver.findElement(readMoreButton).click();
        return this;
    }

}
