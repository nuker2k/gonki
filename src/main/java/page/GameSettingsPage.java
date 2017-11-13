package page;

import com.codeborne.selenide.SelenideElement;
import common.enums.AwaitingTimeEnum;
import common.enums.GamePrivacyEnum;
import common.enums.LanguageEnum;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class GameSettingsPage {

    @FindBy(how = How.ID, using = "timeout")
    private SelenideElement timeout;

    @FindBy(how = How.ID, using = "type")
    private SelenideElement type;

    @FindBy(how = How.ID, using = "submit_btn")
    private SelenideElement submitButton;

    @FindBy(how = How.XPATH, using = "//table[@class='gametypes']//*[text()='Набор случайной цитаты из книги.']")
    private SelenideElement commonRussian;

    @FindBy(how = How.XPATH, using = "//table[@class='gametypes']//*[text()='Игра по пользовательскому словарю.']")
    private SelenideElement english;


    public GameSettingsPage setLanguage(LanguageEnum language) {
        SelenideElement element = language == LanguageEnum.RUSSIAN ? commonRussian : english;
        element.click();
        return this;
    }

    public GameSettingsPage setTimeout(AwaitingTimeEnum awaitingTime) {
        timeout.selectOptionByValue(awaitingTime.getValue());
        return this;
    }

    public GameSettingsPage setPrivacy(GamePrivacyEnum gamePrivacy) {
        type.selectOptionByValue(gamePrivacy.getValue());
        return this;
    }

    public TypingPage proceedToTypingPage() {
        submitButton.click();
        return page(TypingPage.class);
    }
}
