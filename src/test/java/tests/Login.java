package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Login {
    WebDriver wd;

    @Test
    public void login(){
        click(By.cssSelector("[href='/login']"));
        type(By.cssSelector("#user"), "test@gmail.com");

    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void click(By locator){
        wd.findElement(locator).click();
    }
}
