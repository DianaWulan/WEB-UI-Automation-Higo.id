package steps;

import io.cucumber.java.After;
import io.cucumber.java.an.E;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.DigitalReportPage;
import pages.NavBarPage;
import utils.DriverFactory;

import java.util.List;

public class DigitalReportFormStep {
    //Before
    private WebDriver driver = DriverFactory.getDriver(); // Ambil instance driver dari DriverFactory
    private DigitalReportPage digitalReportPage = new DigitalReportPage(driver);  // Buat instance LoginPage

    @And("user fill the First Name with {}")
    public void userFillTheFirstNameWith(String firstName) {
        digitalReportPage.isiFirstName(firstName);
    }

    @Then("user fill the Last Name with {}")
    public void userFillTheLastNameWith(String lastName) {
        digitalReportPage.isiLastName(lastName);
    }

    @And("user fill the Email with {}")
    public void userFillTheEmailWith(String Email) {
        digitalReportPage.isiEmail(Email);
    }

    @And("user fill the Phone Number with {}")
    public void userFillThePhoneNumberWith(String PhoneNumber) {
        digitalReportPage.isiPhoneNumber(PhoneNumber);
    }

    @Then("user fill the Company Name with {}")
    public void userFillTheCompanyNameWith(String CompanyName) {
        digitalReportPage.isiCompnyName(CompanyName);
    }

    @And("user fill the Job Title with {}")
    public void userFillTheJobTitleWith(String JobTitle) {
        digitalReportPage.isiJobTitle(JobTitle);
    }

    @And("user click Download Button")
    public void userClickDownloadButton() {
        digitalReportPage.downloadBtn();
    }

    @And("validasi action")
    public void validasiAction() {
        List<String> errors = digitalReportPage.getErrorMessage();
        //Assert.assertFalse("Error messages should be displayed!", errors.isEmpty());

        // Cetak semua error untuk debugging (opsional)
        for (String error : errors) {
            System.out.println("Error message: " + error);
        }
    }

    @After
    public void tearDown() {
        // Mengakhiri sesi WebDriver
        DriverFactory.quitDriver();
    }


}
