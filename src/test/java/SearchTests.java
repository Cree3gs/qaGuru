import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
    @Test
    void duckDuckGoSearchTest1() {
        open("https://duckduckgo.com/");
        $(".searchbox_input__rnFzM").setValue("selenide").pressEnter();
        $(".Wo6ZAEmESLNUuWBkbMxx").shouldHave(text("https://selenide.org"));
    }

    @Test
    void rumblerSearchTest2() {
        open("https://www.rambler.ru/");
        $(".rc__86etrn").setValue("selenide").pressEnter();
        $(".SmartCaptcha__title--yQxdI").shouldHave(text("Увы, что-то пошло не так"));
    }
}
