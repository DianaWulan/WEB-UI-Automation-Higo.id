package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.NavBarPage;
import utils.DriverFactory;

public class NavBarStep {
    //Before
    private WebDriver driver = DriverFactory.getDriver(); // Ambil instance driver dari DriverFactory
    private NavBarPage navBarPage = new NavBarPage(driver);  // Buat instance LoginPage

    @Given("enter the higo website")
    public void enterTheHigoWebsite() {
        navBarPage.openHigoWeb();
    }

    @When("user click TentangHigo")
    public void userClickTentangHigo() {
        navBarPage.TentangHigo();
    }

    @Then("user in the TentangHigo page")
    public void userInTheTentangHigoPage() {
        navBarPage.TentangHigoPage();
    }

    @And("check JadiBagianHigo button")
    public void checkJadiBagianHigoButton() {
        navBarPage.TentangHigoBtn();
        navBarPage.linkedinHigo();
    }

    @When("user click LayananHigo")
    public void userClickLayananHigo() {
        navBarPage.LayananHigo();
    }

    @And("user click WifiAdv")
    public void userClickWifiAdv() {
        navBarPage.WifiAdv();
    }

    @Then("user in the WifiAdv page")
    public void userInTheWifiAdvPage() {
        navBarPage.WifiAdvPage();
    }

    @And("check BeriklanSekarang button")
    public void checkBeriklanSekarangButton() {
        navBarPage.WifiAdvBtn();
    }

    @And("user click HigoSpot")
    public void userClickHigoSpot() {
        navBarPage.Higospot();
    }

    @Then("user in the HigoSpot page")
    public void userInTheHigoSpotPage() {
        navBarPage.HigospotPage();
    }

    @And("check GabungSekarang button")
    public void checkGabungSekarangButton() {
        navBarPage.HigospotBtn();
    }

    @And("user click IDA")
    public void userClickIDA() {
        navBarPage.IDA();
    }

    @Then("user in the IDA page")
    public void userInTheIDAPage() {
        navBarPage.IDAPage();
    }

    @And("check KolaborasiSekarang button")
    public void checkKolaborasiSekarangButton() {
        navBarPage.IDABtn();
    }

    @When("user click studykasus")
    public void userClickStudykasus() {
        navBarPage.StudyKasus();
    }

    @Then("user in the studykasus page")
    public void userInTheStudykasusPage() {
        navBarPage.StudyKasusPage();
    }

    @And("check All button")
    public void checkAllButton() {
        navBarPage.StudyKasusBtnAll();
    }

    @And("check Higospot button")
    public void checkHigospotButton() {
        navBarPage.StudyKasusBtnHigoSpot();
    }

    @And("check WifiAdv button")
    public void checkWifiAdvButton() {
        navBarPage.StudyKasusBtnWifiAdv();
    }

    @When("user click blog")
    public void userClickBlog() {
        navBarPage.Blog();
    }

    @Then("user in the blog page")
    public void userInTheBlogPage() {
        navBarPage.BlogPage();
    }

    @When("user click DigitalReport")
    public void userClickDigitalReport() {
        navBarPage.DigitalReport();
    }

    @Then("user in the DigitalReport page")
    public void userInTheDigitalReportPage() {
        navBarPage.DigitalReportPage();
    }

    @When("user click Hubungi Tim Higo")
    public void userClickHubungiTimHigo() {
        navBarPage.HubHigo();
    }

    @Then("user in the Hubungi Tim Higo page")
    public void userInTheHubungiTimHigoPage() {
        navBarPage.HubHigoPage();
    }

    @When("user click Bahasa Indonesia")
    public void userClickBahasaIndonesia() {
        navBarPage.pilihanBahasaIndonesia();
    }

    @Then("website berbahasa Indonesia")
    public void websiteBerbahasaIndonesia() {
        navBarPage.Indonesianpage();
    }

    @When("user click Bahasa Inggris")
    public void userClickBahasaInggris() {
        navBarPage.pilihanBahasaInggris();
    }

    @Then("website berbahasa Inggris")
    public void websiteBerbahasaInggris() {
        navBarPage.Inggrispage();
    }

    @After
    public void tearDown() {
        // Mengakhiri sesi WebDriver
        DriverFactory.quitDriver();
    }


}
