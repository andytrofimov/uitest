package ru.atrofimov.uitest.page;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import ru.atrofimov.uitest.page.component.LanguageSelect;

public class TranslatorPage {

    private SelenideElement sourceTextArea = $("#fakeArea");

    private LanguageSelect srcLangSelect = new LanguageSelect($("#srcLangButton"),
        $("#srcLangListbox"));
    private LanguageSelect dstLangSelect = new LanguageSelect($("#dstLangButton"),
        $("#dstLangListbox"));

    @Step
    public TranslatorPage selectLanguages(String srcLang, String dstLang) {
        srcLangSelect.selectLanguage(srcLang);
        dstLangSelect.selectLanguage(dstLang);
        return this;
    }

    @Step
    public TranslatorPage assertTranslation(String expected) {
        $("#translation").shouldHave(text(expected));
        return this;
    }

    @Step
    public TranslatorPage typeSourceText(String text) {
        sourceTextArea.val(text);
        return this;
    }

    @Step
    public TranslatorPage assertSourceText(String expected) {
        sourceTextArea.shouldHave(text(expected));
        return this;
    }

}
