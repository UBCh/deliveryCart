
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class TestDeliveryCart {

    java.util.Date date = new java.util.Date();

    @Test
    void shouldSubmittingForm() {
        open("http://localhost:9999");
        $("[data-test-id='city']").setValue("москва");
        GetData data = new GetData();
        $(".calendar-input").val(String.valueOf(data));
        // $("[data-test-id='date']").setValue("24.12.2021");
        $("[data-test-id='name']").setValue("Мис Пигги");
        $("[data-test-id='phone']").setValue("+79095463728");
        $("[data-test-id='agreement']").click();
        $(".button__text").click();
        $(withText("Успешно!")).shouldBe(visible, Duration.ofMillis(5000));
    }

}
