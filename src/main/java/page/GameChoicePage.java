package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;


public class GameChoicePage {

    @FindBy(how = How.LINK_TEXT, using = "Своя игра")
    private SelenideElement customGame;

    @FindBy(how = How.LINK_TEXT, using = "Быстрый старт")
    private SelenideElement fastGame;

    public GameSettingsPage chooseCustomGame() {
        customGame.click();
        return page(GameSettingsPage.class);
    }

    public TypingPage chooseFastGame() {
        customGame.click();
        return page(TypingPage.class);
    }
}
