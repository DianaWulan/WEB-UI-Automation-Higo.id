package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DigitalReportPage {
    protected WebDriver driver;

    public DigitalReportPage(WebDriver driver){
        this.driver = driver;
    }

    //locator
    By second = By.xpath("/html/body/main/div/section[30]/div/div[2]/form/div[2]/div[1]/input");
    By third = By.xpath("/html/body/main/div/section[30]/div/div[2]/form/div[2]/div[2]/input");
    By email = By.xpath("/html/body/main/div/section[30]/div/div[2]/form/div[2]/div[3]/input");
    By phonenumber = By.xpath("/html/body/main/div/section[30]/div/div[2]/form/div[2]/div[4]/input");
    By companyname = By.xpath("/html/body/main/div/section[30]/div/div[2]/form/div[2]/div[5]/input");
    By jobTitle = By.xpath("/html/body/main/div/section[30]/div/div[2]/form/div[2]/div[6]/input");
    By downloadBtn = By.xpath("/html/body/main/div/section[30]/div/div[2]/form/div[3]/button[1]");

    By firstnameError = By.xpath("/html/body/main/div/section[30]/div/div[2]/form/div[2]/div[1]/p");
    By lastnameError = By.xpath("/html/body/main/div/section[30]/div/div[2]/form/div[2]/div[2]/p");
    By emailError = By.xpath("/html/body/main/div/section[30]/div/div[2]/form/div[2]/div[3]/p");
    By phonenumberError = By.xpath("/html/body/main/div/section[30]/div/div[2]/form/div[2]/div[4]/p");
    By companynameError = By.xpath("/html/body/main/div/section[30]/div/div[2]/form/div[2]/div[5]/p");
    By jobtitleError = By.xpath("/html/body/main/div/section[30]/div/div[2]/form/div[2]/div[6]/p");


    //action
    public void isiFirstName(String firstName){
        driver.findElement(firstname).sendKeys(firstName);
    }

    public void isiLastName(String LastName){
        driver.findElement(lastname).sendKeys(LastName);
    }

    public void isiEmail(String Email){
        driver.findElement(email).sendKeys(Email);
    }

    public void isiPhoneNumber(String phoneNumber){
        driver.findElement(phonenumber).sendKeys(phoneNumber);
    }

    public void isiCompnyName(String companyName){
        driver.findElement(companyname).sendKeys(companyName);
    }

    public void isiJobTitle(String jobtitle){
        driver.findElement(jobTitle).sendKeys(jobtitle);
    }

    public void downloadBtn(){
        driver.findElement(downloadBtn).click();
    }

    private List<By> errorLocators = Arrays.asList(
            firstnameError, lastnameError, emailError,
            phonenumberError, companynameError, jobtitleError
    );

    // Method untuk mendapatkan semua pesan error yang muncul
    public List<String> getErrorMessage() {
        List<String> errorMessages = new ArrayList<>();

        for (By locator : errorLocators) {
            String errorMessage = getElementText(locator);
            if (!errorMessage.isEmpty()) {
                errorMessages.add(errorMessage);
            }
        }
        return errorMessages;
    }

    // Helper method untuk mendapatkan teks elemen, jika elemen tidak ditemukan maka return ""
    private String getElementText(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            return element.isDisplayed() ? element.getText() : "";
        } catch (Exception e) {
            return ""; // Jika elemen tidak ditemukan, return string kosong
        }
    }
}
