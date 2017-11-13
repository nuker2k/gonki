import com.codeborne.selenide.Selenide;
import common.enums.AwaitingTimeEnum;
import common.enums.GamePrivacyEnum;
import common.enums.LanguageEnum;
import org.junit.Test;
import page.LoginPage;

import static com.codeborne.selenide.Selenide.open;


public class GonkiTest extends LoadConfiguration {

    @Test
    public void customGameTest() {
        open("http://klavogonki.ru/", LoginPage.class)
            .login("radical", "haifisch1521")
            .chooseCustomGame()
            .setLanguage(LanguageEnum.RUSSIAN)
            .setPrivacy(GamePrivacyEnum.PRIVATE_GAME)
            .setTimeout(AwaitingTimeEnum.TEN_SECONDS)
            .proceedToTypingPage()
            .type(AwaitingTimeEnum.TEN_SECONDS);

        Selenide.sleep(20000);
    }
}
