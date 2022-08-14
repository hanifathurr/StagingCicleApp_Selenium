package StepDefinitions.blast;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import repository.blast_page.BlastRepo;

import static baseAction.Hook.driver;

public class EditBlastFeature extends BlastRepo {
    @When("User click on edit icon on blast")
    public void userClickOnEditIconOnBlast() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(newestblast)));
        driver.findElement(By.xpath(newestblast)).click();
        driver.findElement(By.xpath(more_container)).click();
        driver.findElement(By.xpath(editblast_button)).click();
    }

    @And("User change blast title")
    public void userChangeBlastTitle() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(editTitle_field)));
        driver.findElement(By.xpath(editTitle_field)).clear();
        driver.findElement(By.xpath(editTitle_field)).sendKeys(editBlast_input);
    }

    @Then("User successfully edit blast")
    public void userSuccessfullyEditBlast() {
        driver.findElement(By.xpath(savechanges_button)).click();
        String actualUpdateNotif_text = driver.findElement(By.xpath(updateNotif)).getText();
        Assert.assertEquals(updateNotif_text,actualUpdateNotif_text);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(blast_title)));
        String editedTitle = driver.findElement(By.xpath(blast_title)).getText();
        Assert.assertEquals(editBlast_input,editedTitle);
    }

    @And("User set manual date to {string}")
    public void userSetManualDateTo(String arg0) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(editAutoComplete_selector)));
        driver.findElement(By.xpath(editAutoComplete_selector)).click();
        driver.findElement(By.xpath(setmanual_duedate)).click();
        driver.findElement(By.xpath(calendar_icon)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(editAutoComplete_selector)));
        driver.findElement(By.xpath(date_button)).click();
    }

    @Then("User succesfully edited blast and check the blast complete in {string}")
    public void userSuccesfullyEditedBlastAndCheckTheBlastCompleteIn(String editedcompleteDate) {
        driver.findElement(By.xpath(savechanges_button)).click();
        String actualUpdateNotif_text = driver.findElement(By.xpath(updateNotif)).getText();
        Assert.assertEquals(updateNotif_text,actualUpdateNotif_text);
        String actualBlastDate = driver.findElement(By.xpath(blastDateBox)).getText();
        Assert.assertEquals(editedcompleteDate,actualBlastDate);
    }


    @And("User remove people to notified")
    public void userRemovePeopleToNotified() {
        driver.findElement(By.xpath(addMember_button)).click();
        driver.findElement(By.xpath(addMember_searchfield)).sendKeys("hanif");
        if (driver.findElement(By.xpath(checkboxmember_hanif)).isSelected()) {
            driver.findElement(By.xpath(checkboxmember_hanif)).click();
        }
        else {
            String actualMemberName = driver.findElement(By.xpath(checkboxmember_hanif)).getText();
            Assert.assertEquals("Hanif Fathurrahman-QA13",actualMemberName);
        }

        driver.findElement(By.xpath(addMemberDone_button)).click();
    }

    @Then("User successfully edited blast and notified selected people")
    public void userSuccessfullyEditedBlastAndNotifiedSelectedPeople() {
        driver.findElement(By.xpath(savechanges_button)).click();
        String actualUpdateNotif_text = driver.findElement(By.xpath(updateNotif)).getText();
        Assert.assertEquals(updateNotif_text,actualUpdateNotif_text);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(blast_title)));
        Assert.assertFalse(driver.findElement(By.xpath(iconMember_hanif)).isDisplayed());
    }

    @And("User switch on private blast")
    public void userSwitchOnPrivateBlast() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(private_switch)));
        driver.findElement(By.xpath(private_switch)).click();
    }

    @Then("User successfully edited blast and lock icon appeared")
    public void userSuccessfullyEditedBlastAndLockIconAppeared() {
        driver.findElement(By.xpath(savechanges_button)).click();
        driver.findElement(By.xpath(updateNotif)).isDisplayed();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(blastLock_icon)));
        Assert.assertTrue(driver.findElement(By.xpath(blastLock_icon)).isDisplayed());
    }

    @And("User click on cancel edit button")
    public void userClickOnCancelEditButton() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(cancelEdit_button)));
        driver.findElement(By.xpath(cancelEdit_button)).click();
    }

    @Then("User successfully edited blast and removed member icon not appeared")
    public void userSuccessfullyEditedBlastAndRemovedMemberIconNotAppeared() {
        driver.findElement(By.xpath(savechanges_button)).click();
        driver.findElement(By.xpath(updateNotif)).isDisplayed();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(blast_title)));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(iconMember_hanif)));
    }

    @And("User add people to notified")
    public void userAddPeopleToNotified() {
        driver.findElement(By.xpath(addMember_button)).click();
        driver.findElement(By.xpath(addMember_searchfield)).sendKeys("hanif");
        if (driver.findElement(By.xpath(checkboxmember_hanif)).isSelected()) {
            String actualMemberName = driver.findElement(By.xpath(checkboxmember_hanif)).getText();
            Assert.assertEquals("Hanif Fathurrahman-QA13",actualMemberName);
        }
            else {
            driver.findElement(By.xpath(checkboxmember_hanif)).click();
            }

        driver.findElement(By.xpath(addMemberDone_button)).click();
    }

    @Then("User successfully edited blast and added member icon appeared")
    public void userSuccessfullyEditedBlastAndAddedMemberIconAppeared() {
        driver.findElement(By.xpath(savechanges_button)).click();
        driver.findElement(By.xpath(updateNotif)).isDisplayed();
        String actualUpdateNotif_text = driver.findElement(By.xpath(updateNotif)).getText();
        Assert.assertEquals(updateNotif_text,actualUpdateNotif_text);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(blast_title)));

    }

    @Then("User successfully canceled and back to blast information page")
    public void userSuccessfullyCanceledAndBackToBlastInformationPage() {
        driver.findElement(By.xpath(blast_title)).isDisplayed();
    }
}
