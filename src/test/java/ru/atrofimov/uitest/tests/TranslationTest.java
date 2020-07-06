package ru.atrofimov.uitest.tests;

import static com.codeborne.selenide.Selenide.open;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.atrofimov.uitest.common.BaseUiTest;
import ru.atrofimov.uitest.page.TranslatorPage;

public class TranslationTest extends BaseUiTest {

    @ParameterizedTest
    @CsvSource({
        "Русский, Английский, синхрофазотрон, synchrophasotron",
        "Латынь, Таджикский, dura lex, сахт қонуни"
    })
    void translationSmokeTest(String srcLang, String dstLang, String src, String dst) {
        open("/", TranslatorPage.class)
            .selectLanguages(srcLang, dstLang)
            .typeSourceText(src)
            .assertTranslation(dst);
    }
}