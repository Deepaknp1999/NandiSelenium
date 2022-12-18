
  package utilsclass;
  
  import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
  
  public class Genericutils {
  
  public static WebDriver driver;
  
  public Genericutils(WebDriver driver) {
	  this.driver=driver;
	  }
  
  

public Genericutils() {
	// TODO Auto-generated constructor stub
}



public void switchToWindow(){
	  System.out.println("Test");
	  }
  public void alertmessage()
  {
	  Alert alert = driver.switchTo().alert();
		alert.accept();
		
  }
  
  }
 