package stepdef;

import helper.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {

    @Before
    public static void setDriver(){
        Utility.startWebDriver();
    }

    @After
    public static void quitDriver(){
        Utility.quitDriver();
    }

}
