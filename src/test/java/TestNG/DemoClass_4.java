package TestNG;

import org.testng.annotations.Test;

public class DemoClass_4 {

    @Test //Anotación de librería TestNG
    public void webHomeCar(){
        System.out.println("Web Home Car");
    }

    @Test(groups = {"Smoke"})
    public void mobileHomeCar(){
        System.out.println("Mobile Home Car");
    }
    @Test
    public void APIHomeCar(){
        System.out.println("API Home Car");
    }

}
