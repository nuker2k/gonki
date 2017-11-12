package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import common.enums.AwaitingTimeEnum;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class TypingPage {

    @FindBy(how = How.ID, using = "host_start")
    private SelenideElement startLink;

    @FindBy(how = How.ID, using = "inputtext")
    private SelenideElement inputText;

    @FindBy(how = How.ID, using = "typefocus")
    private SelenideElement typeFocus;

    @FindBy(how = How.ID, using = "afterfocus")
    private SelenideElement afterFocus;

    public void type(AwaitingTimeEnum awaitingTime) {
        if (startLink.isDisplayed()) {
            startLink.click();
        }
        Selenide.sleep(awaitingTime.getAmountOfSeconds());

        typeFocus.waitUntil(Condition.exist, 30000).waitUntil(Condition.visible, 30000);
        StringBuilder wholeText = new StringBuilder();
        Pattern pattern = Pattern.compile("(<span>)(.*?)(</span>)");
        Matcher matcher = pattern.matcher(typeFocus.innerHtml());
        while (matcher.find()) {
            wholeText.append(matcher.group(2));

        }
        matcher = pattern.matcher(afterFocus.innerHtml());
        while (matcher.find()) {
            wholeText.append(matcher.group(2));
        }
        System.out.println("Text:" + wholeText.toString());
        String text = wholeText.toString().replace("c", "с").replace("o", "о");
        for (String word : text.split(" ")) {
            System.out.println(word);
            inputText.waitUntil(Condition.empty, 10000).setValue(word + " ");
        }
    }
}
