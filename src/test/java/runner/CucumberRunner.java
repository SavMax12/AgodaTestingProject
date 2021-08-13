package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = { "stepdefs", "hooks"}
)
public class CucumberRunner {

    @AfterClass
    public static void envProps() throws IOException {
        final String filePath = System.getProperty("user.dir") + "/target/allure-results/environment.properties";

        File propsFile = new File(filePath);
        if (propsFile.exists()) {
            propsFile.delete();
        }

        FileOutputStream fos = new FileOutputStream(propsFile);

        Properties properties = new Properties();
        properties.setProperty("browser", "chrome");
        properties.setProperty("url", "https://www.agoda.com/ru-ru/");

        properties.store(fos, "allure runtime props");
    }
}
