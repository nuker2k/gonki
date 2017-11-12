package common.utils;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.TimeoutException;

public class WaitUtils {

    public boolean isDisplayed(SelenideElement e) {
        try {
            Selenide.Wait()
                .withTimeout(7, TimeUnit.SECONDS)
                .until(condition -> e.is(Condition.appear));
            return true;
        } catch (TimeoutException th) {
            return false;
        }
    }
}
