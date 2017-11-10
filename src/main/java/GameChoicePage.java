import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class GameChoicePage {
    @FindBy(how = How.LINK_TEXT, using = "Своя игра")
    private SelenideElement gameLink;

    public GameSettingsPage chooseGame(){
        gameLink.click();
        return page(GameSettingsPage.class);
    }
}
