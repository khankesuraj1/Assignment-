package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }

    public void open() {
        driver.get("https://arjitnigam.github.io/myDreams/");
    }

    public boolean isLoadingDone() {
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));
    }

    public boolean isMainContentVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("main"))).isDisplayed();
    }

    public void clickMyDreams() {
        driver.findElement(By.id("myDreamsBtn")).click();
    }
}
