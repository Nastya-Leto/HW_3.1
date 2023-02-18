import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {
        open("https://demoqa.com/automation-practice-form");



       $("[id=firstName]").setValue("Z");
       $("[id=lastName]").setValue("Anastasiya");
       $("[id=userEmail]").setValue("stasia-oops@yandex.ru");

        //$(By.name("me")).selectRadio("cat"); - Как использовать
        $("#gender-radio-1").sendKeys(" ");
               $("[id=userNumber]").setValue("8927111111");
        $("#hobbies-checkbox-1").sendKeys(" ");

      //  $("[id=userNumber]").setValue("Samara");
        //$("#submit").click();
        //$("[id=output]").shouldHave(text("Anastasiya Z"),text("stasia-oops@yandex.ru"),
            //    text("Sochi"),text("Samara"));
    }
}

