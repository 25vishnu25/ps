package selenium_project;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.beust.jcommander.Strings;

public class Demo1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moneycontrol.com/");
		System.out.println(driver.getTitle());
		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Personal Finance"))).build().perform();
		driver.findElement(By.linkText("Income Tax Calculator")).click();
		
//		//2
//		Set<String> st =driver.getWindowHandles();
//		Iterator <String> itr =st.iterator();
//		String switchScreen = itr.next();
//		String screen = itr.next();
//		driver.switchTo().window(screen);
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='tax_container' //input[@value='without'")).click();
		
		//3
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("22");
		
		//4
		Select drop =new Select(driver.findElement(By.className("cutselect")));
		drop.selectByVisibleText("Stay in Non Metro city");
		
		//5
		driver.findElement(By.cssSelector("[title=Next]")).click();
		
		//6
		driver.findElement(By.cssSelector("[id=annual_salary]")).sendKeys("15000");
		driver.findElement(By.cssSelector("[id=other_income]")).sendKeys("15000");
		driver.findElement(By.id("income_tab_next")).click();
		
		//7
		driver.findElement(By.id("tax_saving_investment")).sendKeys("2000");
		driver.findElement(By.cssSelector("title=Next")).click();
		
		//8
		WebElement paid = driver.findElement(By.className("summary_text"));
		System.out.println(paid.getText());
		
		//9
		action.moveToElement(driver.findElement(By.linkText("Mutual Funds"))).build().perform();
		driver.findElement(By.linkText("Top Ranked Funds"));
		
		//10
		driver.findElement(By.className("robo_medium")).click();
		
		//11
		Set<String> st = driver.getWindowHandles();
		Iterator <String> itr = st.iterator();
		String switchScreen= itr.next();
		String screen itr.next();
		driver.switchTo().window(screen);

		WebElement atmc= driver.findElement(By.className("amt")); 
		System.out.println(atmc.getText());
		

	}

}
