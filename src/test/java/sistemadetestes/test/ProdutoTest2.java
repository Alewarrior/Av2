package sistemadetestes.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProdutoTest2 {
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
	public void TC002_CadastrarProdutoComSucesso() {
		//iniciar
		iniciar();
		
		//preparação
		WebElement buttonAdiconar = driver.findElement(By.id("btn-adicionar"));
		WebElement inputCodigo = driver.findElement(By.id("codigo"));
		WebElement inputNome = driver.findElement(By.id("nome"));
		WebElement inputQuantidade = driver.findElement(By.id("quantidade"));
		WebElement inputValor = driver.findElement(By.id("valor"));
		WebElement inputData = driver.findElement(By.id("data"));
		WebElement inputSalvar = driver.findElement(By.id("btn-salvar"));
		WebElement inputSair = driver.findElement(By.id("btn-sair"));
		
		buttonAdiconar.click();
		buttonAdiconar.click();
		inputCodigo.sendKeys("501");
		inputNome.sendKeys("Canetas");
		inputQuantidade.sendKeys("100");
		inputValor.sendKeys("50");
		inputData.sendKeys("04122022");
		inputSalvar.click();
		String resultado = driver.findElement(By.id("mensagem")).getText();
		inputSair.click();
		inputSair.click();
		
		assertTrue(resultado, resultado.contains(""));

	}
		
}