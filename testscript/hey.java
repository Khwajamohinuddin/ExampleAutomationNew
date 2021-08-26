package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hey {
public static WebDriver oBrowser = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        launchrowser();
        navigate();
        login();
        minimizeflywindow();
	}
static void launchrowser()
{
	try
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KHWAJA\\Downloads\\chromedriver.exe");
		oBrowser = new ChromeDriver();
		oBrowser.manage().window().maximize();
		Thread.sleep(4000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
static void navigate()
{
	try
	{
		oBrowser.navigate().to("http://localhost/login.do");
		Thread.sleep(4000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
static void login()
{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
		Thread.sleep(4000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
static void minimizeflywindow()
{
	try
	{
		oBrowser.findElement(By.id("//*[@id=\"gettingStartedShortcutsMenuCloseId\"]")).click();
		Thread.sleep(40000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
