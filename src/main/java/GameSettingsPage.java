import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class GameSettingsPage {

    @FindBy(how = How.ID, using = "timeout")
    private SelenideElement timeout;

    @FindBy(how = How.ID, using = "submit_btn")
    private SelenideElement submitButton;



    public GameSettingsPage setTimeout(String timeout){
        this.timeout.selectOptionByValue(timeout);
        return this;
    }

    public WaitingPlayersPage startGame() {
        submitButton.click();
        return page(WaitingPlayersPage.class);
    }
}
