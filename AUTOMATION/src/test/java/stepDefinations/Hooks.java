package stepDefinations;

import io.cucumber.java.Before;

public class Hooks {
	@Before("@MobileTest")
	public void beforeMobileTest(){
		System.out.println("ttttttttt");
	}

}
