package StepDefinitions.example;

import org.openqa.selenium.By;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//--jika ingin panggil hook tinggal import package dibawah ini
import static baseAction.Hook.*;
//--
public class ex_001 {

    @Given("Given Step")
    public void givenStep() {
        System.out.println("This will run first");
    }

    @When("When Step")
    public void whenStep() {
        System.out.println("This will run second");
    }

    @Then("Then Step")
    public void thenStep() {
        System.out.println("This will run third");
    }
}
