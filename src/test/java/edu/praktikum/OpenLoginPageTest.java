package edu.praktikum;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static edu.praktikum.driver.WebDriverCreator.createWebDriver;

public class OpenLoginPageTest {

    private static final String LOGIN_URL = "https://stellarburgers.nomoreparties.site/login";

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = createWebDriver();
    }

    @Test
    public void test() {
        driver.get(LOGIN_URL);
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
