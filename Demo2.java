import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		//Launch browser
		System.setProperty("webdriver.chrome.driver",
				"C://Users//Mulsan IT//Downloads//SoftwareApplications//chromedriver-win64//chromedriver-win64//chromedriver.exe");
	
		//open URL
		WebDriver driver = new ChromeDriver();
		driver.get("https://ceomadhyapradesh.nic.in/VL.aspx");
		System.out.println("URL open successfully");
	driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement district = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_ddlDist\"]"));
		
		Select sc2 = new Select(district);
		
		sc2.selectByIndex(3);
		System.out.println("3rd dist selected");
		
		WebElement w = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_ddlAC\"]"));
		
		Select sc1 = new Select(w); 
		List<WebElement> li = sc1.getOptions();
		
		   int size = li.size();
		   System.out.println(size);
			//for select district
		for (int i = 0; i <= size; i++)
		{ 
			try {
			
			sc1=new Select(w);
		System.out.println("enter into for loop");
			 String options = li.get(i).getText();
//			 li.get(i).click();
			 sc1.selectByIndex(i);
	         System.out.println(options);
				Thread.sleep(5000);
				System.out.println(i + "selected");
				Thread.sleep(5000);
			} catch (Exception e) {
				sc1=new Select(w);
				System.out.println("enter into for loop");
					 String options = li.get(i).getText();
//					 li.get(i).click();
					 sc1.selectByIndex(i);
			         System.out.println(options);
						Thread.sleep(5000);
						System.out.println(i + "selected");
						Thread.sleep(5000);
			}
		
			
	}

}
}
