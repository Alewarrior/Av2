package sistemadetestes.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProdutoTest3 {
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
	public void TC003_CadastrarProdutoSoComCodigo() {
		//iniciar
		iniciar();
		
		//preparação
		WebElement buttonAdiconar = driver.findElement(By.id("btn-adicionar"));
		WebElement inputCodigo = driver.findElement(By.id("codigo"));
		WebElement inputSalvar = driver.findElement(By.id("btn-salvar"));
		
		buttonAdiconar.click();
		buttonAdiconar.click();
		inputCodigo.sendKeys("501");
		inputSalvar.click();
		String resultado = driver.findElement(By.id("mensagem")).getText();
		
		assertTrue(resultado, resultado.contains("Todos os campos são obrigatórios para o cadastro!"));

	}
		
}