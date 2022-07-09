package pages;


import com.qmetry.qaf.automation.testng.report.Report;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
//import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.WebElement;

import com.qmetry.qaf.automation.core.MessageTypes;
import utility.utility;

public class appLaunchPage extends basePage{
    utility Utility = new utility();

    @FindBy(locator="common.loc")
    private QAFWebElement loc;
    public void verifyAppLaunch(){
        Reporter.logWithScreenShot("launched", MessageTypes.Pass);
       try {
           addtion_of_two_number();
           Reporter.logWithScreenShot("calculation done", MessageTypes.Pass);
       }catch (Exception e){
           Reporter.logWithScreenShot("calculation failed", MessageTypes.Fail);
       }
    }

    public void addtion_of_two_number()
    {
        Utility.tapOnText("2");
        Utility.tapOnText("+");
        Utility.tapOnText("3");
        Utility.tapOnText("=");
    }
}
