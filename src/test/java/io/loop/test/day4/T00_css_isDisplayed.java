package io.loop.test.day4;

import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;

public class T00_css_isDisplayed {
    /*
    https://the-internet.herokuapp.com/forgot_password
     */

    public static void main(String[] args) {

        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/forgot_password");

    }

}

