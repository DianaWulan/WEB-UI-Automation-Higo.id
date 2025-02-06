package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.FootagePage;
import pages.NavBarPage;
import utils.DriverFactory;

public class FootageStep {
    //Before
    private WebDriver driver = DriverFactory.getDriver(); // Ambil instance driver dari DriverFactory
    private FootagePage footagePage = new FootagePage(driver);
    private NavBarPage navBarPage = new NavBarPage(driver);  // Buat instance LoginPage

    @When("user click WifiAdv footage")
    public void userClickWifiAdvFootage() {
        footagePage.WifiAdv();
    }

    @When("user click HigoSpot footage")
    public void userClickHigoSpotFootage() {
        footagePage.HigiSpot();
    }

    @When("user click IDA footage")
    public void userClickIDAFootage() {
        footagePage.IDA();
    }

    @When("user click TentangHigo footage")
    public void userClickTentangHigoFootage() {
        footagePage.TentangHigo();
    }

    @When("user click karir footage")
    public void userClickKarirFootage() {
        footagePage.karir();
    }

    @Then("user in the karir page")
    public void userInTheKarirPage() {
        navBarPage.linkedinHigo();
    }

    @When("user click blog footage")
    public void userClickBlogFootage() {
        footagePage.Blog();
    }

    @When("user click Terms&Condition footage")
    public void userClickTermsConditionFootage() {
        footagePage.TermCondition();
    }

    @Then("user in the Terms&Condition page")
    public void userInTheTermsConditionPage() {
        footagePage.TermConditionpage();
    }

    @When("user click Privacy&Policy footage")
    public void userClickPrivacyPolicyFootage() {
        footagePage.PrivacyPolicy();
    }

    @Then("user in the Privacy&Policy page")
    public void userInThePrivacyPolicyPage() {
        footagePage.PrivacyPolicypage();
    }

    @After
    public void tearDown() {
        // Mengakhiri sesi WebDriver
        DriverFactory.quitDriver();
    }
}
