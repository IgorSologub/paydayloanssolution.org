package tests.faq;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.Header.HEADER_TITLES;
import static constants.Constant.Header.NUMBER_OF_GOOD_HEADER_BUTTONS;
import static constants.Constant.Urls.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FaqTest extends BaseTest {

    @BeforeEach
    public void setUp () {
        startDriver("faq");
        basePage.goToUrl(FAQ_PAGE_URL);
        basePage.waitOneSeconds();
    }

    @Test
    public void headerButtonsTest () {
        int goodTitlesCount = 0;
        for (int i = 1; i <= NUMBER_OF_GOOD_HEADER_BUTTONS; i++) {
            basePage.headerMenuOpen();
            basePage.waitOneSeconds();
            basePage.headerButtonClick(i);
            basePage.waitOneSeconds();
            if (basePage.checkTitles(HEADER_TITLES)) { goodTitlesCount++; }
            else { basePage.outputWrongTitle(); }
            basePage.back(FAQ_PAGE_URL);
        }
        assertEquals(NUMBER_OF_GOOD_HEADER_BUTTONS, goodTitlesCount);
    }

    @Test
    public void mainLogoLinkTest () {
        basePage.mainLogoButtonClick();
        basePage.waitOneSeconds();
        assertEquals(MAIN_PAGE_URL, basePage.getCurrentUrl());
    }

    @Test
    public void getStartedNowInHeaderButtonTest () {
        basePage.headerMenuOpen();
        basePage.waitOneSeconds();
        basePage.getStartedNowInHeaderButtonClick();
        basePage.waitFiveSeconds();
        assertEquals("https://paydayloanssolution.org/order/?ref=paydayloanssolution-org-faq", basePage.getCurrentUrl());
    }

    @Test
    public void faqButtonTest () {
        faqPage.faqButtonClick();
        basePage.waitOneSeconds();
        assertTrue(faqPage.faqTextBlockCheck());
    }

}
