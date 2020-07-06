package ru.atrofimov.uitest.page.component;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.sleep;
import com.codeborne.selenide.SelenideElement;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LanguageSelect {

    SelenideElement srcLangBtn;
    SelenideElement root;

    public LanguageSelect selectLanguage(String lang) {
        if (!srcLangBtn.getText().equalsIgnoreCase(lang)) {
            srcLangBtn.click();
            root.$(byText(lang)).click();
            srcLangBtn.shouldHave(text(lang));
            sleep(200); // ну куда ж без этого
        }
        return this;
    }

}
