package Testes;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CadastroDadosTeste {
	
	static WebDriver driver;
	static CadastroDadosTeste CadastroDadosPage;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		CadastroDadosPage = new CadastroDadosTeste();
	}
	
	@Test
	public void ClicarDuasVezes() {
		WebElement more = driver.findElement(By.xpath("//a[contains(text(),'Modals')]"));
		more.click();
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	

}
