package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteItemTest {

	WebDriver driver;
	
//	@Given("the browser is open for deleting an item from the cart")
//	public void the_browser_is_open_for_deleting_an_item_from_the_cart() {
//		System.setProperty("webdriver.chrome.driver", "c:\\Data\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize(); 
//	}
//
//	@Given("the User navigates to the Google search page for TJMaxx")
//	public void the_user_navigates_to_the_google_search_page_for_tj_maxx() {
//		driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TewNE8yLlZgNGB0YPBiK8nKTayoAABBwAYF&q=tjmaxx&oq=TjMax&gs_lcrp=EgZjaHJvbWUqFQgBEC4YJxjHARjJAxjRAxiABBiKBTIPCAAQIxgnGOMCGIAEGIoFMhUIARAuGCcYxwEYyQMY0QMYgAQYigUyBggCEEUYOTIKCAMQABiSAxiABDIGCAQQRRg8MgYIBRBFGDwyBggGEEUYPDIGCAcQRRg80gEIMzA0OGowajGoAgCwAgA&sourceid=chrome&ie=UTF-8");
//	}
//
//	@When("the User clicks on the TJMaxx link from the search results")
//	public void the_user_clicks_on_the_tj_maxx_link_from_the_search_results() {
//	    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
//	}
//
//	@Then("the User goes to the TJMaxx home page")
//	public void the_user_goes_to_the_tj_maxx_home_page() {
//	    driver.get("https://tjmaxx.tjx.com/store/index.jsp");
//	}
//
//	@When("the User clicks on the cart icon")
//	public void the_user_clicks_on_the_cart_icon() {
//		driver.findElement(By.id("cart-total")).click();
//	}
//
//	@When("the User clicks on the My Bag link")
//	public void the_user_clicks_on_the_my_bag_link() {
//        driver.findElement(By.linkText("My Bag")).click();
//	}
//
//	@Then("the User goes to the cart page")
//	public void the_user_goes_to_the_cart_page() {
//        driver.get("https://tjmaxx.tjx.com/store/checkout/cart.jsp");
//	}
//
//	@When("the User tries to remove an item from the cart")
//	public void the_user_tries_to_remove_an_item_from_the_cart() {
//		if (driver.findElements(By.linkText("Remove")).size() > 0) {
//            driver.findElement(By.linkText("Remove")).click();
//        } else {
//            System.out.println("Cart is empty");
//        }
//	}
//
//	@Then("the User should see a confirmation or a message if the cart is empty")
//	public void the_user_should_see_a_confirmation_or_a_message_if_the_cart_is_empty() {
//		if (driver.findElements(By.linkText("Remove")).size() > 0) {
//            System.out.println("Item removed successfully");
//        } else {
//            System.out.println("Cart is empty");
//        }
//        driver.quit();
//	}

	
	@Given("the browser is open for deleting an item from the cart")
	public void the_browser_is_open_for_deleting_an_item_from_the_cart() {
		System.setProperty("webdriver.chrome.driver", "c:\\Data\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
	}

	@Given("the User navigates to the Google search page for TJMaxx")
	public void the_user_navigates_to_the_google_search_page_for_tj_maxx() {
	    driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TewNE8yLlZgNGB0YPBiK8nKTayoAABBwAYF&q=tjmaxx&oq=Tjmax&gs_lcrp=EgZjaHJvbWUqFQgBEC4YJxjHARjJAxjRAxiABBiKBTIGCAAQRRg8MhUIARAuGCcYxwEYyQMY0QMYgAQYigUyBggCEEUYOTIKCAMQABiSAxiABDIGCAQQRRg8MgYIBRBFGDwyBggGEEUYPDIGCAcQRRg80gEIMzQyMWowajGoAgCwAgA&sourceid=chrome&ie=UTF-8");

	}

	@When("the User clicks on the TJMaxx link from the search results")
	public void the_user_clicks_on_the_tj_maxx_link_from_the_search_results() {
	    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();

	}

	@Then("the user is on the TJ Maxx homepage")
	public void the_user_is_on_the_tj_maxx_homepage() {
	    driver.get("https://tjmaxx.tjx.com/store/index.jsp");
	}

	@When("the user searches for {string}")
	public void the_user_searches_for(String string) {
		WebDriverWait wait=new WebDriverWait(driver, 60);  //60 sec
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search-text-input")));
	    driver.findElement(By.id("search-text-input")).click();
	    driver.findElement(By.id("search-text-input")).sendKeys("white lamp");
	}

	@When("the user clicks on the search button")
	public void the_user_clicks_on_the_search_button() {
		driver.findElement(By.id("search-submit-button")).click();
	      
	}

	@When("the user scrolls down by {int} pixels")
	public void the_user_scrolls_down_by_pixels(Integer int1) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,400)", "");
	}

	@When("the user selects the {string}")
	public void the_user_selects_the(String string) {
		driver.findElement(By.xpath("//img[@alt='Scalloped Table Lamp']")).click();
	}

	@When("the user adds the item to the order")
	public void the_user_adds_the_item_to_the_order() {
		WebDriverWait wait1=new WebDriverWait(driver, 60);  //60 sec
	    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("addItemToOrder")));
	    driver.findElement(By.id("addItemToOrder")).click();
	}

	@Then("the user should see the {string} link")
	public void the_user_should_see_the_link(String string) {
		WebDriverWait wait2=new WebDriverWait(driver, 60);  //20 sec
	    wait2.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("VIEW BAG")));
	}

	@When("the user clicks on the {string} link")
	public void the_user_clicks_on_the_link(String string) {
		driver.findElement(By.linkText("VIEW BAG")).click();
	}
	
	@When("the user clicks on the {string} link to remove item")
	public void the_user_clicks_on_the_links_to_remove_item(String string) {
		WebDriverWait wait3=new WebDriverWait(driver, 60);  //20 sec
	    wait3.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Remove")));
	    driver.findElement(By.linkText("Remove")).click();
	}

	@Then("the item should be removed from the shopping bag")
	public void the_item_should_be_removed_from_the_shopping_bag() {
	    driver.close();
	}


}
