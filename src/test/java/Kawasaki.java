import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Kawasaki 
{

	@Test
	public void launch()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.kawasaki-india.com/");
		Reporter.log("Baja Launched",true);
		
		Reporter.log("srushti added extra need to sync fork",true);
	}

}
