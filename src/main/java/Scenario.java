import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Created by rzzayed on 6/22/17.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "senario")
public class Scenario {
    @XmlElement(name = "test-case")
    private ArrayList<TestCase> testCases;


    public ArrayList<TestCase> getTestCases() {
        return testCases;
    }

    public void setTestCases(ArrayList<TestCase> testCases) {
        this.testCases = testCases;
    }
}
