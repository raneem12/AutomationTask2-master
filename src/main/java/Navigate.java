import javax.xml.bind.annotation.*;

/**
 * Created by Raneem on 27/06/2017.
 */
@XmlRootElement(name = "navigate")
@XmlAccessorType(XmlAccessType.FIELD)
public class Navigate extends Item
{
    @XmlAttribute(name ="url")
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}
