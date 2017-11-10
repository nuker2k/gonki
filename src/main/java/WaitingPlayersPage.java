import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.sleep;

public class WaitingPlayersPage {

    @FindBy(how = How.ID, using = "host_start")
    private SelenideElement startLink;

    public GamePage startGame(){
        startLink.waitUntil(Condition.visible, 100000).click();
        sleep(20000);
        return page(GamePage.class);
    }
}
