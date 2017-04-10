package kfs_Scripts;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Login_page {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     FirefoxDriver driver;
     driver =new FirefoxDriver();
     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
     driver.get("http://www.embteltestdomain.com/");
     driver.findElement(By.xpath("/html/body/form/div[2]/div[1]/div[3]/div/div[1]/div[1]/a[1]")).click();
     driver.findElement(By.id("ctl01_uxPlaceHolder_uxLogin_UserName"));
     driver.findElement(By.id("ctl01_uxPlaceHolder_uxLogin_Password"));
     driver.findElement(By.id("ctl01_uxPlaceHolder_uxLogin_uxLoginImageButton")).click();
     driver.findElement(By.id("ctl01_uxHeader_uxHeaderLogin_uxLoginView_uxLoginStatus")).click();
     driver.close();
     
     
     
		
	}

}
