package StepDefinitions.board;

import baseAction.Hook;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import repository.board.boardPage;

import static baseAction.Hook.driver;
import static org.openqa.selenium.Keys.ENTER;
import static org.openqa.selenium.devtools.v100.log.Log.clear;

public class bo_001 extends boardPage {

    @Given("User are in Boardpage")
    public void user_are_in_boardpage() {
        // Write code here that turns the phrase above into concrete actions
        driver.navigate().to(BoardUrl);
    }
    @When("User click Add List button")
    public void user_click_add_list_button() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[6]/button/div")).click();

    }
    @And("User input Bug in Input list name column")
    public void user_input_bug_in_input_list_name_column() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[6]/div/div/form/div[1]/input")).sendKeys("BUG");

    }
    @And("User click Create button")
    public void user_click_create_button() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[6]/div/div/form/div[2]/div/button/div")).click();
        Thread.sleep(2000);
    }

    @Then("Creating list is success")
    public void creating_lists_is_success() {
        String text = driver.findElement(By.xpath("//*[@id=\"notistack-snackbar\"]")).getText();
        String successmsg = "Creating list is success";
        Assert.assertEquals(text, successmsg);
    }

    @When("User click Add Card button")
    public void user_click_add_card_button() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div/div/div[4]/a")).click();
    }

    @When("User input Cicle App in Card name column")
    public void user_input_cicle_app_in_card_name_column() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div/div/div[4]/div[1]/form/input")).sendKeys("Cicle App");
    }

    @When("User click Green Add Card button")
    public void user_click_green_add_card_button() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div/div/div[4]/div[3]/button/div")).click();
    }

    @Then("Creating card is success")
    public void creating_card_is_success() {
        String text = driver.findElement(By.xpath("//*[@id=\"notistack-snackbar\"]")).getText();
        String successmsg = "Creating card is success";
        Assert.assertEquals(text, successmsg);
    }

    @Then("Card name cannot be empty")
    public void card_name_cannot_be_empty() {
        String text = driver.findElement(By.xpath("//*[@id=\"notistack-snackbar\"]")).getText();
        String errorsmsg = "Card name cannot be empty";
        Assert.assertEquals(text, errorsmsg);
    }

    @When("User click Pencil icon button on Cicle App card")
    public void user_click_pencil_icon_button_on_cicle_app_card() {
        driver.findElement(By.xpath("//*[@id=\"editCardMenu\"]")).click();
    }

    @When("User click Private Card button")
    public void user_click_private_card_button() {
        driver.findElement(By.xpath("//*[@id=\"editCardMenuButton\"]/div[9]/div/div/div/div")).click();
    }

    @Then("Update card is success")
    public void update_card_is_success() {
        String text = driver.findElement(By.xpath("//*[@id=\"notistack-snackbar\"]")).getText();
        String successmsg = "Update card is success";
        Assert.assertEquals(text, successmsg);
    }

    @When("User click Filter button")
    public void user_click_filter_button() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div/div[2]/div[1]")).click();
    }

    @When("User input text Cicle App in Seacrh Cards column")
    public void user_input_text_in_seacrh_cards_column(String string) {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div[1]/form/input")).sendKeys("Cicle App");
    }

    @Then("Showing name of the Cicle App card")
    public void showing_name_of_the_cicle_app_card() {
        String text = driver.findElement(By.xpath("//*[@id=\"listcard_content-0\"]/div/div/div/div[3]/h1")).getText();
        String cicleapp = "Cicle App";
        Assert.assertEquals(text, cicleapp);
    }

    @When("User click Pencil icon button on Hide This card")
    public void user_click_pencil_icon_button_on_hide_this_card() {
        driver.findElement(By.xpath("//*[@id=\"editCardMenu\"]")).click();
    }

    @When("User click Archive button on Hide This card")
    public void user_click_archive_button_on_hide_this_card() {
        driver.findElement(By.xpath("//*[@id=\"editCardMenuButton\"]/div[10]/div/div/div/div")).click();
    }

    @Then("Hide This card has been moved to archived")
    public void hide_this_card_has_been_moved_to_archived() {
        String text = driver.findElement(By.xpath("//*[@id=\"notistack-snackbar\"]")).getText();
        String successmsg = "Hide This card has been moved to archived";
        Assert.assertEquals(text, successmsg);
    }

    @When("User click Dot Option icon button on Archive List list")
    public void user_click_dot_option_icon_button_on_archive_list_list() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[5]/div/div/div[1]/div[2]")).click();
    }

    @When("User click Archive This List button")
    public void user_click_archive_this_list_button() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[5]/div/div/div[1]/div[2]/div[2]/div[3]/div/div/div[2]")).click();
    }

    @Then("Archive List list has been moved to archived")
    public void archive_list_list_has_been_moved_to_archived() {
        String text = driver.findElement(By.xpath("//*[@id=\"notistack-snackbar\"]")).getText();
        String successmsg = "Archive List list has been moved to archived";
        Assert.assertEquals(text, successmsg);
    }

    @When("User click Archived Items button")
    public void user_click_archived_items_button() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[2]")).click();
    }

    @When("User click Switch to lists button")
    public void user_click_switch_to_lists_button() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div[1]/div[2]/button/div")).click();
    }

    @When("User click Restore button")
    public void user_click_restore_button() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/p")).click();
    }

    @Then("Unarchiving list with cards is success")
    public void unarchiving_list_with_cards_is_success() {
        String text = driver.findElement(By.xpath("//*[@id=\"notistack-snackbar\"]")).getText();
        String successmsg = "Unarchiving list with cards is success";
        Assert.assertEquals(text, successmsg);
    }

    @When("User click label button")
    public void user_click_label_button() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div[3]/div")).click();
    }

    @Then("Unarchiving card is success")
    public void unarchiving_card_is_success() {
        String text = driver.findElement(By.xpath("//*[@id=\"notistack-snackbar\"]")).getText();
        String successmsg = "Unarchiving card is success";
        Assert.assertEquals(text, successmsg);
    }

    @Then("Showing card have been labeled")
    public void showing_card_have_been_labeled() {
        String text = driver.findElement(By.xpath("//*[@id=\"listcard_content-2\"]/div/div/div/div[2]/div/p")).getText();
        String successmsg = "label";
        Assert.assertEquals(text, successmsg);
    }

    @When("User click Pencil icon button on Bug card")
    public void user_click_pencil_icon_button_on_bug_card() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[3]/div/div/div[3]/div/div/div/div/div/div/div/div[1]")).click();
        Thread.sleep(2000);
    }

    @When("User click Pencil icon button on on URGENT card")
    public void user_click_pencil_icon_button_on_urgent_card() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[3]/div/div/div[3]/div/div/div/div/div/div/div/div[1]")).click();
        Thread.sleep(2000);
    }

    @When("User input text URGENT in Edit Card Name column")
    public void user_input_text_urgent_in_edit_card_name_column() {
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[3]/div/div/div[1]/div[2]/div[2]/div[3]/form/input[1]")).sendKeys("URGENT");
    }

    @When("User click Save button")
    public void user_click_save_button() {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[3]/div/div/div[1]/div[2]/div[2]/div[3]/div/div/button/div")).click();
    }

    @When("User click Save notes button")
    public void user_click_save_notes_button() {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[3]/div/div/div[1]/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/button/div")).click();
    }

    @When("User click Change Name button")
    public void user_click_change_name_button() {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[3]/div/div/div[3]/div/div/div/div/div[2]/div[7]")).click();
    }

    @When("User click Dot Option icon button on Tester1 list")
    public void user_click_dot_option_icon_button_on_tester1_list() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/div[1]/div[2]")).click();
    }

    @When("User click Archive All Cards in This List button")
    public void user_click_archive_all_cards_in_this_list_button() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/div[1]/div[2]/div[2]/div[3]/div/div/div[1]")).click();
    }

    @Then("All cards on list Tester1 moved to archived")
    public void all_cards_on_list_tester1_moved_to_archived() {
        String text = driver.findElement(By.xpath("//*[@id=\"notistack-snackbar\"]")).getText();
        String successmsg = "All cards on list Tester1 moved to archived";
        Assert.assertEquals(text, successmsg);
    }


    @When("User click Edit Notes button")
    public void user_click_edit_notes_button() {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[3]/div/div/div[3]/div/div/div/div/div[2]/div[6]")).click();
    }

    @When("User input text Fix This in Tell your story here column")
    public void user_input_text_fix_this_in_tell_your_story_here_column() {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[3]/div/div/div[1]/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div[2]/div/p")).sendKeys("Fix This. ");
    }

    @When("User click Set as a Complete List")
    public void user_click_set_as_a_complete_list() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[5]/div/div/div[1]/div[2]/div[2]/div[3]/div/div/div[3]/p")).click();
    }

    @Then("Set list as Complete is success")
    public void set_list_as_complete_is_success() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("User click Dot Option icon button on URGENT card list")
    public void user_click_dot_option_icon_button_on_urgent_list() {
        driver.findElement(By.xpath("//*[@id=\"editCardMenuIcon\"]")).click();
    }

    @When("User click Change Member button")
    public void user_click_change_member_button() {
        driver.findElement(By.xpath("//*[@id=\"editCardMenuButton\"]/div[3]")).click();
    }

    @When("User click paketA2 cilsy button")
    public void user_click_paket_a_cilsy_button() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/div[1]/div[2]/div[2]/div[4]/div[13]/p")).click();
    }

    @When("User click Apply Member button")
    public void user_click_apply_member_button() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/div[1]/div[2]/div[2]/div[5]/button")).click();
    }

    @Then("Toggle members successful")
    public void toggle_members_successful() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("User click Overdue button")
    public void user_click_overdue_button() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div[7]/div[3]/div")).click();
    }

    @Then("Showing overdue card")
    public void showing_overdue_card() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("User click Due Soon button")
    public void user_click_due_soon_button() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div[7]/div[1]/div")).click();
    }

    @Then("Showing Due Soon card")
    public void showing_due_soon_card() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("User click Due Today button")
    public void user_click_due_today_button() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div[7]/div[2]/div/p")).click();
    }

    @Then("Showing Due Today card")
    public void showing_due_today_card() {
        // Write code here that turns the phrase above into concrete actions
    }


    @When("User click Attach Files button on URGENT card")
    public void user_click_attach_files_button_on_urgent_card() {
        driver.findElement(By.xpath("//*[@id=\"editCardMenuButton__Attach__text\"]")).click();
    }

    @When("User choose file")
    public void user_choose_file() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("User clik Open")
    public void user_clik_open() {
        //webElement.sendKeys(Keys.ENTER);
        //driver.findElement.sendKeys(Keys.ENTER);
    }

    @Then("Upload attachments is success")
    public void upload_attachments_is_success() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("User click Quick Comment button")
    public void user_click_quick_comment_button() {
        driver.findElement(By.xpath("//*[@id=\"editCardMenuButton\"]/div[2]")).click();
    }

    @When("User click Add new comment column")
    public void user_click_add_new_comment_column() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/div[1]/div[2]/div[2]/div[3]/div/div/div/div[1]/div/div[2]/div[2]/div/input")).click();
    }

    @When("User input text FIX NOW in Tell your story here column")
    public void user_input_text_fix_now_in_tell_your_story_here_column() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/div[1]/div[2]/div[2]/div[3]/div/div/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div[2]/div/p")).sendKeys("FIX NOW");
    }

    @When("User click Post button")
    public void user_click_post_button() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/div[1]/div[2]/div[2]/div[3]/div/div/div/div[1]/div/div[2]/div[2]/div[2]/button[2]")).click();
    }

    @Then("Create comment is success")
    public void create_comment_is_success() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("User click Dot Option icon button on comment")
    public void user_click_dot_option_icon_button_on_comment() {
        driver.findElement(By.xpath("//*[@id=\"comment_62efad5e6d5f4aa1d7d65591\"]/div[2]/div[1]/div/svg")).click();
    }

    @When("User click Delete button")
    public void user_click_delete_button() {
        driver.findElement(By.xpath("//*[@id=\"comment_62efad5e6d5f4aa1d7d65591\"]/div[2]/div[1]/div[2]/div/div/div[2]")).click();
    }

    @When("User click Delete button on pop up option")
    public void user_click_delete_button_on_pop_up_option() {
        driver.findElement(By.xpath("/html/body/div[10]/div[3]/div/div/div[2]/div[2]/button/div")).click();
    }

    @When("User input text Cicle App in Search Cards column")
    public void user_input_text_cicle_app_in_search_cards_column() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div[1]/form/input")).sendKeys("Cicle App");
    }

    @When("User click Edit Labels button")
    public void user_click_edit_labels_button() {
        driver.findElement(By.xpath("//*[@id=\"editCardMenuButton\"]/div[4]")).click();
    }

    @When("User click Apply Labels button")
    public void user_click_apply_labels_button() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[4]/div/div/div[1]/div[2]/div[2]/div[6]/button")).click();
    }

    @Then("toggle multiple labels card is success")
    public void toggle_multiple_labels_card_is_success() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("User click Dot Option icon button on Quality card")
    public void user_click_dot_option_icon_button_on_quality_card() {
        driver.findElement(By.xpath("//*[@id=\"editCardMenuIcon\"]")).click();
    }

    @When("User click Move Card button")
    public void user_click_move_card_button() {
        driver.findElement(By.xpath("//*[@id=\"editCardMenuButton__Move__text\"]")).click();
    }

    @When("User click List button")
    public void user_click_list_button() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div[3]/div/div[1]")).click();
    }

    @When("User click Urgent button")
    public void user_click_urgent_button() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div[3]/div/div[2]/div/div/div[2]/a")).click();
    }

    @When("User click Move button")
    public void user_click_move_button() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div[4]/button/div")).click();
    }

    @Then("Success!")
    public void success() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("User click Clean Filter button")
    public void user_click_clean_filter_button() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[2]/div[9]/div/div/p")).click();
    }

    @When("User click Dot Option icon button on KIRI list")
    public void user_click_dot_option_icon_button_on_kiri_list() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div/div/div[1]/div[2]/div[1]/svg")).click();
    }

    @Then("User click Sort This List by Nearest Created Date button")
    public void user_click_sort_this_list_by_nearest_created_date_button() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]/div/div/div[1]/div[2]/div[2]/div[3]/div/div/div[8]/p")).click();
    }

    @When("User click URGENT Card")
    public void user_click_urgent_card() {
        driver.findElement(By.xpath("//*[@id=\"listcard_content-3\"]/div[2]/div/div/a")).click();
    }

    @Then("Showing the content of the URGENT card")
    public void showing_the_content_of_the_urgent_card() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("User click CHEERS Card")
    public void user_click_cheers_card() {
        driver.findElement(By.xpath("//*[@id=\"listcard_content-0\"]/div[4]/div/div/a")).click();
    }

    @When("User click Cheers icon button")
    public void user_click_cheers_icon_button() {
        driver.findElement(By.xpath("//*[@id=\"comment_62efb0d36d5f4aa1d7d65717\"]/div[2]/div[4]/div/div/div/div/img")).click();
    }

    @When("User input SEMANGAT on Giveem cheers column")
    public void user_input_semangat_on_giveem_cheers_column() {
        driver.findElement(By.xpath("//*[@id=\"comment_62efb0d36d5f4aa1d7d65717\"]/div[2]/div[4]/div/div/div/div/div/div[2]/form/input")).sendKeys("SEMANGAT");
    }

    @When("User click Checklist button")
    public void user_click_checklist_button() {
        driver.findElement(By.xpath("/html/body/div[11]/div/div/div[2]/div/div/div[1]/div[7]/div/div/div/div[4]/div/div[2]/div[4]/div/div/div/div/div/div[3]/svg[2]")).click();
    }

    @Then("Create cheers on card comment successful")
    public void create_cheers_on_card_comment_successful() {

    }

    @When("User click Plus icon button")
    public void user_click_plus_icon_button() {
        driver.findElement(By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[1]/div/div[3]/svg")).click();
    }

    @When("User click Ahmad Faris deden button")
    public void user_click_ahmad_faris_deden_button() {
        driver.findElement(By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[1]/div[2]/div[4]/div[6]/p")).click();
    }

    @When("User click Apply Members button")
    public void user_click_apply_members_button() {
        driver.findElement(By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[1]/div[2]/div[5]/button")).click();
    }

    @Then("User click Show all member button")
    public void user_click_show_all_member_button() {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div/div[2]/div[5]/div[5]/p")).click();
    }

    @Then("List name cannot be empty")
    public void list_name_cannot_be_empty() {
        // Write code here that turns the phrase above into concrete actions
    }
}