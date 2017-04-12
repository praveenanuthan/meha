package testng;



	
	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.AfterTest;

	public class TestNg {
		
	public WebDriver driver;
		
	  @Test
	  public void Display() {
		  String displayname;
		  displayname = driver.findElement(By.id("highlight-vacations")).getText();
		  System.out.println("Display name of Gmail link is "+displayname);
		  System.out.println("test executed");
		  
		  /*displayname = driver.findElement(By.name("btnK")).getAttribute("value");
		  System.out.println("Display name of Google search button is "+displayname);
		  
		  displayname = driver.findElement(By.id("hplogo")).getAttribute("title");
		  System.out.println("Tool tip of the image is "+displayname);*/
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  //driver = new FirefoxDriver();
		  System.setProperty("webdriver.chrome.driver", "E:\\seleinium1\\software\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://book2.spicejet.com/");
		  driver.manage().window().maximize();
		  System.out.println("before test executed");
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.quit();
		  
		  System.out.println("After test executed");
	  }

	}

