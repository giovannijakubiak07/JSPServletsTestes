/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testesSistema;

import com.thoughtworks.selenium.Selenium;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author giova
 */
public class Teste2 {
    
    private static Selenium selenium;
   
    private WebDriver driver;
    
    @BeforeClass
    public static void setUpClass() {
        
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\giova\\Desktop\\UDESC\\6SEXTA_FASE\\TESTES DE SOFTWARE\\drivers\\chromedriver.exe");
          
                   
//      WebElement element = driver.findElement(By.id("lst-ib"));
//                    
//                    element.sendKeys("facebook");
//                    
//                    element.sendKeys(Keys.ENTER);
//                    
//                    element = driver.findElements(By.id("ide")).get(0);
//                    
//                    element.click();
    }
    @Before
    public void setUp() {
                  
    driver = new ChromeDriver();
                    
    driver.get("http://localhost:8080/65TES_GiovanniJakubiak_DouglasBussmann/");
    
    }
    
    @After
    public void tearDown() {
    }
    
    @AfterClass
    public static void tearDownClass() {
        
    }
    
    
    //manteve-se na mesma pagina é porque deu certo!
    @Test
    public void testeCampo1() {
        
        WebElement element = driver.findElement(By.name("montadora"));
        element.click();
        element.sendKeys("Montadora");
        element = driver.findElement(By.name("modelo"));
        element.click();
        element.sendKeys("Modelo");
        element = driver.findElement(By.name("cilindradas"));
        element.click();
        element.sendKeys("2.0");
        element = driver.findElement(By.id("botao"));
        element.click();
        element = driver.findElement(By.name("total"));
        element.click();
        element.sendKeys("abcde");
        element = driver.findElement(By.name("preco"));
        element.click();
        element.sendKeys("abcde");
        element = driver.findElement(By.name("consumo"));
        element.click();
        element.sendKeys("abcde");
         element = driver.findElement(By.id("calculate"));
        element.click();
       
        boolean FOI = false;
        if("http://localhost:8080/65TES_GiovanniJakubiak_DouglasBussmann/computador".equals(driver.getCurrentUrl())){
            FOI = true;
        }
        assertFalse(FOI);
    }    
}

