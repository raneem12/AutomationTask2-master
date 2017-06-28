import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Raneem on 23/06/2017.
 */
    @XmlRootElement(name = "setText")
    @XmlAccessorType(XmlAccessType.FIELD)
    public class SetText
    {
        @XmlAttribute(name = "name")
        private String name;
        @XmlAttribute(name = "value")
        private String value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

