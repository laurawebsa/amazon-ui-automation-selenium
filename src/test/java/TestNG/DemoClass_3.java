package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DemoClass_3 {
@BeforeClass
public void bfClass(){
    System.out.println("Before executing any method in the class");
}

    @Test //Anotación de librería TestNG
    public void webLoginCar(){
        System.out.println("Web Login Car");
    }

    @BeforeMethod
    public void bfMethod(){
        System.out.println("I will execute before every test method in class 3");
    }

    @AfterMethod
    public void afMethod(){
        System.out.println("I will execute after every test method in class 3");
    }

    @AfterClass
    public void afClass() {
        System.out.println("After executing any method in the class");
    }

    @Test(groups = {"Smoke"})
    public void mobileLoginCar(){
        System.out.println("Mobile Login Car");
    }

    @BeforeSuite
    public void bfSuite(){
        System.out.println("I am number 1");
    }
    @Test
    public void mobileSignInCar(){
        System.out.println("Mobile Sign in Car");
    }
    @Test
    public void mobileSingOutCar(){
        System.out.println("Mobile Sign out Car");
    }
    //este bloque depende de webLoginCar método, entonces se ejecuta primero este método y luego
    //si el método APILoginCar
    @Test(dependsOnMethods = {"webLoginCar"})
    public void APILoginCar(){
        System.out.println("API Login Car");
    }

}
