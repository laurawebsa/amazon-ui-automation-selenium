package TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoClass_2 {

    @Test(groups = {"Smoke"})    //Anotación de librería TestNG
    public void pLoan() {
        System.out.println("good");
    }

    @BeforeTest
    public void  prerequiste(){
        System.out.println("I will execute first");
    }
}
