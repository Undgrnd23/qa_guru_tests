import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;

public class AutomationTestForm {

    @BeforeAll
    static void beforeAll() {
        baseUrl = "https://demoqa.com";
        holdBrowserOpen = true;
    }

    @Test
    void fillFormTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Neo");
        $("#lastName").setValue("Matricev");
        $("#userEmail").setValue("neo-matricev@matrix.com");
        $(".custom-control-label").shouldHave(text("Male")).click();
        $("#userNumber").setValue("+777777777");







    }
}
