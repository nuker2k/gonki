import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.sleep;

public class LoginPage {

    @FindBy(how = How.ID, using = "login-link")
    private SelenideElement loginLink;

    @FindBy(how = How.ID, using = "username")
    private SelenideElement login;

    @FindBy(how = How.ID, using = "password")
    private SelenideElement password;

    @FindBy(how = How.ID, using = "login_form_submit")
    private SelenideElement loginButton;

    public GameChoicePage login(String login, String password){
        loginLink.click();
//        sleep(20000);
        this.login.setValue(login);
        this.password.setValue(password);
        loginButton.click();
        return page(GameChoicePage.class);
    }
}
