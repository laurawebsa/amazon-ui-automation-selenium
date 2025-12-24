package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoClass_3 {
@BeforeClass
public void bfClass(){
    System.out.println("Before executing any method in the class");
}
    @Parameters({"URL"})
    @Test //Anotación de librería TestNG
    public void webLoginCar(String urlName){
        System.out.println("Web Login Car");
        System.out.println(urlName);
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
    @Test(dataProvider = "getData")
    public void mobileSingOutCar(String username, String password){
        System.out.println("Mobile Sign out Car");
        System.out.println(username);
        System.out.println(password);
    }
    //este bloque depende de webLoginCar método, entonces se ejecuta primero este método y luego
    //si el método APILoginCar
    @Test(dependsOnMethods = {"webLoginCar"})
    public void APILoginCar(){
        System.out.println("API Login Car");
    }

    @DataProvider
    public Object[][] getData(){
    //1st combination - username password - good credit history - row
    //2nd - username password - no credit history
    //3rd - fraudulent credit history
        Object[][] data = new Object[3][2];
        //1st set
        data[0][0] = "firstusername";
        data[0][1] = "firstpassword";
        //columns in the row are nothing but values for that particular combination(row)

        //2nd set
        data[1][0] = "secondusername";
        data[1][1] = "secondpassword";

        //3rd set
        data[2][0] ="thirdusername";
        data[2][1] ="thirdpassword";
        return data;


    }

}
