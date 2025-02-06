package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class FootagePage {
    protected WebDriver driver;

    public FootagePage(WebDriver driver){
        this.driver = driver;
    }

    //locator
    By WifiAdv = By.xpath("/html/body/footer/div/div/div[2]/ul[1]/li[1]/a");
    By HigiSpot = By.xpath("/html/body/footer/div/div/div[2]/ul[1]/li[2]/a");
    By IDA = By.xpath("/html/body/footer/div/div/div[2]/ul[1]/li[3]/a");
    By TentangHigo = By.xpath("/html/body/footer/div/div/div[2]/ul[2]/li[1]/a");
    By Karir = By.xpath("/html/body/footer/div/div/div[2]/ul[2]/li[2]/a");
    By Blog = By.xpath("/html/body/footer/div/div/div[2]/ul[2]/li[3]/a");
    By TermCondition = By.xpath("/html/body/footer/div/div/div[2]/ul[3]/li[1]/a");
    By PrivacyPolicy = By.xpath("/html/body/footer/div/div/div[2]/ul[3]/li[2]/a");


    //action
    public void WifiAdv(){
        driver.findElement(WifiAdv).click();
    }

    public void HigiSpot(){
        driver.findElement(HigiSpot).click();
    }

    public void IDA(){
        driver.findElement(IDA).click();
    }

    public void TentangHigo(){
        driver.findElement(TentangHigo).click();
    }

    public void karir(){
        driver.findElement(Karir).click();
    }

    public void Blog(){
        driver.findElement(Blog).click();
    }

    public void TermCondition(){
        driver.findElement(TermCondition).click();
    }

    public void TermConditionpage(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.urlContains("https://higo.id/terms-of-use-higospot"));
        //ambil URL saat ini
        String currentUrl = driver.getCurrentUrl();
        //validasi apakah URL benar
        Assert.assertEquals(currentUrl, "https://higo.id/terms-of-use-higospot", "Redirect URL tidak sesuai");
    }

    public void PrivacyPolicy(){
        driver.findElement(PrivacyPolicy).click();
    }

    public void PrivacyPolicypage(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.urlContains("https://higo.id/privacy-policy-higospot"));
        //ambil URL saat ini
        String currentUrl = driver.getCurrentUrl();
        //validasi apakah URL benar
        Assert.assertEquals(currentUrl, "https://higo.id/privacy-policy-higospot", "Redirect URL tidak sesuai");
    }
}
