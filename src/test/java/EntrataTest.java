import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class EntrataTest 
{

	WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test(priority = 1)
    public void navigateToHomePage() {
        // Navigate to the website
        driver.get("https://www.entrata.com");

        // Assert the title of the page
        String expectedTitle = "Entrata | Property Management Software";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Home page title did not match");
    }
    
    
    @Test(priority = 2)
    public void navigateToProductsPage() {
        driver.get("https://www.entrata.com");

        // Click the 'Products' link
        WebElement productsLink = driver.findElement(By.linkText("Products"));
        productsLink.click();

        // Assert that the title of the product page contains "Products"
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains("Products"), "Products page title did not contain 'Products'");
    }

    
    @Test(priority = 3)
    public void testFormInteraction() {
        driver.get("https://www.entrata.com/contact");

        // Locate the form elements and interact
        WebElement nameField = driver.findElement(By.name("your-name"));
        nameField.sendKeys("John Doe");

        // Assert that the text was entered correctly
        Assert.assertEquals(nameField.getAttribute("value"), "John Doe", "Name field value did not match");
    }
    
    @Test(priority = 4)
    public void testDynamicContent() {
        driver.get("https://www.entrata.com");

        // Locate the dynamic content, such as Summit
        WebElement dynamicElement = driver.findElement(By.xpath("//section[@class='main-section hp']//a[@class='nav-link last dropdown-menu-text---brix w-nav-link'][normalize-space()='Summit']")); // Use actual ID

        // Assert that the dynamic content is displayed
        Assert.assertTrue(dynamicElement.isDisplayed(), "Dynamic content was not displayed as expected");
    }
    
    
    
    @AfterMethod
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
