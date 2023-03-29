package tests;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends TestBase {
    WebDriver wd;

    @BeforeMethod
    public void preCondition(){

        if (app.getUser().isLogged()) {
            app.getUser().logOut();
        }
    }


    @Test
    public void login() {
        // WebElement el1= wd.findElement(By.cssSelector("[href='/login']"));
        // el1.click();
        //wd.findElement(By.cssSelector("[href='/login']")).click();

        User user = new User().setEmail("p.v.2977187@gmail.com").setPassword("P29348092l");
        app.getUser().initLogin();
        app.getUser().pause(2000);
        app.getUser().fillINLoginForm(user);
        app.getUser().submitLogin();
        app.getUser().pause(2000);

        Assert.assertTrue(app.getUser().isLogged());


    }
    @Test
    public void login2() {
        // WebElement el1= wd.findElement(By.cssSelector("[href='/login']"));
        // el1.click();
        //wd.findElement(By.cssSelector("[href='/login']")).click();

        app.getUser().initLogin();
        app.getUser().pause(2000);
        app.getUser().fillINLoginForm("p.v.2977187@gmail.com","P29348092l");
        app.getUser().submitLogin();
        app.getUser().pause(2000);

        Assert.assertTrue(app.getUser().isLogged());


    }
}
