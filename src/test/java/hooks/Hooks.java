package hooks;

import com.codeborne.selenide.Selenide;
import io.cucumber.core.backend.TestCaseState;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.plugin.event.Result;
import io.cucumber.plugin.event.Status;
import io.qameta.allure.Allure;
import utils.Logger;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.*;

public class Hooks {

    private static final String BASE_URL = "https://www.agoda.com/ru-ru/";

    @Before
    public void openBrowser(Scenario scenario) {
        Logger.info("===============================================");
        Logger.info("===============================================");
        Logger.info(String.format("Start scenario '%s'", scenario.getName()));
        Logger.info("===============================================");
        Logger.info("===============================================");
        Logger.info(String.format("Open: %s", BASE_URL));
        //        Configuration.remote = "http://chrome-grid:4444";
        open(BASE_URL);
        getWebDriver().manage().window().maximize();
    }

    @After
    public void afterScenario(Scenario scenario) throws NoSuchFieldException, IllegalAccessException, FileNotFoundException {
        if (scenario.isFailed()) {
            Field delegateField = scenario.getClass().getDeclaredField("delegate");
            delegateField.setAccessible(true);
            TestCaseState testCaseState = (TestCaseState) delegateField.get(scenario);

            Field stepResultsField = testCaseState.getClass().getDeclaredField("stepResults");
            stepResultsField.setAccessible(true);
            ArrayList<Result> stepResults = (ArrayList<Result>) stepResultsField.get(testCaseState);

            for (Result result : stepResults) {
                if (result.getStatus().is(Status.FAILED)) {
                    Logger.error("Scenario failed: " + result.getError().getMessage());
                }
            }
            final String name = String.format("Screenshot_%s", scenario.getName());

            String screenshotFilePath = Selenide.screenshot(name);

            File screenshotFile = new File(screenshotFilePath);
            InputStream fileInputStream = new DataInputStream(new FileInputStream(screenshotFile));

            Allure.addAttachment(name, fileInputStream);

        }
        clearBrowserCache();
        closeWindow();
    }
}



