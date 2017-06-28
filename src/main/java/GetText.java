import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by rzzayed on 6/22/17.
 */
@XmlRootElement(name = "getText")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetText extends Item{

    @XmlAttribute(name = "id")
    private String id;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @XmlAttribute(name = "key")
    private String key;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
