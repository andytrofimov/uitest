package ru.atrofimov.uitest.common;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseUiTest {

    @BeforeAll
    public static void beforeAll() {
//         Configuration.browser = "firefox";
        Configuration.baseUrl = "https://translate.yandex.ru";
    }

    @BeforeEach
    public void beforeEach() {
        WebDriverRunner.clearBrowserCache();
    }
}
