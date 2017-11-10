import com.codeborne.selenide.Configuration;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.sleep;

import static com.codeborne.selenide.Selenide.open;

public class GonkiTest {


    @Test
    public void test(){
        Configuration.browser = "chrome";
        open("http://klavogonki.ru/", LoginPage.class)
            .login("radical", "haifisch1521")
            .chooseGame()
            .setTimeout("20")
            .startGame()
            .startGame()
            .type();
        sleep(20000);
    }
}
