import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {
        open("https://demoqa.com/text-box");


        $("[id=userName]").setValue("Anastasiya Z");
        $("[id=userEmail]").setValue("stasia-oops@yandex.ru");
        $("[id=currentAddress]").setValue("Sochi");
        $("[id=permanentAddress]").setValue("Samara");
        $("#submit").click();
        $("[id=output]").shouldHave(text("Anastasiya Z"),text("stasia-oops@yandex.ru"),
                text("Sochi"),text("Samara"));
    }
}
