package sistemadetestes.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProdutoTest5 {
	private WebDriver driver;
	private String URL_BASE = "C:/AV2-selenium-lab-main/sistema/produtos.html";
	private String PATH_DRIVE = "src\\test\\resources\\chromedriver.exe";
	
	private void iniciar() {
		System.setProperty("webdriver.chrome.driver", PATH_DRIVE);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL_BASE);
	}
	
	@Test
	public void TC005_FecharTelaDeCadastro() {
		//iniciar
		iniciar();
		
		//preparação
		WebElement buttonAdiconar = driver.findElement(By.id("btn-adicionar"));
		WebElement inputSair = driver.findElement(By.id("btn-sair"));
		
		buttonAdiconar.click();
		buttonAdiconar.click();
		inputSair.click();
		inputSair.click();

	}
	
}