package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import helpers.DataHelper;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.PaymentPage;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Tests1 {

    @Test
    public void test(){
        Configuration.holdBrowserOpen = true;
        open("http://localhost:8080/");

        MainPage.debitCardButton.click();
        $(byText("Номер карты")).parent().$("input.input__control").setValue("4444444444444441");
        PaymentPage.monthField.setValue("01");
        PaymentPage.yearField.setValue("24");
        PaymentPage.nameField.setValue("JKL:");
        PaymentPage.cvcField.setValue("333");
        PaymentPage.finishButton.click();
        PaymentPage.successNotification.shouldBe(Condition.visible, Duration.ofSeconds(30));
    }

    public static void main(String[] args) {
        Configuration.holdBrowserOpen = true;
        open("http://localhost:8080/");
        $(byText("Купить")).click();
        PaymentPage.finishButton.click();
    }

}
