package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Set;

public class NavBarPage {
    protected WebDriver driver;
    protected String baseUrl = "https://higo.id/";

    public NavBarPage(WebDriver driver){
        this.driver = driver;
    }

    //locator
    By TentangHigo = By.xpath("/html/body/header/div/div/nav/ul/li[1]/label[1]/a/span");
    By TentangHigoBtn = By.xpath("/html/body/main/section[4]/div/div/div/a");
    By TentangHigopage = By.xpath("/html/body/main/section[1]/div/div[2]/h1");

    By LayananHigo = By.xpath("/html/body/header/div/div/nav/ul/li[2]/label[1]/div/span");
    By WifiAdv = By.xpath("/html/body/header/div/div/nav/ul/li[2]/ul/li[1]/label[1]/a/span");
    By WifiAdvBtn = By.xpath("/html/body/main/section[7]/header/a");
    By WifiAdvpage = By.xpath("/html/body/main/section[1]/div/div[1]/h1");
    By HigoSpot = By.xpath("/html/body/header/div/div/nav/ul/li[2]/ul/li[2]/label[1]/a/span");
    By HigospotBtn = By.xpath("/html/body/main/section[7]/header/a");
    By Higospotpage = By.xpath("/html/body/main/section[1]/div/div[1]/h1");
    By IDA = By.xpath("/html/body/header/div/div/nav/ul/li[2]/ul/li[3]/label[1]/a/span");
    By IDABtn = By.xpath("/html/body/main/section[6]/header/a");
    By IDApage = By.xpath("/html/body/main/section[1]/div/div[1]/h1");

    By StudyKasus = By.xpath("/html/body/header/div/div/nav/ul/li[3]/label[1]/a/span");
    By StudyKasuspage = By.xpath("/html/body/main/section[1]/h1");
    By StudyKasusBtnAll = By.xpath("/html/body/main/section[2]/ul[1]/li[1]");
    By StudyKasusBtnHispot = By.xpath("/html/body/main/section[2]/ul[1]/li[2]");
    By HiSpotKintaroSushi = By.xpath("/html/body/main/section[2]/ul[2]/li[1]/a/div[2]");
    By HiSpotDevon = By.xpath("/html/body/main/section[2]/ul[2]/li[2]/a/div[1]/div[2]");
    By HiSpot21FPGelato = By.xpath("/html/body/main/section[2]/ul[2]/li[3]/a/div[1]/div[2]");
    By HiSpotWalkingDrum = By.xpath("/html/body/main/section[2]/ul[2]/li[4]/a/div[1]/div[2]");
    By StudyKasusBtnWifiAdv = By.xpath("/html/body/main/section[2]/ul[1]/li[3]");
    By WifiAdvLAice = By.xpath("/html/body/main/section[2]/ul[2]/li[2]/a/div[1]/div[2]");

    By Blog = By.xpath("/html/body/header/div/div/nav/ul/li[4]/label[1]/a/span");
    By DigitalReport = By.xpath("/html/body/header/div/div/nav/ul/li[5]/label[1]/a/span");
    By DownloadReportBtn = By.xpath("/html/body/main/div/section[1]/div[3]/div/div[2]/div/div/button");
    By DownloadReportForm = By.xpath("//*[@id='radix-:R7637rqbta:']");
    By HubHigo = By.xpath("/html/body/header/div/div/nav/ul/li[6]/label[1]/a/span");
    By HubHigopage = By.xpath("/html/body/main/div/section[1]/article/header/h1");

    By pilihanBahasa = By.xpath("/html/body/header/div/div/nav/ul/li[7]/label[1]/div");
    By Indonesia = By.xpath("/html/body/header/div/div/nav/ul/li[7]/ul/li[1]/label[1]/a/span");
    By Inggris = By.xpath("/html/body/header/div/div/nav/ul/li[7]/ul/li[2]/label[1]/a/span");

    //action
    public void openHigoWeb(){
        driver.get(baseUrl);
    }

    public void TentangHigo(){
        driver.findElement(TentangHigo).click();
    }

    public void TentangHigoPage(){
        driver.findElement(TentangHigopage).isDisplayed();
    }

    public void TentangHigoBtn(){
        driver.findElement(TentangHigoBtn).click();
    }

    public void linkedinHigo(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.urlContains("https://www.linkedin.com/company/pt-higo-fitur-indonesia"));
        //ambil URL saat ini
        String currentUrl = driver.getCurrentUrl();
        //validasi apakah URL benar
        Assert.assertEquals(currentUrl, "https://www.linkedin.com/company/pt-higo-fitur-indonesia", "Redirect URL tidak sesuai");
    }

    public void LayananHigo(){
        driver.findElement(LayananHigo).click();
    }

    public void WifiAdv(){
        driver.findElement(WifiAdv).click();
    }

    public void WifiAdvPage(){
        driver.findElement(WifiAdvpage).isDisplayed();
    }

    public void WifiAdvBtn(){
        driver.findElement(WifiAdvBtn).click();
        driver.findElement(HubHigopage).isDisplayed();
    }

    public void Higospot(){
        driver.findElement(HigoSpot).click();
    }

    public void HigospotPage(){
        driver.findElement(Higospotpage).isDisplayed();
    }

    public void HigospotBtn(){
        driver.findElement(HigospotBtn).click();
        driver.findElement(HubHigopage).isDisplayed();
    }

    public void IDA(){
        driver.findElement(IDA).click();
    }

    public void IDAPage(){
        driver.findElement(IDApage).isDisplayed();
    }

    public void IDABtn(){
        driver.findElement(IDABtn).click();
        driver.findElement(HubHigopage).isDisplayed();
    }

    public void StudyKasus(){
        driver.findElement(StudyKasus).click();
    }

    public void StudyKasusPage(){
        driver.findElement(StudyKasuspage).isDisplayed();
    }

    public void StudyKasusBtnAll(){
        driver.findElement(HiSpotKintaroSushi).isDisplayed();
        driver.findElement(WifiAdvLAice).isDisplayed();
    }

    public void StudyKasusBtnHigoSpot(){
        driver.findElement(StudyKasusBtnHispot).click();
        driver.findElement(HiSpotKintaroSushi).isDisplayed();
    }

    public void StudyKasusBtnWifiAdv(){
        driver.findElement(StudyKasusBtnWifiAdv).click();
        driver.findElement(WifiAdvLAice).isDisplayed();
    }

    public void Blog(){
        driver.findElement(Blog).click();
    }

    public void BlogPage(){
        //simpan tab asli sebelum membuka yang baru
        String originalTab = driver.getWindowHandle();

        //tunggu dan pindah ke tab baru
        Set<String> allTabs = driver.getWindowHandles();
        for (String tab : allTabs) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }

        //validasi URL tab baru
        String expectedURL = "https://blog.higo.id/";
        String actualURL = driver.getCurrentUrl();
        System.out.println("New Tab URL: " + actualURL);
        Assert.assertEquals(actualURL, expectedURL, "URL does not match!");
    }

    public void DigitalReport(){
        driver.findElement(DigitalReport).click();
    }

    public void DigitalReportPage(){
        driver.findElement(DownloadReportBtn).isDisplayed();
    }

    public void HubHigo(){
        driver.findElement(HubHigo).click();
    }

    public void HubHigoPage(){
        driver.findElement(HubHigopage).isDisplayed();
    }

    public void pilihanBahasaIndonesia(){
        driver.findElement(pilihanBahasa).click();
        driver.findElement(Indonesia).click();
    }

    public void pilihanBahasaInggris(){
        driver.findElement(pilihanBahasa).click();
        driver.findElement(Inggris).click();
    }

    public void Indonesianpage(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.urlContains("https://higo.id/"));
        //ambil URL saat ini
        String currentUrl = driver.getCurrentUrl();
        //validasi apakah URL benar
        Assert.assertEquals(currentUrl, "https://higo.id/", "Redirect URL tidak sesuai");
    }

    public void Inggrispage(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.urlContains("https://higo.id/en"));
        //ambil URL saat ini
        String currentUrl = driver.getCurrentUrl();
        //validasi apakah URL benar
        Assert.assertEquals(currentUrl, "https://higo.id/en", "Redirect URL tidak sesuai");
    }
}
