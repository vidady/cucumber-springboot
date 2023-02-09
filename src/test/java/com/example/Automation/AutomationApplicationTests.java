package com.example.Automation;

import com.example.Automation.pages.MainPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AutomationApplicationTests {

	@Autowired
	private MainPage mainPage;

	@Test
	void testLogin() {
	mainPage.PerformLogin();
	}

}
