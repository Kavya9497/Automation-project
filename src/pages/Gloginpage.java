package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Gloginpage {
    WebDriver driver1;
	
	By Glogin=By.xpath("//a[@href='https://glitzindia.in/login']");
	By Gemail=By.name("login");
	By Gpassword=By.name("password");
	By Gsubmit=By.xpath("//button[@class='btn btn-primary log-btn']");
	By Gcategorydropdown =By.xpath("//a[@class='nav-link dropdown-toggle ps-lg-0']");
	By Gkurthis=By.xpath("//a[@href='https://glitzindia.in/shop-by-category/kurtis']");
	By Gcotton=By.xpath("//a[@href='https://glitzindia.in/category/cotton-36']");
	By Gproduct=By.xpath("//*[@id=\"resProduct\"]/div[22]/div/div[2]/h3/a");
	By size=By.xpath("//*[@id=\"general\"]/div/div[2]/div/div[4]/div/div[4]/label");
	By addcart=By.id("btn-cart-add");
    By Gcart =By.xpath("//i[@class='nav__cart-icon navbar-tool-icon fas fa-shopping-cart lh22']");
	By Gcheckout =By.xpath("//*[@id=\"navbarsticky\"]/div[1]/div/div[2]/div/div/div/a");
	
	public Gloginpage(WebDriver driver1) {
		// TODO Auto-generated constructor stub
		this.driver1=driver1;
	}
	public void header()
	{
	driver1.findElement(Glogin).click();
	}
	public void Setvalues(String username,String password)
	{
		driver1.findElement(Gemail).sendKeys(username);
		driver1.findElement(Gpassword).sendKeys(password);
	
	}
	public void submit()
	{
		driver1.findElement(Gsubmit).click();
	}
	public void categorydropdown()
	{
		driver1.findElement(Gcategorydropdown).click();
	}
	public void kurthis()
	{
		driver1.findElement(Gkurthis).click();
	}
	public void cotton()
	{
		driver1.findElement(Gcotton).click();
	}
	public void product()
	{
		driver1.findElement(Gproduct).click();
	}
	public void selectsize()
	{
		driver1.findElement(size).click();
		
		
	}
	public void cart()
	{
		driver1.findElement(addcart).click();
	}
	public void cart1()
	{
		driver1.findElement(Gcart).click();
		
	}
	public void checkout()
	{
		driver1.findElement(Gcheckout).click();
	}


}
