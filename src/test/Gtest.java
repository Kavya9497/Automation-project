package test;

import org.testng.annotations.Test;

import base.Baseclass1;
import pages.Gloginpage;

public class Gtest extends Baseclass1 {
	@Test
	public void testing() throws InterruptedException
	{
		Gloginpage ob =new Gloginpage(driver1);
		ob.header();
		ob.Setvalues("sreerajsree6666@gmail.com","UC9xquNYBa");
		ob.submit();
		ob.categorydropdown();
		Thread.sleep(3000);
		ob.kurthis();
		Thread.sleep(3000);
		ob.cotton();
		Thread.sleep(6000);
		ob.product();
		Thread.sleep(6000);
		ob.selectsize();
		Thread.sleep(3000);
		ob.cart();
		Thread.sleep(3000);
		ob.cart1();
		Thread.sleep(3000);
		ob.checkout();
		Thread.sleep(3000);
	   
	}

}



