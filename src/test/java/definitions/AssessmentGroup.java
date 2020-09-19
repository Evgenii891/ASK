package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;


public class AssessmentGroup {

//    @Then("text {string} appears")
//    public void textAppears(String text) {
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException ie) {
//            String actualText = getDriver().findElement(By.xpath("//*[contains(text(),'" + text + "')]")).getText();
//            assertThat(actualText).containsIgnoringCase(text);
//        }
//    }

//    @When("I click on {string}")
//    public void iClickOn(String button) {
//        getDriver().findElement(By.xpath("//h5[contains(text(),'Assignments')]")).click();
//    }

    @Then("element {string} contains text {string}")
    public void elementContainsText(String xpath, String text) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
            String actualText = getDriver().findElement(By.xpath(xpath)).getText();
            assertThat(actualText).contains(text);
        }

    }

    @And("I wait element with xpath {string} to be present")
    public void iWaitElementWithXpathToBePresent(String xpath) {
        new WebDriverWait(getDriver(), 100, 10000).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }

    @Then("element with xpath {string} is present")
    public void elementWithXpathIsPresent(String xpath) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            assertThat(getDriver().findElements(By.xpath(xpath))).hasSize(1);
        }
    }

    @When("I click on assignments button")
    public void iClickOnAssignmentsButton() {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Assignments')]")).click();
    }

    @And("I click on create new assignment button")
    public void iClickOnCreateNewAssignmentButton() {
        getDriver().findElement(By.xpath("//body/ac-root/mat-sidenav-container/mat-sidenav-content/main/ac-assignments-list-page/mat-card/div/a/button/span[1]")).click();
    }

    @And("I click on Group Filter")
    public void iClickOnGroupFilter() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
        getDriver().findElement(By.xpath("//mat-select[@placeholder='Group Filter']//div//div//div")).click();}
    }

    @And("I click on Group Number")
    public void iClickOnGroupNumber() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie){
        getDriver().findElement(By.xpath("//mat-option[20]//span[1]")).click();}
    }

    @Then("element dashboard contains text {string}")
    public void elementDashboardContainsText(String text) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            String actualText = getDriver().findElement(By.xpath("//a[3]//div[1]//div[2]//h5[1]")).getText();
            assertThat(actualText).containsIgnoringCase(text);
        }
    }

    @And("I click on Quiz to assign")
    public void iClickOnQuizToAssign() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie){
        getDriver().findElement(By.xpath("//mat-select[@placeholder='Select Quiz To Assign']//div//div//span")).click();}
    }


    @And("I click on Give assignment button")
    public void iClickOnGiveAssignmentButton() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie){
        getDriver().findElement(By.xpath("//body/ac-root/mat-sidenav-container/mat-sidenav-content/main/ac-create-assignment-page/mat-card/form/div/button/span[1]")).click();}
    }

    @And("I click on Quiz _N q")
    public void iClickOnQuiz_NQ() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie){
        getDriver().findElement(By.xpath("//mat-option[1]//span[1]")).click();}
    }

//    @And("I click on Select All")
//    public void iClickOnSelectAll() {
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException ie){
//        getDriver().findElement(By.xpath("//html//body//ac-root//mat-sidenav-container//mat-sidenav-content//main//ac-create-assignment-page//mat-card//form//div//div//button//span")).click();}
//    }

    @When("I click on Go to my assignments button")
    public void iClickOnGoToMyAssignmentsButton() throws InterruptedException {
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException ie){
            Thread.sleep(2000);
            getDriver().findElement(By.xpath("//h5[contains(text(),'My Assignments')]")).click();
//    }
    }
}

