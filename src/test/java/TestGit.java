import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class TestGit {


  @Test
  void fulltestGit() {

    open("https://github.com/");
    //если есть пробел, то ставим одинарные кавычки
    $("[placeholder='Search GitHub']").setValue("selenide").pressEnter();
    $$("ul.repo-list li").first().$("a").click();
    $("#repository-container-header").shouldHave(text("selenide / selenide"));

    $("div.Layout-sidebar").$(byText("Contributors"))
    //                .closest(".BorderGrid-cell").$$("li").first().hover();
            .closest("h2").sibling(0).$$("li").first().hover();
    $(".Popover-message").shouldHave(text("Andrei Solntsev"));
    //$$(".Popover").findBy(visible).shouldHave(text("Andrei Solntsev")); // найти первый видимый элемент



    sleep(5000);
  }
}
