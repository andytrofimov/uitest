package ru.atrofimov.uitest.page;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.driver;
import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PhotoUploadPage {

    @Step
    public TranslatorPage uploadPhoto(String name) {
        $("#fileInput").uploadFromClasspath("images/" + name);
        $("[data-action='paste']").click();
        driver().switchTo().window(
            driver().getWebDriver().getWindowHandles().size() - 1);
        return page(TranslatorPage.class);
    }

}
