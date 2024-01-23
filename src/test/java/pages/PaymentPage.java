package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class PaymentPage {
    public static SelenideElement approvedCardNumber = $(byText("Номер карты")).parent().$("input.input__control");
    public static SelenideElement declinedCardNumber = $(byText("Номер карты")).parent().$("input.input__control");
    public static SelenideElement monthField = $(byText("Месяц")).parent().$("input.input__control");
    public static SelenideElement yearField = $(byText("Год")).parent().$("input.input__control");
    public static SelenideElement nameField = $(byText("Владелец")).parent().$("input.input__control");
    public static SelenideElement cvcField = $(byText("CVC/CVV")).parent().$("input.input__control");
    public static SelenideElement finishButton = $(byText("Продолжить"));
    public static SelenideElement successNotification = $(byText("Успешно")).parent().$("div.notification__content").shouldHave(Condition.exactText("Операция одобрена Банком."));
    public static SelenideElement failNotification = $(byText("Ошибка")).parent().$("div.notification__content").shouldHave(Condition.exactText("Ошибка! Банк отказал в проведении операции."));
    public static SelenideElement wrongFormat = $("span.input__sub").shouldHave(Condition.exactText("Неверный формат"));
    public static SelenideElement wrongCardTime = $("span.input__sub").shouldHave(Condition.exactText("Истёк срок действия карты"));
    public static SelenideElement wrongMonthTime = $("span.input__sub").shouldHave(Condition.exactText("Неверно указан срок действия карты"));
    public static SelenideElement fieldNeedToFill = $("span.input__sub").shouldHave(Condition.exactText("Поле обязательно для заполнения"));

}
