package SampleG.Sample;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class X {

	@Test
public void Met() {
	// TODO Auto-generated method stub
//	System.setProperty("webdriver.chrome.driver", "/D:\\chromedriver-win64\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
//	driver.get("https://www.google.co.in/");
	driver.get("https://www.youtube.com/");
	
	
}
	
}
