import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Raneem on 26/06/2017.
 */
@XmlRootElement(name = "click-link")
@XmlAccessorType(XmlAccessType.FIELD)
public class ClickLink extends Item {
    @XmlAttribute(name ="name")
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
