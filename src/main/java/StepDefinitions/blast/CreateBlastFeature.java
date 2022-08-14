package StepDefinitions.blast;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import repository.blast_page.BlastRepo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static baseAction.Hook.LandingPage;
import static baseAction.Hook.driver;

public class CreateBlastFeature extends BlastRepo {

    @Given("User on blast page")
    public void userOnBlastPage() {
        driver.navigate().to(blastUrl);
    }

    @When("User click on create blast page")
    public void userClickOnCreateBlastPage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(createBlast_button)));
        driver.findElement(By.xpath(createBlast_button)).click();
    }

    @And("User fill all field with valid format")
    public void userFillAllFieldWithValidFormat() {
        driver.findElement(By.xpath(blastTitle_field)).sendKeys(blastTitle_input);
        driver.findElement(By.xpath(blastStory_field)).sendKeys(blastStory_input);
    }

    @And("User set blast complete as autocomplete and date as oneday")
    public void userSetBlastCompleteAsAutocompleteAndDateAsOneday() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(publish_button)));
        driver.findElement(By.xpath(publish_button)).click();
    }

    @Then("User succesfully created blast and check the blast complete in one day")
    public void userSuccesfullyCreatedBlastAndCheckTheBlastCompleteInOneDay() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(complete_notif)));
        Assert.assertTrue(driver.findElement(By.id(complete_notif)).isDisplayed());
        driver.navigate().to(blastUrl);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(newestblast)));
        driver.findElement(By.xpath(newestblast)).click();
        String actualBlastDate = driver.findElement(By.xpath(blastDateBox)).getText();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        Date tomorrow = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat("MMM dd");
        String tomorrowAsString = dateFormat.format(tomorrow);
        Assert.assertEquals(tomorrowAsString,actualBlastDate);
    }

    @And("User set blast complete as autocomplete and date as three days")
    public void userSetBlastCompleteAsAutocompleteAndDateAsThreeDays() {
        driver.findElement(By.xpath(setcompleteIn)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(autocomplete_3day)));
        driver.findElement(By.xpath(autocomplete_3day)).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(publish_button)));
        driver.findElement(By.xpath(publish_button)).click();
    }

    @Then("User succesfully created blast and check the blast complete in three days")
    public void userSuccesfullyCreatedBlastAndCheckTheBlastCompleteInThreeDays() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(complete_notif)));
        Assert.assertTrue(driver.findElement(By.id(complete_notif)).isDisplayed());
        driver.navigate().to(blastUrl);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(newestblast)));
        driver.findElement(By.xpath(newestblast)).click();
        String actualBlastDate = driver.findElement(By.xpath(blastDateBox)).getText();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 3);
        Date threedayslater = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat("MMM dd");
        String threedayslaterAsString = dateFormat.format(threedayslater);
        Assert.assertEquals(threedayslaterAsString,actualBlastDate);
    }

    @And("User set blast complete as autocomplete and date as seven days")
    public void userSetBlastCompleteAsAutocompleteAndDateAsSevenDays() {
        driver.findElement(By.xpath(setcompleteIn)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(autocomplete_7day)));
        driver.findElement(By.xpath(autocomplete_7day)).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(publish_button)));
        driver.findElement(By.xpath(publish_button)).click();
    }

    @Then("User succesfully created blast and check the blast complete in seven days")
    public void userSuccesfullyCreatedBlastAndCheckTheBlastCompleteInSevenDays() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(complete_notif)));
        Assert.assertTrue(driver.findElement(By.id(complete_notif)).isDisplayed());
        driver.navigate().to(blastUrl);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(newestblast)));
        driver.findElement(By.xpath(newestblast)).click();
        String actualBlastDate = driver.findElement(By.xpath(blastDateBox)).getText();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 7);
        Date sevendayslater = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat("MMM dd");
        String sevendayslaterAsString = dateFormat.format(sevendayslater);
        Assert.assertEquals(sevendayslaterAsString,actualBlastDate);
    }

    @And("User set blast complete with manual date {string}")
    public void userSetBlastCompleteWithManualDate(String manualDate) {
        driver.findElement(By.xpath(blastcomplete_selector)).click();
        driver.findElement(By.xpath(setmanual_duedate)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(manualdate_field)));
        driver.findElement(By.xpath(manualdate_field)).clear();
        driver.findElement(By.xpath(manualdate_field)).sendKeys(manualDate);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(publish_button)));
        driver.findElement(By.xpath(publish_button)).click();
    }

    @Then("User succesfully created blast and check the blast complete in {string}")
    public void userSuccesfullyCreatedBlastAndCheckTheBlastCompleteIn(String completeDate) {
        driver.findElement(By.id(complete_notif)).isDisplayed();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(newestblast)));
        driver.findElement(By.xpath(newestblast)).click();
        String actualBlastDate = driver.findElement(By.xpath(blastDateBox)).getText();
        Assert.assertEquals(completeDate,actualBlastDate);
    }

    @And("User leave title field empty")
    public void userLeaveTitleFieldEmpty() {
    }

    @And("User fill other field with valid format")
    public void userFillOtherFieldWithValidFormat() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(blastStory_field)));
        driver.findElement(By.xpath(blastStory_field)).sendKeys(blastStory_input);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(publish_button)));
        driver.findElement(By.xpath(publish_button)).click();
    }

    @Then("User can see error message")
    public void userCanSeeErrorMessage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(error_notif)));
        String actualerrorText = driver.findElement(By.xpath(error_notif)).getText();
        Assert.assertEquals(errorNotif_Text,actualerrorText);
    }

    @Then("User failed to create blast")
    public void userFailedToCreateBlast() {
        Assert.assertFalse(driver.findElement(By.xpath(complete_notif)).isDisplayed());

    }

    @And("User click on cancel button")
    public void userClickOnCancelButton() {
        driver.findElement(By.xpath(cancel_button)).click();
    }

    @Then("User successfully canceled and back to blast page")
    public void userSuccessfullyCanceledAndBackToBlastPage() {
        String actualBlastTitle = driver.getTitle();
        Assert.assertEquals(blastPageTitle,actualBlastTitle);
    }
}
