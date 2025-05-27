package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest {

    @Test
    public void testHomePageFunctionalities() {
        HomePage home = new HomePage(driver);
        home.open();

        Assert.assertTrue(home.isLoadingDone(), "Loading animation did not disappear");
        Assert.assertTrue(home.isMainContentVisible(), "Main content not visible");

        home.clickMyDreams();

        // Validate tabs opened
        Assert.assertEquals(driver.getWindowHandles().size(), 3, "Two new tabs were not opened");
    }
}
