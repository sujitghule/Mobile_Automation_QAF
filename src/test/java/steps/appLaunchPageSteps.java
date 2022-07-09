package steps;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import io.cucumber.java.en.When;
import pages.appLaunchPage;
import io.cucumber.java.en.Given;

@QAFTestStepProvider
public class appLaunchPageSteps {
    appLaunchPage page = new appLaunchPage();

    @Given("app open successfully")
    public void app_open_successfully(){
        try {
            page.verifyAppLaunch();
        }catch (Exception e){
            System.out.println("Message:"+e.getMessage());
            System.out.println("cause:"+e.getCause());
            System.out.println("Trace:"+e.getStackTrace());
        }
    }

}
