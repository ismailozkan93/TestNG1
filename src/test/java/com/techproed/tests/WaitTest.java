package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WaitTest extends TestBase {
@Test
public void implicitlyWait(){
    driver.get("https://the-internet.herokuapp.com/dynamic_controls");
    WebElement removeButonu = driver.findElement(By.xpath("//*[.='Remove']"));
    removeButonu.click();
    WebElement element = driver.findElement(By.xpath("//*[.='Add']"));

    Assert.assertTrue(element.isDisplayed());

    WebDriverWait wait=new WebDriverWait(driver,30);

    WebElement mesaj= driver.findElement(By.id("message"));
    System.out.println(mesaj.getText());

}
@Test

public void explicitWait(){
    driver.get("http://the-internet.herokuapp.com/dynamic_controls");
    //Explicit Wait kullanmak için, WebDriverWait class'ından nesne üretmek zorundayız.
    WebDriverWait wait = new WebDriverWait(driver,30);
    WebElement removeButton = driver.findElement(By.xpath("//*[.='Remove']"));
    removeButton.click();
    WebElement message = driver.findElement(By.id("message"));
    System.out.println(message.getText());
}
}
