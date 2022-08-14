package StepDefinitions.blast;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import repository.blast_page.BlastRepo;

import static baseAction.Hook.driver;

public class BlastActivitiesFeature extends BlastRepo {
    @When("User click on archive icon on blast")
    public void userClickOnArchiveIconOnBlast() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(newestblast)));
        driver.findElement(By.xpath(newestblast)).click();
        driver.findElement(By.xpath(more_container)).click();
        driver.findElement(By.xpath(archiveblast_button)).click();
        driver.findElement(By.xpath(archiveconfirmation_button)).click();
    }

    @Then("User successfully archived blast")
    public void userSuccessfullyArchivedBlast() {
        driver.findElement(By.id(complete_notif)).isDisplayed();
        driver.findElement(By.xpath(archivedBlast_text)).isDisplayed();

    }

    @When("User select blast in blast list")
    public void userSelectBlastInBlastList() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(newestblast)));
        driver.findElement(By.xpath(newestblast)).click();
    }

    @And("User send comment in comment field")
    public void userSendCommentInCommentField() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(commentBlast_field)));
        driver.findElement(By.xpath(commentBlast_field)).click();
        driver.findElement(By.xpath(inputcomment_field)).sendKeys(commentBlast_input);
        driver.findElement(By.xpath(postcomment_button)).click();

    }

    @Then("User can see created comment in blast post")
    public void userCanSeeCreatedCommentInBlastPost() {
        driver.findElement(By.id(complete_notif)).isDisplayed();
    }

    @And("User reply created comment")
    public void userReplyCreatedComment() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(replycomment_button)));
        driver.findElement(By.xpath(replycomment_button)).click();
        driver.findElement(By.xpath(commentReplies_placeholder)).click();
        driver.findElement(By.xpath(commentReplies_field)).sendKeys("bales komen -hanif");
        driver.findElement(By.xpath(postcommentReplies)).click();
    }

    @Then("User can see replied comment")
    public void userCanSeeRepliedComment() {
        driver.findElement(By.id(complete_notif)).isDisplayed();
    }

    @And("User delete created comment")
    public void userDeleteCreatedComment() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(comment_morecontainer)));
        driver.findElement(By.xpath(comment_morecontainer)).click();
        driver.findElement(By.xpath(deletecomment_button)).click();
        driver.findElement(By.xpath(deletecomment_confirmation)).click();

    }

    @Then("User successfully deleted comment in blast post")
    public void userSuccessfullyDeletedCommentInBlastPost() {
        driver.findElement(By.id(complete_notif)).isDisplayed();
    }
}
