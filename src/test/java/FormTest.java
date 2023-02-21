import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class FormTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;

    }

    @Test
    void fillFormTest() {
        open("https://demoqa.com/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");


        $("[id=firstName]").setValue("Z");
        $("[id=lastName]").setValue("Anastasiya");
        $("[id=userEmail]").setValue("stasia-oops@yandex.ru");
        $("#gender-radio-1").sendKeys(" ");
        $("[id=userNumber]").setValue("8927111111");

        $(".react-datepicker-wrapper").click();
        $(".react-datepicker__year-select").$(byText("1991")).click();
        $(".react-datepicker__month-select").$(byText("June")).click();
        $(".react-datepicker__day.react-datepicker__day--027").click();

        $("#subjectsInput").setValue("Arts").pressEnter();
        $("#hobbies-checkbox-1").sendKeys(" ");
        $("#uploadPicture").uploadFromClasspath("pictures/img1.png");
        $("[id=currentAddress]").setValue("SamaraSamaraSamaraSamaraSamaraSamaraSamara");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Noida")).click();
        $("#submit").click();


        $(".table-responsive").shouldHave(
                text("Z Anastasiya"),
                text("stasia-oops@yandex.ru"),
                text("Male"),
                text("8927111111"),
                text("27 May,1991"),
                text("Arts"),
                text("Sports"),
                text("img1.png"),
                text("SamaraSamaraSamaraSamaraSamaraSamaraSamara"),
                text("NCR Noida"));
    }
}

