package ru.atrofimov.uitest.tests;

import static com.codeborne.selenide.Selenide.open;
import org.junit.jupiter.api.Test;
import ru.atrofimov.uitest.common.BaseUiTest;
import ru.atrofimov.uitest.page.PhotoUploadPage;

public class PhotoUploadTest extends BaseUiTest {

    @Test
    void photoUploadSmokeTest() {
        open("/ocr", PhotoUploadPage.class)
            .uploadPhoto("1.png")
            .assertSourceText("Je t'aime")
            .assertTranslation("Я тебя люблю");
    }
}
