package teste;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import driver.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import metodos.Metodos;

public class Teste extends Driver {
	Metodos metodos = new Metodos();

	By clubelivelo = By.xpath("//*[@id=\"span-side-menu-1\"]");

	@Before
	public void iniciarteste() {

		String site = "https://www.livelo.com.br/";
		WebDriverManager.chromedriver().setup();

		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("start-maximized");

		driver = new ChromeDriver(chromeoptions);
		driver.get(site);

	}

	@After
	public void fecharnavegador() {

		driver.quit();

	}

	@Test
	public void testando() throws IOException, InterruptedException {

		Thread.sleep(6000);

		driver.findElement(clubelivelo).click();
		Metodos.evidencia("CT01 - Foto");
	}

}
