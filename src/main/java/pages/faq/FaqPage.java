package pages.faq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class FaqPage extends BasePage {

    public FaqPage (WebDriver driver) {super(driver);}

    private final By faqButton = By.xpath("(//button[@class='y6M438G-Cwa'])[1]");
    private final By faqTextBlock = By.xpath("//div[@class='collapse in']");

    public FaqPage faqButtonClick () {
        driver.findElement(faqButton).click();
        return this;
    }

    public boolean faqTextBlockCheck () {
        return elementVisibleCheck(faqTextBlock);
    }

}
