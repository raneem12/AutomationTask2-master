import org.openqa.selenium.WebDriver;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Raneem on 27/06/2017.
 */
@XmlRootElement(name = "validate-text")
@XmlAccessorType(XmlAccessType.FIELD)
public class ValidateText extends Item {

    @XmlAttribute(name = "value")
    private  String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public static void validate(WebDriver driver,String value)
    {
if (driver.getPageSource().contains(value)){
    System.out.println("yes");
}
else System.out.println("faill");
    }


}
