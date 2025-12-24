package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoClass_4 {

    @Parameters({"URL"})
    @Test //Anotación de librería TestNG
    public void webHomeCar(String uName){
        System.out.println("Web Home Car");
        System.out.println(uName);
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
