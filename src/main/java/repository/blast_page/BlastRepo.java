package repository.blast_page;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static baseAction.Hook.driver;

public class BlastRepo {
    public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    //URL
    public String blastUrl = "https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8/teams/62e39455661629ab10799c76/blasts/62e39455661629ab10799c7b";
    //Elements locator
    public String blastPageTitle = "Blast!";
    public String createBlast_button = "//div[@class='GlobalActionButton_container__EJ7Lh']";//xpath
    public String blastTitle_field = "//textarea[@placeholder='Type a title...']";//xpath
    public String emoticon_button = "MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv";//classname
    public String blastStory_field = "//div[@class='fr-element fr-view']";//xpath
    public String blastcomplete_selector = "(//div[@class='MuiSelect-select MuiSelect-standard MuiInput-input MuiInputBase-input css-1cccqvr'])[1]";//xpath
    public String setcompleteIn = "(//div[@class='MuiSelect-select MuiSelect-standard MuiInput-input MuiInputBase-input css-1cccqvr'])[2]";//xpath
    public String autocomplete_1day = "//li[text()='1 Day from today']";//xpath
    public String autocomplete_3day = "//li[text()='3 Days from today']";//xpath
    public String autocomplete_7day = "//li[text()='7 Days from today']";//xpath
    public String setmanual_duedate = "//li[contains(text(),'Set due date manually')]";//xpath
    public String manualdate_field = "//input[@placeholder='yyyy/mm/dd']";//xpath
    public String addMember_button = "//div[@class='ShowLimitMembers_plusButton__8k3vj ShowLimitMembers_secondary__2lF80']";//xpath
    public String private_switch = "//span[@class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-9l3uo3']";//xpath
    public String cancel_button = "//div[contains(@class,'CreateBlastPage_actionSection__cancel__3b0TR')]//button[contains(@type,'button')]";//xpath
    public String publish_button = "/html/body/div[1]/div[3]/div[2]/div/div/div[6]/button";//xpath
    public String complete_notif = "notistack-snackbar";//id
    public String error_notif = "//div[@id='notistack-snackbar']";//xpath
    public String newestblast = "(//div[@class='Post_link__3u8eF'])[1]";//xpath
    public String blastDateBox = "(//div[@class='Box_DateBox__fI6QU Box_noClick__2_CPN'])[2]";//xpath
    public String cheers_button = "//div[@class='CheersButton_buttonCheers__2mJix']";//xpath
    public String cheers_checklist = "//div[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium CheersButton_checkIcon__1ub7w css-vubbuv']";
    public String errorNotif_Text = "Field parameter not complete.";
    public String completeNotif_Text = "Create post successful";
    //Edit blast
    public String more_container = "//div[@class='More_container__2VGML']";//xpath
    public String editblast_button = "(//div[@class='Item_container__3qBQE'])[1]";//xpath
    public String archiveblast_button = "(//div[@class='Item_container__3qBQE'])[2]";//xpath
    public String editTitle_field = "//textarea[@placeholder='Type a title...']";//xpath
    public String editStory_field = "//div[@class='fr-element fr-view']";//xpath
    public String resetAutoComplete = "//input[@aria-label='secondary checkbox']";//xpath
    public String editAutoComplete_selector = "//div[contains(@class,'MuiInput-root')]";//xpath
    public String day_selector = "(//div[@class='MuiFormControl-root css-13sljp9'])[2]";//xpath
    public String updateNotif = "//div[@id='notistack-snackbar']";//xpath
    public String updateNotif_text = "Update post successful";
    public String savechanges_button = "//h1[normalize-space()='Save Changes']";//xpath
    public String blast_title = "//div[@class='PostBlastPage_titleSection__creator__body__2g7a1']/h1";//xpath
    public String calendar_icon = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']";//xpath
    public String date_button = "//button[@aria-label='Aug 20, 2022']";//xpath
    public String addMember_searchfield = "//input[@placeholder='Search members...']";//xpath
    public String checkboxmember_hanif = "//p[normalize-space()='Hanif Fathurrahman-QA13']";//xpath
    public String addMemberDone_button = "//p[normalize-space()='Done']";//xpath
    public String iconMember_hanif = "//img[@src='https://lh3.googleusercontent.com/a/AATXAJzrjXls5iYG_NjIofTHVCWs0fNUXc6qjBkIMOxz=s96-c']";//xpath
    public String blastLock_icon = "//*[name()='path' and contains(@d,'M18 8h-1V6')]";//xpath
    public String cancelEdit_button = "//div[@class='EditBlastPostPage_actionSection__cancel__wdDbD']/button";//xpath
    public String archiveconfirmation_button = "//div[@class='Main_iconText__f-xVC Main_iconBlueAquamarine__1b129 Main_iconPositionStart__IWQqT']";//xpath
    public String archivedBlast_text = "//div[@class='PostBlastPage_archivedSection__3cJxy']";//xpath
    public String commentBlast_field = "//input[@class='Main_input__qq9k9 Main_secondary__2bXP3']";//xpath
    public String inputcomment_field = "//div[@class='fr-element fr-view']";//xpath
    public String postcomment_button = "//h1[normalize-space()='Post']";//xpath
    public String latestcomment = "//div[@class='CommentItem_commentTextContainer__8Gd1V']";//xpath
    public String replycomment_button = "//div[@class='CommentItem_discussSection__newReply__item__3vpX_']";//xpath
    public String commentReplies_placeholder = "//input[@placeholder='Add new comment...']";//xpath
    public String commentReplies_field = "//div[@class='fr-element fr-view']";//xpath
    public String postcommentReplies = "//h1[normalize-space()='Post']";//xpath
    public String comment_morecontainer = "//div[@class='CommentItem_commentMenuSection__1dW17']//div[@class='More_container__2VGML']//*[name()='svg']";//xpath
    public String deletecomment_button = "//p[normalize-space()='Delete']";//xpath
    public String deletecomment_confirmation = "//h1[normalize-space()='Delete']";//xpath

    //input field
    public String blastTitle_input = "test blast -hanif";
    public String blastStory_input = "test story -hanif";
    public String editBlast_input = "edited by hanif";
    public String commentBlast_input = "test komen -hanif";




}
