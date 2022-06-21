package objectpage;

import org.openqa.selenium.WebDriver;


public class Objectmanager {
	
	public Loginobject loginPage;
	public Formobjects practiceForm;
	public multipledataobject mobject;
	
	public WebDriver driver;

	public Objectmanager(WebDriver driver) {
		this.driver = driver;
	}

	public Loginobject getLoginPage() {
		loginPage = new Loginobject(driver);
		return loginPage;
	}

	public Formobjects getPracticeForm() {
		practiceForm = new Formobjects(driver);
		return practiceForm;
	}
	public multipledataobject errormessagedisplay()
	{
		return mobject=new multipledataobject(driver);
	}

	
}
