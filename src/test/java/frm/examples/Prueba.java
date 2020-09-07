package frm.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;

import frm.selenium.SeleniumConfig;

class Prueba {
	private static SeleniumConfig config;
    private static String url = "https://www.google.com/";
    	
    @Test
	void verificarTituloCorrectoParaHomeGoogle() {
		config = new SeleniumConfig();
		config.getDriver().get(url);		
		String title = config.getDriver().getTitle();
		assertNotNull(title);
	    assertEquals("Google", title);
	    config.getDriver().close();
	}
    
    @Test
	void verificarTituloCorrectoBusquedaGoogle() {
		config = new SeleniumConfig();
		config.getDriver().get(url);
		WebDriver driver = config.getDriver();
		driver.manage().window().setSize(new Dimension(1440, 877));
	    driver.findElement(By.name("q")).click();
	    driver.findElement(By.name("q")).sendKeys("perro");
	    driver.findElement(By.cssSelector("#tsf > div:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("center:nth-child(1) > .gNO89b")).click();
	    driver.findElement(By.cssSelector(".rhsg4")).click();
		String title = config.getDriver().getTitle();
		assertNotNull(title);
	    assertEquals("Google", title);
	    config.getDriver().close();
	}

}
