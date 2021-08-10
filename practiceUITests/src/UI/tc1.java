package UI;

import org.openqa.selenium.support.ui.Select;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.sun.org.apache.bcel.internal.generic.Select;

public class tc1 {
@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ashee\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]"));
		e1.click();
	    e1.getSize();
	    WebElement e2 = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/ul[1]/li[28]/a[1]/div"));
	    String b = e2.getText();
	    System.out.println(b);
	    Dimension a = e2.getSize();
	    System.out.println(a);
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/ul[1]/li[7]/a")).click();
	    WebElement e3 = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/ul[2]"));
	    System.out.println(e3.getSize());
	    driver.findElement(By.xpath("/html/body/div[3]/div[1]/div")).click();
	    Actions action = new Actions(driver);
	    WebElement e4 = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
	    action.moveToElement(e4).perform();
	    //Select select= new Select(WebElement webelement);
	    WebElement testdropdown = driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]"));
	    Select Se  = new Select(testdropdown);
	    System.out.println(Se.getOptions());
	    //Select dropdown = new Select(testdropdown);
	    //System.out.println(we.size());
	    //System.out.println(Se.getLength());
	    driver.close();


	}

}
