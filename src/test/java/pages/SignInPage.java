package pages;

import org.joda.time.Seconds;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class SignInPage {

    public SignInPage() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id="email")
    public WebElement email;

    @FindBy(xpath = "//a[@href='/login/']")
    public WebElement SignIn_button;

    @FindBy(id = "submit")
    public WebElement Next_button;

    @FindBy(xpath="//input[@id='password']")
    public WebElement password_field;

    @FindBy(id="submit")
    public WebElement SignIn_pinkButton;

    @FindBy(xpath = "//img[@class='ui avatar image avatar-trigger-image']")
    public WebElement avatar;

    @FindBy(xpath ="//a[@href='/logout']")
    public WebElement LogOut;

    public void SignIn(String username,String password){

        SignIn_button.click();
        email.sendKeys(username);
        Next_button.click();
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.visibilityOf(password_field));
        password_field.sendKeys(password);
        SignIn_pinkButton.click();

    }
}
