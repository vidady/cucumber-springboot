package com.example.Automation;

import com.example.Automation.pages.MainPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@SpringBootTest
public class SpringTestNGTest extends AbstractTestNGSpringContextTests {

    @BeforeSuite(alwaysRun = true)
    @BeforeClass(alwaysRun = true)
    @Override
    public void springTestContextPrepareTestInstance() throws Exception {
        super.springTestContextPrepareTestInstance();
    }

    @Autowired
    private MainPage mainPage;

    @Test
    public void test1(){
     mainPage.PerformLogin();
    }
}
