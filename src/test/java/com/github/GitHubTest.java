package com.github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubTest {

    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://github.com";
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "0x0";
    }

    @Test
        // Откройте страницу Selenide в Github
        // Перейдите в раздел Wiki проекта
        // Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        // Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5

    void gitHubTest() {
        open("/selenide/selenide");
        $("#wiki-tab").click();
        $(".markdown-body").$(byText("Soft assertions")).click();
        $(".markdown-body").shouldHave(text("Using JUnit5"));
    }

    @Test
    void gitHubHoverTest() {
        open("https://github.com/");
        $(".d-lg-flex").$(byText("Solutions")).hover();
        $(".border-bottom").$(byText("Compare all")).click();
        $(".application-main").shouldHave(text("Compare features"));
    }
}
