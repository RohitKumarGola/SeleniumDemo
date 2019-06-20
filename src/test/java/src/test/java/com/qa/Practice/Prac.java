package src.test.java.com.qa.Practice;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac {
	public static void main(String[] args) throws InterruptedException {
		String s2="rohitkumar17061997@gm1ail.com";
		String expectedTitle="Gmail";
		System.setProperty("webdriver.chrome.driver",  "/home/qainfotech/Downloads/chromedriver");
      
		WebDriver driver=new ChromeDriver();  
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		email.sendKeys(s2);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		String e= "Couldn't find your Google Account";
		String a= driver.findElement(By.cssSelector("div.GQ8Pzc")).getText();  
		//driver.findElement(By.cssSelector("span.TQGan")).getText();
		if(a.equals(e))
		{
			System.out.println("Enter a valid email or phone number");
		
		}
		
		
		
		Thread.sleep(3000);
		WebElement pass=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		pass.sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
		String actualTitle=driver.getTitle();
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("title is matched");
		
		}
		
				
				
	}
	
	
	
	
}
