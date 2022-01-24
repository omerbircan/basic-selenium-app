package amazon_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class amazon_test {
	
	@Test  
	  public void tests()  throws InterruptedException
	  {  
		String alert;
		String alert1;
		
		System.setProperty("webdriver.chrome.driver","C:\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com.tr");
		
		Thread.sleep(1000);
		driver.findElement(By.id("nav-link-accountList")).click();
		 alert = driver.findElement(By.className("a-form-label")).getText();
		 Assert.assertEquals(alert, "E-posta adresi veya telefon numarası");
		
		 Thread.sleep(1000);
		driver.findElement(By.id("auth-create-account-link")).click();
		alert1 = driver.findElement(By.className("a-spacing-small")).getText();
		Assert.assertEquals(alert1, "Hesap oluşturun");
		
		Thread.sleep(1000);
		driver.findElement(By.id("continue")).click();
		alert = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form["
				+ "1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).getText();
		Assert.assertEquals(alert, "Adınızı girin");
		
		
		driver.findElement(By.id("ap_customer_name")).sendKeys("omer");
		driver.findElement(By.id("ap_email")).sendKeys("123qweasd@asdfas.com");
		driver.findElement(By.id("ap_password")).sendKeys("1234");
		driver.findElement(By.id("ap_password_check")).sendKeys("12345");
		driver.findElement(By.id("continue")).click();
		alert = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div"
				+ "[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]")).getText();
		Assert.assertEquals(alert, "Şifreler eşleşmiyor");
		
		Thread.sleep(1000);
		driver.findElement(By.className("a-link-emphasis")).click();
		driver.findElement(By.id("ap_email")).sendKeys("1234");
		driver.findElement(By.id("continue")).click();
		alert = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/di"
				+ "v[1]/div[1]/div[1]/div[1]/h4[1]")).getText();
		Assert.assertEquals(alert, "Yanlış telefon numarası");
		
		Thread.sleep(1000);
		driver.findElement(By.id("ap_email")).clear();
		driver.findElement(By.id("ap_email")).sendKeys("5075741334");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("1234");
		driver.findElement(By.id("signInSubmit")).click();
		alert = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div["
				+ "1]/div[1]/div[1]/ul[1]/li[1]/span[1]")).getText();
		Assert.assertEquals(alert, "Şifreniz yanlış");
		
		Thread.sleep(1000);
		driver.findElement(By.id("ap_password")).sendKeys("********");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("nav-link-accountList")).click();
		alert = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/h1[1]")).getText();
		Assert.assertEquals(alert, "Hesabım");
		
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ethernet kablosu");
		driver.findElement(By.id("nav-search-submit-button")).click();
		alert = driver.findElement(By.xpath("//span[contains(text(),'Ethernet Kabloları')]")).getText();
		Assert.assertEquals(alert, "Ethernet Kabloları");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Alfais 4216 Cat6 Ethernet Patch İnternet Kablosu, ')]")).click();
		alert = driver.findElement(By.id("productTitle")).getText();
		Assert.assertEquals(alert, "Alfais 4216 Cat6 Ethernet Patch İnternet Kablosu, 5 m");
		
		
		driver.findElement(By.id("imgTagWrapperId")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ivImage_1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ivImage_2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ivImage_3")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ivImage_4")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ivImage_5")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ivImage_6")).click();
		Thread.sleep(1000);;
		driver.navigate().refresh();
		driver.findElement(By.id("add-to-cart-button")).click();
		alert = driver.findElement(By.id("huc-v2-order-row-confirm-text")).getText();
		Assert.assertEquals(alert, "Sepete Eklendi");
		
		driver.findElement(By.id("hlb-view-cart-announce")).click();
		alert = driver.findElement(By.xpath("//h1[contains(text(),'Alışveriş Sepeti')]")).getText();
		Assert.assertEquals(alert, "Alışveriş Sepeti");
		
		Thread.sleep(1000);
		driver.findElement(By.id("sc-buy-box-ptc-button")).click();
		alert = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/h1[1]")).getText();
		Assert.assertEquals(alert, "Ödeme");
		
		
		driver.findElement(By.id("submitOrderButtonId")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("nav-orders")).click();
		driver.findElement(By.id("a-autoid-3-announce")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Tüm güncellemeleri göster')]")).click();
		Thread.sleep(3000);
		driver.close();
		
	  }  
	}

