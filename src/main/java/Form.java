import javax.xml.bind.annotation.*;
import java.util.ArrayList;

/**
 * Created by rzzayed on 6/21/17.
 */
@XmlRootElement(name = "form")
@XmlAccessorType(XmlAccessType.FIELD)
public class Form extends Item
{

    @XmlAttribute(name ="name")
    private  String formName;

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    @XmlElement(name = "param")
    private ArrayList<Param>params;
    @XmlElement(name = "setText")
    private ArrayList<SetText>setTexts;

    public ArrayList<Param> getParams() {
        return params;
    }

    public void setParams(ArrayList<Param> params) {
        this.params = params;
    }
}
