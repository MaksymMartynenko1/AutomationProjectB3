package io.loop.test.day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    /*
     * Navigate to Google search
     * maximize the page
     * get title of the page
     * get url of the page
     * validate the title, expected title is "Google"
     * validate the url of the page, expected url is "https://www.google.com/"
     * close the brower
     */
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)){
            System.out.printf("Actual title: " + actualTitle + ", matches expected title: " + expectedTitle + ". => TEST PASS");
        } else {
            System.out.println("Actual title: " + actualTitle + ", DOES NOT MATCH expected title: " + expectedTitle + ". => TEST FAIL");
        }

        String expectedUrl = "https://www.google.com";
        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.contains(expectedUrl)){
            System.out.println("Actual url: " + actualUrl + ", matches expected url: " + expectedUrl + ". => TEST PASS");
            System.out.println("Actual url: " + actualUrl + ", DOES NOT MATCH expected url: " + expectedUrl + ". => TEST FAIL");
        }


        driver.quit();


    }
}
