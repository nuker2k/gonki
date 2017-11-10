import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GamePage {

    @FindBy(how = How.ID, using = "inputtext")
    private SelenideElement inputTexz;

    @FindBy(how = How.ID, using = "typefocus")
    private SelenideElement typeFocus;

    @FindBy(how = How.ID, using = "afterfocus")
    private SelenideElement afterFocus;

    public GamePage type(){
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
        String text = wholeText.toString().replace("с", "c").replace("С", "C")
            .replace("Т", "T").replace("Н", "H").replace("А", "A")
            .replace("Е", "E").replace("о", "o").replace("О", "O");
        for(String word : text.split(" ")){
            System.out.println(word);
            inputTexz.waitUntil(Condition.empty, 10000).setValue(word + " ");
        }

        return this;
    }

    public static void main(String[] args) {
        new GamePage().type();
    }


}
