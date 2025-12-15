package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DemoClass_1 {

    @AfterTest
    public void lastExecution(){
        System.out.println("I will execute last");
    }

    @Test //Anotación de librería TestNG
    public void demo(){
        System.out.println("hello");
    }

    @AfterSuite
    public void afSuite(){
        System.out.println("I am # 1 from last");
    }

    @Test
    public void secondTest(){
        System.out.println("bye");
    }
}
