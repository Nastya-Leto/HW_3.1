import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class TestPrice {
    @Test
    void fullTestPrice() {
        open("https://github.com/");
    $(byText("Solutions")).hover();
    $(byText("Enterprise")).click();
    $("div h1").shouldHave(text("Build like the best"));

    }
}
