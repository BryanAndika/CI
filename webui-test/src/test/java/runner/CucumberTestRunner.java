package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:build/cucumber-html-reports"}, //berisi plugin yang akan dipakai
            glue = {"stepdef"}, //lokasi file stepdef
            features = {"src/test/resources/features"} //lokasi file .feature

)


public class CucumberTestRunner {



}
