/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testesSistema;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author giova
 */
public class Teste1 {
      
    private static Selenium selenium;
    
   
    @BeforeClass
    public static void setUpClass() {
        selenium = new DefaultSelenium("localhost" , 4444 , "*googlechrome C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe" , "http://www.google.com");
        selenium.start();
        selenium.windowMaximize();
        selenium.setSpeed("1000");
    }
    
    @AfterClass
    public static void tearDownClass() {
        selenium.stop();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void teste() {
        
    }

   
}


