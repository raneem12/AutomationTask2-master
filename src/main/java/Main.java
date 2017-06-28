import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rzzayed on 6/21/17.
 */
public class Main {
    private static WebDriver driver;

    public static void main(String[] args) throws JAXBException, FileNotFoundException {
         Map<String,String> hashMap = new HashMap<String, String>();
        ChromeDriverManager.getInstance().setup();

        driver = DriverManager.get().newInstance(DriversInfo.CHROME);
        //String baserl = "http://demo.guru99.com/";



        JAXBContext context = JAXBContext.newInstance(Scenario.class);
        Unmarshaller um = context.createUnmarshaller();
        Scenario scenario = (Scenario) um.unmarshal(new FileReader("regNew.xml"));

        for (TestCase testCase : scenario.getTestCases()) {
            
            ArrayList<Item> items = testCase.getItems();
            for (Item item : items) {
                if (item instanceof Navigate){
                    driver.get(((Navigate) item).getUrl());
                }
                else if (item instanceof Form) {

                    for (Param param : ((Form) item).getParams()) {
                        if (param.getType().equals("getFromTestCase"))
                        DriverUtils.findElementByAll(driver, param.getId()).sendKeys(hashMap.get(param.getValue()));
                        else if (param.getType().equals("fillFromKeyboard"))
                            DriverUtils.findElementByAll(driver, param.getId()).sendKeys(param.getValue());
                        else if (param.getType().equals("radio"))
                            DriverUtils.findElementByAll(driver, param.getId()).click();
                        else if (param.getType().equals("dropdown")) {
                            Select drpAccount = new Select( DriverUtils.findElementByAll(driver, param.getId()));
                            drpAccount.selectByValue(param.getValue());
                        }
                    }

                    DriverUtils.findElementByAll(driver, ((Form) item).getFormName()).submit();
                    //driver.findElement(By.name("btnLogin")).click();
                } else if (item instanceof GetText) {
                    hashMap.put(((GetText) item).getKey(),DriverUtils.findElementByAll(driver, ((GetText) item).getId()).getText());
                }
                else if (item instanceof ClickLink) {
                    DriverUtils.findElementByAll(driver, ((ClickLink) item).getName()).click();
                }
                else if (item instanceof AlertAcceptAction){
                    AlertAcceptAction.AcceptAlert(driver);
                }
                else if (item instanceof ValidateText){
                    System.out.println("hello");
                    ValidateText.validate(driver,((ValidateText) item).getValue());
                }
                else System.out.println("no");
            }
        }
    }
}
