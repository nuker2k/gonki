import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;


public class LoadConfiguration {

    @BeforeClass
    public static void setSettings() {
        Configuration.browser = "firefox";
    }
}
